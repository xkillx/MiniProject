package com.xsis.training.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xsis.training.model.Instruktur;
import com.xsis.training.model.Kursus;
import com.xsis.training.model.Sesi;
import com.xsis.training.model.SesiDetail;
import com.xsis.training.service.InstrukturService;
import com.xsis.training.service.KursusService;
import com.xsis.training.service.SesiDetailService;
import com.xsis.training.service.SesiService;

@Component
public class SesiAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private SesiService sesiService;

	@Autowired
	private KursusService kursusService;

	@Autowired
	private InstrukturService instrukturService;
	
	@Autowired
	private SesiDetailService sesiDetailService;

	private Sesi sesi;
	private List<Sesi> sesiList;
	private List<Kursus> kursusList;
	private List<Instruktur> instrukturList;
	
	public String list() {
		sesiList = sesiService.getAll();
		return SUCCESS;
	}
	
	public String add() {
		sesi = new Sesi();
		instrukturList = instrukturService.getAll();
		kursusList = kursusService.getAll();
		return SUCCESS;
	}
	
	public String edit() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		sesi = sesiService.getById(Long.parseLong(request
				.getParameter("nosesi")));
		instrukturList = instrukturService.getAll();
		kursusList = kursusService.getAll();
		return SUCCESS;
	}

	public String delete() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		sesi = sesiService.getById(Long.parseLong(request
				.getParameter("nosesi")));
		sesiService.delete(sesi);
		return SUCCESS;
	}
	
	public String saveOrUpdate() {
		sesi.setLast_update(new Date());
		sesiService.save(sesi);
		sesiList = sesiService.getAll();
		return SUCCESS;
	}
	
	public String detail() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		sesi = sesiService.getById(Long.parseLong(request
				.getParameter("nosesi")));
		sesiDetails = sesiDetailService.getBySesi(sesi);
		return SUCCESS;
	}

	public Sesi getSesi() {
		return sesi;
	}

	public void setSesi(Sesi sesi) {
		this.sesi = sesi;
	}

	public List<Sesi> getSesiList() {
		return sesiList;
	}

	public void setSesiList(List<Sesi> sesiList) {
		this.sesiList = sesiList;
	}

	public List<Kursus> getKursusList() {
		return kursusList;
	}

	public void setKursusList(List<Kursus> kursusList) {
		this.kursusList = kursusList;
	}

	public List<Instruktur> getInstrukturList() {
		return instrukturList;
	}

	public void setInstrukturList(List<Instruktur> instrukturList) {
		this.instrukturList = instrukturList;
	}

	public List<SesiDetail> getSesiDetails() {
		return sesiDetails;
	}

	public void setSesiDetails(List<SesiDetail> sesiDetails) {
		this.sesiDetails = sesiDetails;
	}

}
