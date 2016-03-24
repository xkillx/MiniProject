package com.xsis.training.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xsis.training.model.Instruktur;
import com.xsis.training.model.Vendor;
import com.xsis.training.service.VendorService;

@Component
public class VendorAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Vendor vendor = new Vendor();
	private List<Vendor> vendorList = new ArrayList<Vendor>();
	@Autowired
	private VendorService vendorService;
	
	/**
	 * To save or update department.
	 * @return String
	 */
	public String saveOrUpdate()
	{	
		vendorService.save(vendor);
		return SUCCESS;
	}
	
	public String add() {
		vendor = new Vendor();
		return SUCCESS;
	}
	
	/**
	 * To list all departments.
	 * @return String
	 */
	public String list()
	{
		vendorList = vendorService.getAll();
		return SUCCESS;
	}
	
	/**
	 * To delete a department.
	 * @return String
	 */
	public String delete()
	{
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		vendor = vendorService.getById(Long.parseLong(request.getParameter("vid")));
		vendorService.delete(vendor);
		return SUCCESS;
	}
	
	/**
	 * To list a single department by Id.
	 * @return String
	 */
	public String edit()
	{
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		vendor = vendorService.getById(Long.parseLong(request.getParameter("vid")));
		return SUCCESS;
	}
	
	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public List<Vendor> getVendorList() {
		return vendorList;
	}

	public void setVendorList(List<Vendor> vendorList) {
		this.vendorList = vendorList;
	}

}
