package com.xsis.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "peserta")
public class Registrasi {
	@Id
	@GeneratedValue
	private Long id_peserta;
	private String nama;
	private String perusahaan;
	private String alamat_perusahaan;
	private String alamat_rumah;
	private String email;
	private String telepon;
	private String handphone;
	private String keterangan;

	public Long getId_peserta() {
		return id_peserta;
	}

	public void setId_peserta(Long id_peserta) {
		this.id_peserta = id_peserta;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getPerusahaan() {
		return perusahaan;
	}

	public void setPerusahaan(String perusahaan) {
		this.perusahaan = perusahaan;
	}

	public String getAlamat_perusahaan() {
		return alamat_perusahaan;
	}

	public void setAlamat_perusahaan(String alamat_perusahaan) {
		this.alamat_perusahaan = alamat_perusahaan;
	}

	public String getAlamat_rumah() {
		return alamat_rumah;
	}

	public void setAlamat_rumah(String alamat_rumah) {
		this.alamat_rumah = alamat_rumah;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelepon() {
		return telepon;
	}

	public void setTelepon(String telepon) {
		this.telepon = telepon;
	}

	public String getHandphone() {
		return handphone;
	}

	public void setHandphone(String handphone) {
		this.handphone = handphone;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}
}
