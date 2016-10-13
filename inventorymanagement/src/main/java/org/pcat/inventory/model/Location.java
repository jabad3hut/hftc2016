package org.pcat.inventory.model;

/**
 * Location entity. @author MyEclipse Persistence Tools
 */

public class Location implements java.io.Serializable {

	// Fields

	private Integer id;
	private String locationName;
	private Inventory inventory;

	// Constructors

	/** default constructor */
	public Location() {
	}

	/** minimal constructor */
	public Location(String locationName) {
		this.locationName = locationName;
	}

	/** full constructor */
	public Location(String locationName, Inventory inventory) {
		this.locationName = locationName;
		this.inventory = inventory;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Inventory getInventory() {
		return this.inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

}