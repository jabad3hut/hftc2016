package org.pcat.inventory.model;

/**
 * Model object to hold all the Item related information.
 * 
 * @author venkat
 *
 */
public class ItemDetail {

	// itemId
	private long id;

	// description
	private String description;

	// totalQuantity
	private long totalQuantity;

	// availableQuantity
	private long availableQuantity;

	// pendingQuantity
	private long pendingQuantity;

	// location
	private String location;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the totalQuantity
	 */
	public long getTotalQuantity() {
		return totalQuantity;
	}

	/**
	 * @param totalQuantity
	 *            the totalQuantity to set
	 */
	public void setTotalQuantity(long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	/**
	 * @return the availableQuantity
	 */
	public long getAvailableQuantity() {
		return availableQuantity;
	}

	/**
	 * @param availableQuantity
	 *            the availableQuantity to set
	 */
	public void setAvailableQuantity(long availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	/**
	 * @return the pendingQuantity
	 */
	public long getPendingQuantity() {
		return pendingQuantity;
	}

	/**
	 * @param pendingQuantity
	 *            the pendingQuantity to set
	 */
	public void setPendingQuantity(long pendingQuantity) {
		this.pendingQuantity = pendingQuantity;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

}