package org.pcat.inventory.model;

import java.sql.Timestamp;

/**
 * ReturnsArchive entity. @author MyEclipse Persistence Tools
 */

public class ReturnsArchive implements java.io.Serializable {

	// Fields

	private Integer id;
	private String familyId;
	private String productName;
	private String productLocation;
	private Integer quantity;
	private Timestamp returnedDate;

	// Constructors

	/** default constructor */
	public ReturnsArchive() {
	}

	/** minimal constructor */
	public ReturnsArchive(Integer id, String familyId, Timestamp returnedDate) {
		this.id = id;
		this.familyId = familyId;
		this.returnedDate = returnedDate;
	}

	/** full constructor */
	public ReturnsArchive(Integer id, String familyId, String productName, String productLocation, Integer quantity,
			Timestamp returnedDate) {
		this.id = id;
		this.familyId = familyId;
		this.productName = productName;
		this.productLocation = productLocation;
		this.quantity = quantity;
		this.returnedDate = returnedDate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFamilyId() {
		return this.familyId;
	}

	public void setFamilyId(String familyId) {
		this.familyId = familyId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductLocation() {
		return this.productLocation;
	}

	public void setProductLocation(String productLocation) {
		this.productLocation = productLocation;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Timestamp getReturnedDate() {
		return this.returnedDate;
	}

	public void setReturnedDate(Timestamp returnedDate) {
		this.returnedDate = returnedDate;
	}

}