package org.pcat.inventory.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

@Entity
@Table(name="user_info")
public class User implements Serializable, PcatPerson {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4241272990550941600L;
	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String supervisor;
	@Column(name = "supervisor_email")
	private String supervisorEmail;
	private String email;
	private String role;
	private String lastName;
	private boolean isActive;

	public User() {
		super();
	}

	public User(Integer id, String firstName, String lastName, String email, String role, String supervisor,
			String supervisorEmail, boolean isActive) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.supervisor = supervisor;
		this.supervisorEmail = supervisorEmail;
		this.email = email;
		this.role = role;
		this.lastName = lastName;
		this.isActive = isActive;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.PcatPerson#getEmail()
	 */
	@Override
	public String getEmail() {
		return this.email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.PcatPerson#getFirstname()
	 */
	@Override
	public String getFirstName() {
		return this.firstName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.PcatPerson#getId()
	 */
	@Override
	public Integer getId() {
		return this.id;
	}

	public boolean getIsactive() {
		return this.isActive;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.PcatPerson#getLastname()
	 */
	@Override
	public String getLastName() {
		return this.lastName;
	}

	public String getRole() {
		return this.role;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.PcatPerson#getSupervisor()
	 */
	@Override
	public String getSupervisor() {
		return this.supervisor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.PcatPerson#getSupervisoremail()
	 */
	@Override
	public String getSupervisorEmail() {
		return supervisorEmail;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.PcatPerson#setEmail(java.lang.String)
	 */
	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.PcatPerson#setFirstname(java.lang.String)
	 */
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.PcatPerson#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public void setIsactive(boolean isActive) {
		this.isActive = isActive;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.PcatPerson#setLastname(java.lang.String)
	 */
	@Override
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public void setRole(String role) {
		this.role = role;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.PcatPerson#setSupervisor(java.lang.String)
	 */
	@Override
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.pcat.inventory.model.PcatPerson#setSupervisoremail(java.lang.String)
	 */
	@Override
	public void setSupervisorEmail(String supervisoremail) {
		this.supervisorEmail = supervisoremail;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pcat.inventory.model.PcatPerson#toString()
	 */
	@Override
	public String toString() {
		return String.format("User[id=%d, firstName='%s', lastname='%s', email='%s', supervisor='%s', supervisor='%s']",
				this.id, this.firstName, this.lastName, this.email, this.supervisor, this.supervisorEmail,
				this.isActive);
	}
}
