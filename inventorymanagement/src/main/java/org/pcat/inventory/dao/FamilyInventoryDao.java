package org.pcat.inventory.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.pcat.inventory.model.FamilyInventory;
import org.springframework.stereotype.Repository;

@Repository
public class FamilyInventoryDao extends BaseDao {

	@Override
	public FamilyInventory getById(int id) {
		final FamilyInventory inventory = (FamilyInventory) super.getById(FamilyInventory.class, id);
		return inventory;
	}

	public List<FamilyInventory> listAllFamilyInventory() {
		List<FamilyInventory> inventoryList = null;
		try {
			Criteria criteria = getSession().createCriteria(FamilyInventory.class);
			criteria.add(Restrictions.eq("status", "pending"));
			inventoryList = criteria.list();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (getSession() != null && getSession().isOpen()) {
				getSession().close();
			}
		}
		return inventoryList;

	}

}
