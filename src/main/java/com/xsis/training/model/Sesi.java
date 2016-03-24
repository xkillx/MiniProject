package com.xsis.training.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "sesi")
public class Sesi {

	@Id
	@GeneratedValue
	private Long nosesi;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "kid")
	private Kursus kursus = new Kursus();

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "iid")
	private Instruktur instruktur = new Instruktur();

	@Temporal(TemporalType.DATE)
	private Date check_in;

	@Temporal(TemporalType.DATE)
	private Date check_out;

	private int jam;
	private String ruang;

	@Temporal(TemporalType.DATE)
	private Date last_update;

	@OneToMany(mappedBy = "sesi", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SesiDetail> sesiDetail = new ArrayList<>();

	public Long getNosesi() {
		return nosesi;
	}

	public void setNosesi(Long nosesi) {
		this.nosesi = nosesi;
	}

	public Kursus getKursus() {
		return kursus;
	}

	public void setKursus(Kursus kursus) {
		this.kursus = kursus;
	}

	public Instruktur getInstruktur() {
		return instruktur;
	}

	public void setInstruktur(Instruktur instruktur) {
		this.instruktur = instruktur;
	}

	public Date getCheck_in() {
		return check_in;
	}

	public void setCheck_in(Date check_in) {
		this.check_in = check_in;
	}

	public Date getCheck_out() {
		return check_out;
	}

	public void setCheck_out(Date check_out) {
		this.check_out = check_out;
	}

	public int getJam() {
		return jam;
	}

	public void setJam(int jam) {
		this.jam = jam;
	}

	public String getRuang() {
		return ruang;
	}

	public void setRuang(String ruang) {
		this.ruang = ruang;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	public List<SesiDetail> getSesiDetail() {
		return sesiDetail;
	}

	public void setSesiDetail(List<SesiDetail> sesiDetail) {
		this.sesiDetail = sesiDetail;
	}

}
