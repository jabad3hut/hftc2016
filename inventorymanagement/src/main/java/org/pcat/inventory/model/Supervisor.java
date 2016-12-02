package org.pcat.inventory.model;

public class Supervisor implements PcatPerson{
	
	private PcatPerson pcatPerson;

	public String getEmail() {
		return pcatPerson.getEmail();
	}

	public String getFirstName() {
		return pcatPerson.getFirstName();
	}

	public Integer getId() {
		return pcatPerson.getId();
	}

	public String getLastName() {
		return pcatPerson.getLastName();
	}

	public String getSupervisor() {
		return pcatPerson.getSupervisor();
	}

	public String getSupervisorEmail() {
		return pcatPerson.getSupervisorEmail();
	}

	public void setEmail(String email) {
		pcatPerson.setEmail(email);
	}

	public void setFirstName(String firstName) {
		pcatPerson.setFirstName(firstName);
	}

	public void setId(Integer id) {
		pcatPerson.setId(id);
	}

	public void setLastName(String lastname) {
		pcatPerson.setLastName(lastname);
	}

	public void setSupervisor(String supervisor) {
		pcatPerson.setSupervisor(supervisor);
	}

	public void setSupervisorEmail(String supervisoremail) {
		pcatPerson.setSupervisorEmail(supervisoremail);
	}

	public String toString() {
		return pcatPerson.toString();
	}

}
