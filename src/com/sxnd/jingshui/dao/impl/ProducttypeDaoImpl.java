package com.sxnd.jingshui.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sxnd.jingshui.dao.ProducttypeDao;
import com.sxnd.jingshui.entity.Producttype;

public class ProducttypeDaoImpl extends HibernateDaoSupport implements
		ProducttypeDao {

	public int addproducttype(Producttype producttype) throws Exception {
		Session session = this.getSession();
		session.save(producttype);
		return 1;
	}

	public int deleteproducttype(Producttype producttype) throws Exception {
		Session session = this.getSession();
		session.delete(producttype);
		return 1;
	}

	public List<Producttype> findproducttype() throws Exception {
		Session session = this.getSession();
		String hqlStr = "from Producttype";
		Query query = session.createQuery(hqlStr);
		List<Producttype> producttypeList = query.list();
		return producttypeList;
	}

	public int updateproducttype(Producttype producttype) throws Exception {
		Session session = this.getSession();
		session.update(producttype);
		return 1;
	}

	public Producttype findproducttypeByptid(Integer ptid) throws Exception {
		String hqlStr = "from Producttype where ptId=:ptid";
		Session session = this.getSession();
		Query query = session.createQuery(hqlStr);
		query.setInteger("ptid", ptid);
		Producttype producttype = (Producttype) query.uniqueResult();
		return producttype;
	}

}
