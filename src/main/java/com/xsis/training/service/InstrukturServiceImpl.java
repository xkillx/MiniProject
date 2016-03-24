package com.xsis.training.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsis.training.dao.InstrukturDao;
import com.xsis.training.model.Instruktur;

@Service
@Transactional
public class InstrukturServiceImpl implements InstrukturService {
	
	@Autowired
	private InstrukturDao instrukturDao;

	@Override
	public void save(Instruktur instruktur) {
		instrukturDao.save(instruktur);
	}

	@Override
	public void delete(Instruktur instruktur) {
		instrukturDao.delete(instruktur);
	}

	@Override
	public Long count() {
		return instrukturDao.count();
	}

	@Override
	public Instruktur getById(Long id) {
		return instrukturDao.getById(id);
	}

	@Override
	public List<Instruktur> getAll() {
		return instrukturDao.getAll();
	}

	@Override
	public List<Instruktur> getAll(int start, int num) {
		return getAll(start, num);
	}

}
