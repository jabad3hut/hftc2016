package org.pcat.inventory.model;

import java.io.Serializable;
import java.sql.Timestamp;

public interface FamilyInventory extends Serializable{

	String getFamilyId();

	Integer getId();

	Integer getInventoryId();

	Integer getQuantity();

	Timestamp getRequestedDate();

	Integer getRequestorId();

	/**
	 * @return the status
	 */
	String getStatus();

	void setFamilyId(String familyId);

	void setId(Integer id);

	void setInventoryId(Integer inventoryId);

	void setQuantity(Integer quantity);

	void setRequestedDate(Timestamp requestedDate);

	void setRequestorId(Integer requestorId);

	/**
	 * @param status
	 *            the status to set
	 */
	void setStatus(String status);

}