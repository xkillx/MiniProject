package com.xsis.training.dao;

import java.util.List;

import com.xsis.training.model.Test;

public interface TestDao {
	public void save(Test t);
	public void update(Test t);
	public void delete(int id);
	public Test getById(int id);
	public List<Test> getAll();
}
