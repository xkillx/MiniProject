package com.xsis.training.service;

import java.util.List;

import com.xsis.training.model.Instruktur;

public interface InstrukturService {
	public void save(Instruktur instruktur);
	public void delete(Instruktur instruktur);
	public Long count();
	public Instruktur getById(Long id);
	public List<Instruktur> getAll();
	public List<Instruktur> getAll(int start, int num);
}
