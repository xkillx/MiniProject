package com.xsis.training.service;

import java.util.List;

import com.xsis.training.model.Vendor;

public interface VendorService {
	public void save(Vendor vendor);
	public void delete(Vendor vendor);
	public Long count();
	public Vendor getById(Long id);
	public List<Vendor> getAll();
	public List<Vendor> getAll(int start, int num);
}
