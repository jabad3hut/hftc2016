package org.pcat.inventory.model;

import java.sql.Timestamp;

/**
 * RequestArchive entity. @author MyEclipse Persistence Tools
 */

public class RequestArchive implements java.io.Serializable {

	// Fields

	private Integer id;
	private String productName;
	private String productLocation;
	private Timestamp requestDate;
	private String familyId;
	private Integer quantity;
	private Timestamp requestedDate;
	private String requestStatus;

	// Constructors

	/** default constructor */
	public RequestArchive() {
	}

	/** minimal constructor */
	public RequestArchive(Integer id, Timestamp requestDate, String familyId, Integer quantity,
			Timestamp requestedDate) {
		this.id = id;
		this.requestDate = requestDate;
		this.familyId = familyId;
		this.quantity = quantity;
		this.requestedDate = requestedDate;
	}

	/** full constructor */
	public RequestArchive(Integer id, String productName, String productLocation, Timestamp requestDate,
			String familyId, Integer quantity, Timestamp requestedDate, String requestStatus) {
		this.id = id;
		this.productName = productName;
		this.productLocation = productLocation;
		this.requestDate = requestDate;
		this.familyId = familyId;
		this.quantity = quantity;
		this.requestedDate = requestedDate;
		this.requestStatus = requestStatus;
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

	public String getProductLocation() {
		return this.productLocation;
	}

	public void setProductLocation(String productLocation) {
		this.productLocation = productLocation;
	}

	public Timestamp getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(Timestamp requestDate) {
		this.requestDate = requestDate;
	}

	public String getFamilyId() {
		return this.familyId;
	}

	public void setFamilyId(String familyId) {
		this.familyId = familyId;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Timestamp getRequestedDate() {
		return this.requestedDate;
	}

	public void setRequestedDate(Timestamp requestedDate) {
		this.requestedDate = requestedDate;
	}

	public String getRequestStatus() {
		return this.requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

}