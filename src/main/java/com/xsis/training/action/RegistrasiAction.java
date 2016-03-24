package com.xsis.training.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xsis.training.model.Registrasi;
import com.xsis.training.service.RegistrasiService;
import com.xsis.training.service.RegistrasiServiceImpl;

@Component
public class RegistrasiAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Registrasi> regs = new ArrayList<Registrasi>();
	@Autowired
	private RegistrasiService regService;
	private Registrasi reg = new Registrasi();

	// method
	public String list() throws Exception {
		this.regs = this.regService.getAll();
		return SUCCESS;
	}
	
	public String saveOrUpdate() {
		regService.save(reg);
		regs = regService.getAll();
		return SUCCESS;
	}
	
	public String add() {
		reg = new Registrasi();
		return SUCCESS;
	}

	public String edit() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		reg = regService.getById(Long.parseLong(request
				.getParameter("id_peserta")));
		return SUCCESS;
	}

	public String delete() throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		reg = regService.getById(Long.parseLong(request.getParameter("id_peserta")));
		regService.delete(reg);
		return SUCCESS;
	}

	/*
	 * public String regCheck() throws Exception{ this.reg =
	 * this.regService.cekRegistrasi(this.reg.getEmail()); if(this.reg == null){
	 * return ERROR; }else{ return SUCCESS; } }
	 */

	//
	public List<Registrasi> getRegs() {
		return regs;
	}

	public void setRegs(List<Registrasi> regs) {
		this.regs = regs;
	}

	public RegistrasiService getRegService() {
		return regService;
	}

	public void setRegService(RegistrasiServiceImpl regService) {
		this.regService = regService;
	}

	public Registrasi getReg() {
		return reg;
	}

	public void setReg(Registrasi reg) {
		this.reg = reg;
	}

}
