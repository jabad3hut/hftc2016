package org.pcat.inventory.controller;

import java.util.List;

import org.pcat.inventory.model.ProductType;
import org.pcat.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
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

	@RequestMapping(value = "/testprod", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<ProductType> getProducts() {
		System.out.println("Its in product controller... ");
		List<ProductType> products = productService.getProductDetails();
		return products;
	}

}
