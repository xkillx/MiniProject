package com.xsis.training.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsis.training.dao.SesiDetailDao;
import com.xsis.training.model.Sesi;
import com.xsis.training.model.SesiDetail;

@Service
@Transactional
public class SesiDetailServiceImpl implements SesiDetailService {
	@Autowired
	private SesiDetailDao sesiDetailDao;

	@Override
	public void save(SesiDetail sesi) {
		sesiDetailDao.save(sesi);
	}

	@Override
	public void delete(SesiDetail sesi) {
		sesiDetailDao.delete(sesi);
	}

	@Override
	public Long count() {
		return sesiDetailDao.count();
	}

	@Override
	public SesiDetail getById(Long id) {
		return sesiDetailDao.getById(id);
	}

	@Override
	public List<SesiDetail> getAll() {
		return sesiDetailDao.getAll();
	}

	@Override
	public List<SesiDetail> getAll(int start, int num) {
		return sesiDetailDao.getAll(start, num);
	}

	@Override
	public List<SesiDetail> getBySesi(Sesi sesi) {
		return sesiDetailDao.getBySesi(sesi);
	}
}
