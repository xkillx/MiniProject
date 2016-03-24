package com.xsis.training.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsis.training.dao.RegistrasiDao;
import com.xsis.training.model.Registrasi;

@Service
@Transactional
public class RegistrasiServiceImpl implements RegistrasiService {
	@Autowired
	private RegistrasiDao registrasiDao;

	@Override
	public void save(Registrasi registrasi) {
		registrasiDao.save(registrasi);
	}

	@Override
	public void delete(Registrasi registrasi) {
		registrasiDao.delete(registrasi);
	}

	@Override
	public Long count() {
		return registrasiDao.count();
	}

	@Override
	public Registrasi getById(Long id) {
		return registrasiDao.getById(id);
	}

	@Override
	public List<Registrasi> getAll() {
		return registrasiDao.getAll();
	}

	@Override
	public List<Registrasi> getAll(int start, int num) {
		return registrasiDao.getAll(start, num);
	}

	@Override
	public Registrasi getByEmail(String email) {
		return registrasiDao.getByEmail(email);
	}
}
