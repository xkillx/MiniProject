package com.xsis.training.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsis.training.dao.KursusDao;
import com.xsis.training.model.Kursus;

@Service
@Transactional
public class KursusServiceImpl implements KursusService {
	
	@Autowired
	private KursusDao kursusDao;

	@Override
	public void save(Kursus kursus) {
		kursusDao.save(kursus);
	}

	@Override
	public void delete(Kursus kursus) {
		kursusDao.delete(kursus);
	}

	@Override
	public Long count() {
		return kursusDao.count();
	}

	@Override
	public Kursus getById(Long id) {
		return kursusDao.getById(id);
	}

	@Override
	public List<Kursus> getAll() {
		return kursusDao.getAll();
	}

	@Override
	public List<Kursus> getAll(int start, int num) {
		return kursusDao.getAll(start, num);
	}

}
