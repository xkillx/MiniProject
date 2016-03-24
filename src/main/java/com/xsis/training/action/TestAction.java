package com.xsis.training.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.xsis.training.dao.TestDao;
import com.xsis.training.model.Test;

public class TestAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Test> tests = new ArrayList<>();
	@Autowired
	private TestDao testDao;

	@Override
	public String execute() throws Exception {
		tests = testDao.getAll();
		return SUCCESS;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

	public List<Test> getTests() {
		return tests;
	}
}
