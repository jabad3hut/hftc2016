package org.pcat.inventory.service;

import java.util.List;

import org.pcat.inventory.dao.ProductDAO;
import org.pcat.inventory.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductDAO productDAO;

	/**
	 * @return the productDAO
	 */
	public ProductDAO getProductDAO() {
		return productDAO;
	}

	/**
	 * @param productDAO
	 *            the productDAO to set
	 */
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public List<ProductType> getProductDetails() {
		return productDAO.getProductDetails();
	}

}
