package org.pcat.inventory.model;

public interface PcatPerson {

	String getEmail();

	String getFirstName();

	Integer getId();

	String getLastName();

	String getSupervisor();

	String getSupervisorEmail();

	void setEmail(String email);

	void setFirstName(String firstName);

	void setId(Integer id);

	void setLastName(String lastName);

	void setSupervisor(String supervisor);

	void setSupervisorEmail(String supervisorEmail);

	String toString();

}