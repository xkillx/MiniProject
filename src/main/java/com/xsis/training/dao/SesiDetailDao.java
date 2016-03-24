package com.xsis.training.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xsis.training.model.Sesi;
import com.xsis.training.model.SesiDetail;

@Repository
public class SesiDetailDao extends BaseDaoHibernate<SesiDetail> {
	@SuppressWarnings("unchecked")
	public List<SesiDetail> getBySesi(Sesi sesi) {
		return getCurrentSession()
				.createQuery("FROM SesiDetail sd WHERE sd.sesi = :sesi")
				.setParameter("sesi", sesi)
				.list();
	}
}
