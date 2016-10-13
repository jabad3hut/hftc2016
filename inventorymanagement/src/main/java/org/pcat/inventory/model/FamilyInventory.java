package org.pcat.inventory.model;

import java.sql.Timestamp;

/**
 * FamilyInventory entity. @author MyEclipse Persistence Tools
 */

public class FamilyInventory implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Inventory inventory;
	private String familyId;
	private Integer quantity;
	private Timestamp requestedDate;

	// Constructors

	/** default constructor */
	public FamilyInventory() {
	}

	/** minimal constructor */
	public FamilyInventory(String familyId, Integer quantity, Timestamp requestedDate) {
		this.familyId = familyId;
		this.quantity = quantity;
		this.requestedDate = requestedDate;
	}

	/** full constructor */
	public FamilyInventory(Inventory inventory, String familyId, Integer quantity, Timestamp requestedDate) {
		this.inventory = inventory;
		this.familyId = familyId;
		this.quantity = quantity;
		this.requestedDate = requestedDate;
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

}