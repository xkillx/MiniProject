package com.xsis.training.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	
	private String hello;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

}
