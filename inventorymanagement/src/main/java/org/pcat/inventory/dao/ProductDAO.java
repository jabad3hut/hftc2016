package org.pcat.inventory.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.pcat.inventory.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void getProductDetails() {
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(ProductType.class);
		List<ProductType> products = criteria.list();

		System.out.println("Products size cja is .... " + products.size());

		Iterator<ProductType> iterator = products.iterator();
		while (iterator.hasNext()) {
			ProductType productType = iterator.next();
			System.out
					.println("product Type form spring boot app are .. ... " + productType.getProductName() + "   " + productType.getProductDesc());
		}
	}

}
