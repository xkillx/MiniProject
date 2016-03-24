package com.xsis.training.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.xsis.training.model.Registrasi;

@Repository
public class RegistrasiDao extends BaseDaoHibernate<Registrasi> {
	public Registrasi getByEmail(String email) {
		Query q = getCurrentSession().createQuery("from Registrasi where email = ?");
		q.setString(0, email);
		return (Registrasi) q.uniqueResult();
	}
}
