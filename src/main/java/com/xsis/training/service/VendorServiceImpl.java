package com.xsis.training.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsis.training.dao.VendorDao;
import com.xsis.training.model.Vendor;

@Service
@Transactional
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorDao vendorDao;

	@Override
	public void save(Vendor vendor) {
		vendorDao.save(vendor);
	}

	@Override
	public void delete(Vendor vendor) {
		vendorDao.delete(vendor);
	}

	@Override
	public Long count() {
		return vendorDao.count();
	}

	@Override
	public Vendor getById(Long id) {
		return vendorDao.getById(id);
	}

	@Override
	public List<Vendor> getAll() {
		return vendorDao.getAll();
	}

	@Override
	public List<Vendor> getAll(int start, int num) {
		return vendorDao.getAll(start, num);
	}

}
