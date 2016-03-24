package com.xsis.training.service;

import java.util.List;

import com.xsis.training.model.Kursus;

public interface KursusService {
	public void save(Kursus kursus);
	public void delete(Kursus kursus);
	public Long count();
	public Kursus getById(Long id);
	public List<Kursus> getAll();
	public List<Kursus> getAll(int start, int num);
}
