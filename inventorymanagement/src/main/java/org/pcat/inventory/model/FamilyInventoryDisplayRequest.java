package org.pcat.inventory.model;

import java.sql.Timestamp;

import org.springframework.core.style.ToStringCreator;

public class FamilyInventoryDisplayRequest implements FamilyInventory {

	private String requestor;

	private String productName;
	private FamilyInventory familyInventory;
	private String location;

	public FamilyInventoryDisplayRequest() {
		super();
		this.familyInventory = new FamilyInventoryImpl();
	}

	public FamilyInventoryDisplayRequest(Integer id, String familyId, Integer requestorId, String status,
			Integer quantity, Timestamp requestedDate, Integer inventoryId, final String requestor,
			final String location) {
		super();
		FamilyInventory familyInventory = new FamilyInventoryImpl();
		this.setFamilyInventory(familyInventory);
		this.setId(id);
		this.setFamilyId(familyId);
		this.setRequestedDate(requestedDate);
		this.setQuantity(quantity);
		this.setRequestorId(requestorId);
		this.setInventoryId(inventoryId);
		this.setStatus(status);
		this.requestor = requestor;
		this.location = location;
	}

	public String getFamilyId() {
		return familyInventory.getFamilyId();
	}

	public FamilyInventory getFamilyInventory() {
		return familyInventory;
	}

	public Integer getId() {
		return familyInventory.getId();
	}

	public Integer getInventoryId() {
		return familyInventory.getInventoryId();
	}

	public String getLocation() {
		return location;
	}

	public String getProductName() {
		return productName;
	}

	public Integer getQuantity() {
		return familyInventory.getQuantity();
	}

	public Timestamp getRequestedDate() {
		return familyInventory.getRequestedDate();
	}

	public String getRequestor() {
		return requestor;
	}

	public Integer getRequestorId() {
		return familyInventory.getRequestorId();
	}

	public String getStatus() {
		return familyInventory.getStatus();
	}

	public void setFamilyId(String familyId) {
		familyInventory.setFamilyId(familyId);
	}

	public void setFamilyInventory(FamilyInventory familyInventory) {
		this.familyInventory = familyInventory;
	}

	public void setId(Integer id) {
		familyInventory.setId(id);
	}

	public void setInventoryId(Integer inventoryId) {
		familyInventory.setInventoryId(inventoryId);
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setQuantity(Integer quantity) {
		familyInventory.setQuantity(quantity);
	}

	public void setRequestedDate(Timestamp requestedDate) {
		familyInventory.setRequestedDate(requestedDate);
	}

	public void setRequestor(String requestor) {
		this.requestor = requestor;
	}

	public void setRequestorId(Integer requestorId) {
		familyInventory.setRequestorId(requestorId);
	}

	public void setStatus(String status) {
		familyInventory.setStatus(status);
	}

	@Override
	public String toString() {
		ToStringCreator creator = new ToStringCreator(this);
		return creator.append("id", this.getId()).append("family id", this.getFamilyId())
				.append("inventory id", this.getInventoryId()).append("location", this.getLocation())
				.append("product name", this.getProductName()).append("quantity", this.getQuantity())
				.append("requested date", this.getRequestedDate()).append("requestor", this.getRequestor())
				.append("requestor id", this.getRequestorId()).toString();
	}
}
