package com.xsis.training.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsis.training.dao.SesiDao;
import com.xsis.training.model.Sesi;

@Service
@Transactional
public class SesiServiceImpl implements SesiService {
	@Autowired
	private SesiDao sesiDao;

	@Override
	public void save(Sesi sesi) {
		sesiDao.save(sesi);
	}

	@Override
	public void delete(Sesi sesi) {
		sesiDao.delete(sesi);
	}

	@Override
	public Long count() {
		return sesiDao.count();
	}

	@Override
	public Sesi getById(Long id) {
		return sesiDao.getById(id);
	}

	@Override
	public List<Sesi> getAll() {
		return sesiDao.getAll();
	}

	@Override
	public List<Sesi> getAll(int start, int num) {
		return sesiDao.getAll(start, num);
	}
}
