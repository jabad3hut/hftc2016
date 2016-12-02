package org.pcat.inventory.model;

import java.io.Serializable;

public class HomeVisitor implements PcatPerson, Serializable {

	private PcatPerson pcatPerson;

	public HomeVisitor() {
		super();
		this.pcatPerson = new User();
	}

	public HomeVisitor(String firstName, String lastName, String email, String supervisor, String supervisorEmail) {
		super();
		this.pcatPerson = new User(null, firstName, lastName, email, "Home Visitor", supervisor, supervisorEmail, true);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof HomeVisitor)) {
			return false;
		}
		HomeVisitor other = (HomeVisitor) obj;
		if (pcatPerson == null) {
			if (other.pcatPerson != null) {
				return false;
			}
		} else if (!pcatPerson.equals(other.pcatPerson)) {
			return false;
		}
		return true;
	}

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

	public PcatPerson getPcatPerson() {
		return pcatPerson;
	}

	public String getSupervisor() {
		return pcatPerson.getSupervisor();
	}

	public String getSupervisorEmail() {
		return pcatPerson.getSupervisorEmail();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pcatPerson == null) ? 0 : pcatPerson.hashCode());
		return result;
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

	public void setPcatPerson(PcatPerson pcatPerson) {
		this.pcatPerson = pcatPerson;
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
