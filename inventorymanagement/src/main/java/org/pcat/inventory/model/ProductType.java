package org.pcat.inventory.model;

import java.util.HashSet;
import java.util.Set;

/**
 * ProductType entity. @author MyEclipse Persistence Tools
 */

public class ProductType implements java.io.Serializable {

	// Fields

	private Integer id;
	private String productName;
	private String productDesc;
	private Set inventories = new HashSet(0);

	// Constructors

	/** default constructor */
	public ProductType() {
	}

	/** minimal constructor */
	public ProductType(String productName) {
		this.productName = productName;
	}

	/** full constructor */
	public ProductType(String productName, String productDesc, Set inventories) {
		this.productName = productName;
		this.productDesc = productDesc;
		this.inventories = inventories;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return this.productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Set getInventories() {
		return this.inventories;
	}

	public void setInventories(Set inventories) {
		this.inventories = inventories;
	}

}