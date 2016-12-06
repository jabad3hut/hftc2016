package org.pcat.inventory.dao;

import java.util.List;

import org.pcat.inventory.model.FamilyInventoryDisplayRequest;

public class FamilyInventoryDisplayRequestDao extends BaseDao {

	@Override
	public FamilyInventoryDisplayRequest getById(int id) {
		final FamilyInventoryDisplayRequest inventory = (FamilyInventoryDisplayRequest) super.getById(
				FamilyInventoryDisplayRequest.class, id);
		return inventory;
	}

	public List<FamilyInventoryDisplayRequest> findAll() {
		return (List<FamilyInventoryDisplayRequest>) super.findAll(FamilyInventoryDisplayRequest.class);
	}

}
