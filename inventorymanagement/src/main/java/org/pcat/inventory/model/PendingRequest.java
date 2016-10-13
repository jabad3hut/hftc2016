package org.pcat.inventory.model;

import java.sql.Timestamp;

/**
 * PendingRequest entity. @author MyEclipse Persistence Tools
 */

public class PendingRequest implements java.io.Serializable {

	// Fields

	private Integer id;
	private Inventory inventory;
	private Integer userId;
	private Timestamp requestDate;
	private String familyId;

	// Constructors

	/** default constructor */
	public PendingRequest() {
	}

	/** minimal constructor */
	public PendingRequest(Integer userId, Timestamp requestDate, String familyId) {
		this.userId = userId;
		this.requestDate = requestDate;
		this.familyId = familyId;
	}

	/** full constructor */
	public PendingRequest(Inventory inventory, Integer userId, Timestamp requestDate, String familyId) {
		this.inventory = inventory;
		this.userId = userId;
		this.requestDate = requestDate;
		this.familyId = familyId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Inventory getInventory() {
		return this.inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

}