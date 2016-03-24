package com.xsis.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
public class Vendor {

	@Id
	@GeneratedValue
	private Long vid;
	private String namavendor;

	public Long getVid() {
		return vid;
	}

	public void setVid(Long vid) {
		this.vid = vid;
	}

	public String getNamavendor() {
		return namavendor;
	}

	public void setNamavendor(String namavendor) {
		this.namavendor = namavendor;
	}

	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", namavendor=" + namavendor + "]";
	}

}
