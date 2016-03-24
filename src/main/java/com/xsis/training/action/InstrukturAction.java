package com.xsis.training.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xsis.training.model.Instruktur;
import com.xsis.training.service.InstrukturService;

@Component
public class InstrukturAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private InstrukturService instrukturService;
	private List<Instruktur> instrukturs;
	private Instruktur instruktur;

	public String saveOrUpdate() {
		instrukturService.save(instruktur);
		instrukturs = instrukturService.getAll();
		return SUCCESS;
	}

	public String list() {
		instrukturs = instrukturService.getAll();
		return SUCCESS;
	}

	public String add() {
		instruktur = new Instruktur();
		return SUCCESS;
	}

	public String delete() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		instruktur = instrukturService.getById(Long.parseLong(request
				.getParameter("iid")));
		instrukturService.delete(instruktur);
		return SUCCESS;
	}

	public String edit() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		instruktur = instrukturService.getById(Long.parseLong(request
				.getParameter("iid")));
		return SUCCESS;
	}

	public List<Instruktur> getInstrukturs() {
		return instrukturs;
	}

	public Instruktur getInstruktur() {
		return instruktur;
	}

	public void setInstruktur(Instruktur instruktur) {
		this.instruktur = instruktur;
	}
}
