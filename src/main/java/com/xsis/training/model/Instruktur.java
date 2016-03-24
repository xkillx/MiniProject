package com.xsis.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instruktur")
public class Instruktur {
	@Id
	@GeneratedValue
	private Long iid;
	private String firstname;
	private String lastname;

	public Instruktur() {

	}

	public Instruktur(Long iid, String firstname, String lastname) {
		this.iid = iid;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Long getIid() {
		return iid;
	}

	public void setIid(Long iid) {
		this.iid = iid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Instruktur [iid=" + iid + ", firstname=" + firstname
				+ ", lastname=" + lastname + "]";
	}
	
}
