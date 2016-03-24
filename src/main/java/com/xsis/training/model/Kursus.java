package com.xsis.training.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "kursus")
public class Kursus {

	@Id
	@GeneratedValue
	private Long kid;
	private String kode_kursus;
	private String namakursus;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "vid")
	private Vendor vendor = new Vendor();
	private int bobot;

	public Long getKid() {
		return kid;
	}

	public void setKid(Long kid) {
		this.kid = kid;
	}

	public String getNamakursus() {
		return namakursus;
	}

	public void setNamakursus(String namakursus) {
		this.namakursus = namakursus;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public int getBobot() {
		return bobot;
	}

	public void setBobot(int bobot) {
		this.bobot = bobot;
	}

	public String getKode_kursus() {
		return kode_kursus;
	}

	public void setKode_kursus(String kode_kursus) {
		this.kode_kursus = kode_kursus;
	}

}
