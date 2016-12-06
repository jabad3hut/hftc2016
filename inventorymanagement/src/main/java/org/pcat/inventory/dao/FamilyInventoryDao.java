package org.pcat.inventory.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.pcat.inventory.model.FamilyInventory;
import org.pcat.inventory.model.FamilyInventoryDisplayRequest;
import org.springframework.stereotype.Repository;

@Repository
public class FamilyInventoryDao extends BaseDao {

	@Override
	public FamilyInventory getById(int id) {
		final FamilyInventory inventory = (FamilyInventory) super.getById(FamilyInventory.class, id);
		return inventory;
	}

	public List<FamilyInventory> listAll() {
		return (List<FamilyInventory>) super.findAll(FamilyInventory.class);

	}

}
