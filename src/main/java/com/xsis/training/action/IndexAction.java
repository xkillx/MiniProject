package com.xsis.training.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xsis.training.model.Registrasi;
import com.xsis.training.model.Sesi;
import com.xsis.training.model.SesiDetail;
import com.xsis.training.service.RegistrasiService;
import com.xsis.training.service.SesiDetailService;
import com.xsis.training.service.SesiService;

@Component
public class IndexAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private SesiService sesiService;
	
	private List<Sesi> sesiList;
	
	@Autowired
	private RegistrasiService registrasiService;
	
	private String email;
	private Registrasi registrasi;
	private Sesi sesi;
	private SesiDetail sesiDetail = new SesiDetail();
	
	@Autowired
	private SesiDetailService sesiDetailService;
	
	public String list() {
		sesiList = sesiService.getAll();
		return SUCCESS;
	}
	
	public String daftar() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		sesi = sesiService.getById(Long.parseLong(request
				.getParameter("nosesi")));
		return SUCCESS;
	}
	
	public String cekEmail() {
		registrasi = registrasiService.getByEmail(email);
		if (registrasi == null) {
			return "daftar";
		}
		else {
			sesiDetail.setRegistrasi(registrasi);
			sesiDetail.setSesi(sesi);
			sesiDetailService.save(sesiDetail);
			return SUCCESS;
		}
	}

	public List<Sesi> getSesiList() {
		return sesiList;
	}

	public void setSesiList(List<Sesi> sesiList) {
		this.sesiList = sesiList;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SesiDetail getSesiDetail() {
		return sesiDetail;
	}

	public void setSesiDetail(SesiDetail sesiDetail) {
		this.sesiDetail = sesiDetail;
	}
}
