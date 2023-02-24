package com.algo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.algo.entity.Taxes;

@Repository
public class TaxDao {

	@Autowired
	SessionFactory sf;

	public List<Taxes> getTax() {

		Session session = sf.openSession();

		Criteria criteria = session.createCriteria(Taxes.class);
		List<Taxes> list = criteria.list();

		session.close();

		return list;
	}
	public String insertTax(Taxes t) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(t);
		tr.commit();
		return "Data Inserted Successfully";
	}
	public String updateTax(Taxes t) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(t);
		tr.commit();
		return "Data Updated Successfully";
	}
}
