package org.pcat.inventory.controller;

import org.pcat.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	/**
	 * @return the productService
	 */
	public ProductService getProductService() {
		return productService;
	}

	/**
	 * @param productService
	 *            the productService to set
	 */
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value = "/testprod", method = RequestMethod.GET)
	public void getProducts() {
		System.out.println("Its in product controller... ");
		productService.getProductDetails();
	}

}
