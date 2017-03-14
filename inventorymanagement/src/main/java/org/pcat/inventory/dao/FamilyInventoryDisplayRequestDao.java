package org.pcat.inventory.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.pcat.inventory.model.FamilyInventoryDisplayRequest;
import org.springframework.stereotype.Repository;

@Repository
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

	public List<FamilyInventoryDisplayRequest> findAllForIds(List<Integer> homeVisitorIds) {
		List<FamilyInventoryDisplayRequest> result = null;
		Session session = null;
		try {
			Criteria criteria = getSession().createCriteria(FamilyInventoryDisplayRequest.class);
			criteria.add(Restrictions.in("requestorId", homeVisitorIds));
			result = (List<FamilyInventoryDisplayRequest>) criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return result;
	}
}
