package org.pcat.inventory.model;

import java.util.List;

public class RequestItemsForFamily {
	private String familyId;
	private List<FamilyInventory> inventoryRequests;
	public String getFamilyId() {
		return familyId;
	}
	public void setFamilyId(String familyId) {
		this.familyId = familyId;
	}
	public List<FamilyInventory> getInventoryRequests() {
		return inventoryRequests;
	}
	public void setInventoryRequests(List<FamilyInventory> inventoryRequests) {
		this.inventoryRequests = inventoryRequests;
	}
}
