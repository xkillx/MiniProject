package com.xsis.training.service;

import java.util.List;

import com.xsis.training.model.Sesi;

public interface SesiService {
	public void save(Sesi sesi);
	public void delete(Sesi sesi);
	public Long count();
	public Sesi getById(Long id);
	public List<Sesi> getAll();
	public List<Sesi> getAll(int start, int num);
}
