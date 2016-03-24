package com.xsis.training.service;

import java.util.List;

import com.xsis.training.model.Registrasi;

public interface RegistrasiService {
	public void save(Registrasi registrasi);
	public void delete(Registrasi registrasi);
	public Long count();
	public Registrasi getById(Long id);
	public List<Registrasi> getAll();
	public List<Registrasi> getAll(int start, int num);
	public Registrasi getByEmail(String email);
}
