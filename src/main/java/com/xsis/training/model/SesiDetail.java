package com.xsis.training.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detail_sesi")
public class SesiDetail {
	@Id
	@GeneratedValue
	private Long id_detail_sesi;
	@ManyToOne
	@JoinColumn(name = "nosesi")
	private Sesi sesi;
	@ManyToOne
	@JoinColumn(name = "id_peserta")
	private Registrasi registrasi;

	public Long getId_detail_sesi() {
		return id_detail_sesi;
	}

	public void setId_detail_sesi(Long id_detail_sesi) {
		this.id_detail_sesi = id_detail_sesi;
	}

	public Sesi getSesi() {
		return sesi;
	}

	public void setSesi(Sesi sesi) {
		this.sesi = sesi;
	}

	public Registrasi getRegistrasi() {
		return registrasi;
	}

	public void setRegistrasi(Registrasi registrasi) {
		this.registrasi = registrasi;
	}
}
