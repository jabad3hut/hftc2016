package org.pcat.inventory.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.time.Instant;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pcat.inventory.TestHelper;
import org.pcat.inventory.dao.FamilyInventoryDao;
import org.pcat.inventory.dao.InventoryDao;
import org.pcat.inventory.model.FamilyInventory;
import org.pcat.inventory.model.FamilyInventoryImpl;
import org.pcat.inventory.model.HomeVisitor;
import org.pcat.inventory.model.Inventory;
import org.pcat.inventory.model.Supervisor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;

public class ApproveFamilyRequestServiceTest {

	private static final Logger logger = LoggerFactory.getLogger(ApproveFamilyRequestServiceTest.class);

	private static TestHelper helper = new TestHelper();

	@BeforeClass
	public static void setup() {
		helper.saveCurrentRootLogging();
		helper.setRootTestLoggerLevel(Level.DEBUG);
	}

	@AfterClass
	public static void tearDown() {
		helper.resetSaveRootLoggerLevel();
	}

	private RequestFamilyItemsService requestFamilyItemsService = new RequestFamilyItemsService();

	@Test
	public void approveFamilyItemRequest() {
		final String familyNumber = "TEST-0001";
		final int familyInventoryId = 22;
		final Integer homeVisitorId = 12;
		final Integer inventoryId = 54;
		final String productName = "Infant Carrier";
		final String productDesc = productName;
		final Integer totalInventory = 20;
		final Integer reservedInventory = 5;
		final String location = "Nashville";
		final int quantity = 1;
		final HomeVisitor homeVisitor = new HomeVisitor(null, "testFirstName", "testLastName",
				"testEmail.pcat@mailinator.com", "supervisorFirst supervisorLast",
				"testSupervisorEmail.pcat@mailinator.com");
		homeVisitor.setId(homeVisitorId);
		final Integer supervisorId = 124;
		final Supervisor supervisor = new Supervisor("testFirstNameSupervisor", "testLastNameSupervisor",
				"testSupervisorEmail.pcat@mailinator.com", "supervisorSupervisorFirst supervisorSupervisorLast",
				"testSupervisorSupervisorEmail.pcat@mailinator.com");
		supervisor.setId(supervisorId);

		UserService mockUserService = mock(UserService.class);
		requestFamilyItemsService.setUserService(mockUserService);

		InventoryDao mockInventoryDao = mock(InventoryDao.class);
		requestFamilyItemsService.setInventoryDao(mockInventoryDao);

		FamilyInventoryDao mockFamilyInventoryDao = mock(FamilyInventoryDao.class);
		requestFamilyItemsService.setFamilyInventoryDao(mockFamilyInventoryDao);

		final MailService ms = mock(MailService.class);
		requestFamilyItemsService.setMailService(ms);

		final InventoryBO invBizObj = mock(InventoryBO.class);
		requestFamilyItemsService.setInventoryBusinessObject(invBizObj);

		final HomeVisitorEmailRequestBO emailUtility = mock(HomeVisitorEmailRequestBO.class);
		requestFamilyItemsService.setRequestUtility(emailUtility);

		FamilyInventory mockFamilyInventory = new FamilyInventoryImpl(familyInventoryId, familyNumber, homeVisitorId,
				"Pending", quantity, new Timestamp(Instant.now().getEpochSecond()), inventoryId);
		Inventory mockInventory = new Inventory(inventoryId, productName, productDesc, totalInventory,
				reservedInventory, location);

		when(mockInventoryDao.getById(inventoryId)).thenReturn(mockInventory);
		when(mockFamilyInventoryDao.getById(familyInventoryId)).thenReturn(mockFamilyInventory);
		when(mockUserService.getHomeVisitor(homeVisitorId)).thenReturn(homeVisitor);

		// get request
		requestFamilyItemsService.approveFamilyItems(supervisor, familyInventoryId);
		assertThat(mockFamilyInventory.getStatus(), equalTo("Approved"));
		assertThat(mockInventory.getReservedInventory(), equalTo(reservedInventory - 1));
		assertThat(mockInventory.getTotalInventory(), equalTo(totalInventory - 1));
		// process request
		// test the process went correctly
		// Change status from pending to approved on the family inventory
		// records
		FamilyInventory familyInventory = new FamilyInventoryImpl();
		familyInventory.setStatus("Approved");
		assertThat(familyInventory.getStatus(), equalTo("Approved"));
		// Change the total count on the inventory minus the requested amount
		// Send email to requestor and supervisor of approval

	}

}
