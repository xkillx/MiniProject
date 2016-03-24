package com.xsis.training.service;

import java.util.List;

import com.xsis.training.model.Sesi;
import com.xsis.training.model.SesiDetail;

public interface SesiDetailService {
	public void save(SesiDetail sesiDetail);
	public void delete(SesiDetail sesiDetail);
	public Long count();
	public SesiDetail getById(Long id);
	public List<SesiDetail> getAll();
	public List<SesiDetail> getAll(int start, int num);
	public List<SesiDetail> getBySesi(Sesi sesi);
}
