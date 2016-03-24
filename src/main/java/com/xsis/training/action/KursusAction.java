package com.xsis.training.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xsis.training.model.Kursus;
import com.xsis.training.model.Vendor;
import com.xsis.training.service.KursusService;
import com.xsis.training.service.VendorService;

@Component
public class KursusAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private KursusService kursusService;
	@Autowired
	private VendorService vendorService;
	private List<Kursus> kursusList;
	private List<Vendor> vendors;
	private Kursus kursus;

	public String list() {
		kursusList = kursusService.getAll();
		return SUCCESS;
	}

	public String saveOrUpdate() {
		kursusService.save(kursus);
		kursusList = kursusService.getAll();
		return SUCCESS;
	}

	public String add() {
		kursus = new Kursus();
		vendors = vendorService.getAll();
		return SUCCESS;
	}

	public String edit() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		kursus = kursusService.getById(Long.parseLong(request
				.getParameter("kid")));
		vendors = vendorService.getAll();
		return SUCCESS;
	}
	
	public String delete() {
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext().get(ServletActionContext.HTTP_REQUEST);
		kursus = kursusService.getById(Long.parseLong(request
				.getParameter("kid")));
		kursusService.delete(kursus);
		return SUCCESS;
	}

	public List<Kursus> getKursusList() {
		return kursusList;
	}

	public Kursus getKursus() {
		return kursus;
	}

	public void setKursus(Kursus kursus) {
		this.kursus = kursus;
	}

	public List<Vendor> getVendors() {
		return vendors;
	}

}
