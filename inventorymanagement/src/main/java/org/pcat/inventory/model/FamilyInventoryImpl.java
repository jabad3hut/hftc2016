package org.pcat.inventory.model;

import java.sql.Timestamp;

import org.springframework.core.style.ToStringCreator;

/**
 * FamilyInventory entity. @author MyEclipse Persistence Tools
 */

public class FamilyInventoryImpl implements java.io.Serializable, FamilyInventory {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Integer requestorId;
	private String familyId;

	private String status;

	private Integer quantity;

	private Timestamp requestedDate;
	private Integer inventoryId;

	public FamilyInventoryImpl() {
		super();
	}

	// Fields
	public FamilyInventoryImpl(Integer id, String familyId, Integer requestorId, String status, Integer quantity,
			Timestamp localDateTime, Integer inventoryId) {
		super();
		this.id = id;
		this.familyId = familyId;
		this.requestorId = requestorId;
		this.status = status;
		this.quantity = quantity;
		this.requestedDate = localDateTime;
		this.inventoryId = inventoryId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof FamilyInventoryImpl)) {
			return false;
		}
		FamilyInventoryImpl other = (FamilyInventoryImpl) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.FamilyInventory#getFamilyId()
	 */
	@Override
	public String getFamilyId() {
		return this.familyId;
	}

	// Property accessors

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.FamilyInventory#getId()
	 */
	@Override
	public Integer getId() {
		return this.id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.FamilyInventory#getInventoryId()
	 */
	@Override
	public Integer getInventoryId() {
		return inventoryId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.FamilyInventory#getQuantity()
	 */
	@Override
	public Integer getQuantity() {
		return this.quantity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.FamilyInventory#getRequestedDate()
	 */
	@Override
	public Timestamp getRequestedDate() {
		return this.requestedDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.FamilyInventory#getRequestorId()
	 */
	@Override
	public Integer getRequestorId() {
		return requestorId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.FamilyInventory#getStatus()
	 */
	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pcat.inventory.model.FamilyInventory#setFamilyId(java.lang.String)
	 */
	@Override
	public void setFamilyId(String familyId) {
		this.familyId = familyId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.FamilyInventory#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.FamilyInventory#setInventoryId(java.lang.
	 * Integer)
	 */
	@Override
	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pcat.inventory.model.FamilyInventory#setQuantity(java.lang.Integer)
	 */
	@Override
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.FamilyInventory#setRequestedDate(java.sql.
	 * Timestamp)
	 */
	@Override
	public void setRequestedDate(Timestamp requestedDate) {
		this.requestedDate = requestedDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.FamilyInventory#setRequestorId(java.lang.
	 * Integer)
	 */
	@Override
	public void setRequestorId(Integer requestorId) {
		this.requestorId = requestorId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.FamilyInventory#setStatus(java.lang.String)
	 */
	@Override
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		ToStringCreator creator = new ToStringCreator(this);
		return creator.append("id", this.getId()).append("family id", this.getFamilyId())
				.append("inventory id", this.getInventoryId()).append("quantity", this.getQuantity())
				.append("requested date", this.getRequestedDate()).append("requestor id", this.getRequestorId())
				.toString();
	}
}