package org.pcat.inventory.model;

/**
 * Inventory entity. @author MyEclipse Persistence Tools
 */

public class Inventory implements java.io.Serializable {

	// Fields

	private Integer id;
	private Location location;
	private ProductType productType;
	private Integer totalInventory;
	private Integer reservedInventory;
	private FamilyInventory familyInventory;
	private PendingRequest pendingRequest;

	// Constructors

	/** default constructor */
	public Inventory() {
	}

	/** minimal constructor */
	public Inventory(ProductType productType, Integer totalInventory, Integer reservedInventory) {
		this.productType = productType;
		this.totalInventory = totalInventory;
		this.reservedInventory = reservedInventory;
	}

	/** full constructor */
	public Inventory(Location location, ProductType productType, Integer totalInventory, Integer reservedInventory,
			FamilyInventory familyInventory, PendingRequest pendingRequest) {
		this.location = location;
		this.productType = productType;
		this.totalInventory = totalInventory;
		this.reservedInventory = reservedInventory;
		this.familyInventory = familyInventory;
		this.pendingRequest = pendingRequest;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public ProductType getProductType() {
		return this.productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public Integer getTotalInventory() {
		return this.totalInventory;
	}

	public void setTotalInventory(Integer totalInventory) {
		this.totalInventory = totalInventory;
	}

	public Integer getReservedInventory() {
		return this.reservedInventory;
	}

	public void setReservedInventory(Integer reservedInventory) {
		this.reservedInventory = reservedInventory;
	}

	public FamilyInventory getFamilyInventory() {
		return this.familyInventory;
	}

	public void setFamilyInventory(FamilyInventory familyInventory) {
		this.familyInventory = familyInventory;
	}

	public PendingRequest getPendingRequest() {
		return this.pendingRequest;
	}

	public void setPendingRequest(PendingRequest pendingRequest) {
		this.pendingRequest = pendingRequest;
	}

}