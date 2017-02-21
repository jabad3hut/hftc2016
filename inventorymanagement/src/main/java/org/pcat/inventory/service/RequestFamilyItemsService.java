package org.pcat.inventory.service;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

import org.pcat.inventory.dao.FamilyInventoryDao;
import org.pcat.inventory.dao.InventoryDao;
import org.pcat.inventory.model.FamilyInventory;
import org.pcat.inventory.model.FamilyInventoryImpl;
import org.pcat.inventory.model.HomeVisitor;
import org.pcat.inventory.model.Inventory;
import org.pcat.inventory.model.RequestItem;
import org.pcat.inventory.model.RequestState;
import org.pcat.inventory.model.Supervisor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RequestFamilyItemsService {

	private static final Logger logger = LoggerFactory.getLogger(RequestFamilyItemsService.class);
	private static final String APPROVED_MESSAGE = "%s %s approved %d %s to deliver to family %s";
	@Autowired
	private MailService mailService;
	@Autowired
	private HomeVisitorEmailRequestBO requestBO;
	@Autowired
	private InventoryBO inventoryBO;
	@Autowired
	private InventoryDao inventoryDao;
	@Autowired
	private FamilyInventoryDao familyInventoryDao;
	@Autowired
	private UserService userService;

	private FamilyInventory approveFamilyInventory(final Integer requestId) {
		FamilyInventory familyInventory = familyInventoryDao.getById(requestId);

		if (familyInventory == null || !("Pending".equalsIgnoreCase(familyInventory.getStatus()))) {
			throw new RuntimeException("Requested item is unavailable");
		}
		familyInventory.setStatus("Approved");
		familyInventoryDao.saveOrUpdate(familyInventory);
		return familyInventory;
	}

	@Transactional
	public void approveFamilyItems(final Supervisor supervisor, final Integer requestId) {
		logger.debug(String.format("Supervisor %s is approving requestId %d", supervisor, requestId));
		FamilyInventory familyInventory = approveFamilyInventory(requestId);
		Inventory inventory = approveInventory(familyInventory);
		sendApprovalEmail(supervisor, familyInventory, inventory);

	}

	private Inventory approveInventory(FamilyInventory familyInventory) {
		Integer inventoryId = familyInventory.getInventoryId();
		Inventory inventory = inventoryDao.getById(inventoryId);
		if (inventory == null || inventory.getTotalInventory() - inventory.getReservedInventory() < 0) {
			throw new RuntimeException("Inventory amounts are invalid");
		}
		inventory.setReservedInventory(inventory.getReservedInventory() - familyInventory.getQuantity());
		inventory.setTotalInventory(inventory.getTotalInventory() - familyInventory.getQuantity());
		inventoryDao.saveOrUpdate(inventory);
		return inventory;
	}

	private void createFamilyInventory(final RequestItem requestItem, String familyNumber, HomeVisitor homeVisitor) {
		final Timestamp now = new Timestamp(Instant.now().toEpochMilli());
		final Integer inventoryIdToReserve = requestItem.getRequestInventory().getId();
		final int reserveQuantity = requestItem.getQuantity();
		FamilyInventory item = new FamilyInventoryImpl(null, familyNumber, homeVisitor.getId(), "Pending",
				reserveQuantity, now,
				inventoryIdToReserve);
		familyInventoryDao.saveOrUpdate(item);
	}

	public FamilyInventoryDao getFamilyInventoryDao() {
		return familyInventoryDao;
	}

	private void processRequestAndInventories(final List<RequestItem> requestItems) {
		requestItems.forEach(requestItem -> updateInventoryWithRequest(requestItem));
	}

	@Transactional
	public RequestState requestItems(String location, final String familyNumber,
			final List<RequestItem> requestItems, final HomeVisitor homeVisitor) {

		/* get inventory, update inventory */
		processRequestAndInventories(requestItems);
		/* create family inventory records */
		updateFamilyInventory(requestItems, familyNumber, homeVisitor);
		/* send the email to the supervisor */
		sendRequestEmail(location, familyNumber, requestItems, homeVisitor);
		return RequestState.PENDING;
	}

	private void sendApprovalEmail(final Supervisor approvingSupervisor, final FamilyInventory familyInventory,
			final Inventory inventory) {
		HomeVisitor homeVisitor = userService.getHomeVisitor(familyInventory.getRequestorId());

		final String messageBody = String.format(APPROVED_MESSAGE, approvingSupervisor.getFirstName(),
				approvingSupervisor.getLastName(), familyInventory.getQuantity(), inventory.getProductDesc(),
				familyInventory.getFamilyId());
		final String toEmail = homeVisitor.getEmail();
		final String fromEmail = approvingSupervisor.getEmail();
		final String ccEmail = fromEmail;
		final String subject = messageBody;
		mailService.sendMail(fromEmail, toEmail, ccEmail, subject, messageBody);
	}

	private void sendRequestEmail(String location, final String familyNumber,
			final List<RequestItem> requestItems, final HomeVisitor homeVisitor) {
		final List<String> itemDescriptions = inventoryBO.getItemDescriptions(requestItems);
		final String fromEmail = homeVisitor.getEmail();
		final String ccEmail = fromEmail;
		final String supervisorEmail = homeVisitor.getSupervisorEmail();
		final String subject = String.format(HomeVisitorEmailRequestBO.HOME_VISITOR_SUBJECT, location, familyNumber);
		final String firstName = homeVisitor.getFirstName();
		final String lastname = homeVisitor.getLastName();
		final String messageBody = requestBO.getMessageBody(location, firstName, lastname, itemDescriptions);
		mailService.sendMail(fromEmail, supervisorEmail, ccEmail, subject, messageBody);
	}

	public void setFamilyInventoryDao(FamilyInventoryDao familyInventoryDao) {
		this.familyInventoryDao = familyInventoryDao;
	}

	public void setInventoryBusinessObject(InventoryBO inventoryBO) {
		this.inventoryBO = inventoryBO;
	}

	public void setInventoryDao(InventoryDao inventoryDao) {
		this.inventoryDao = inventoryDao;
	}

	public void setMailService(MailService mailService) {
		this.mailService = mailService;
	}

	public void setRequestUtility(HomeVisitorEmailRequestBO requestBO) {
		this.requestBO = requestBO;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	private void updateFamilyInventory(final Iterable<RequestItem> requestItems, String familyNumber,
			HomeVisitor homeVisitor) {
		requestItems.forEach(requestItem -> createFamilyInventory(requestItem, familyNumber, homeVisitor));

	}

	private void updateInventoryWithRequest(RequestItem requestItem) {
		Inventory inventory = inventoryDao.getById(requestItem.getId());
		final Integer totalInventory = inventory.getTotalInventory();
		Integer reservedInventory = inventory.getReservedInventory();
		final int requestQuantity = requestItem.getQuantity();
		if (totalInventory > reservedInventory + requestQuantity) {
			inventory.setReservedInventory(reservedInventory + requestQuantity);
			inventoryDao.saveOrUpdate(inventory);
		} else {
			throw new RuntimeException(String.format(
					"Request qty of %d plus already reserved qty of %d is greater than the available qty of %d",
					reservedInventory, requestQuantity, totalInventory));
		}
		requestItem.setRequestInventory(inventory);
	}

}
