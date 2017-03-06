package com.sxnd.jingshui.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sxnd.jingshui.dao.ProductcasetypeDao;
import com.sxnd.jingshui.entity.Productcasetype;
import com.sxnd.jingshui.entity.Producttype;

public class ProductcasetypeDaoImpl extends HibernateDaoSupport implements
		ProductcasetypeDao {

	public int addproductcasetype(Productcasetype productcasetype)
			throws Exception {
		Session session = this.getSession();
		session.save(productcasetype);
		return 1;
	}

	public int deleteproductcasetype(Productcasetype productcasetype)
			throws Exception {
		Session session = this.getSession();
		session.delete(productcasetype);
		return 1;
	}

	public List<Productcasetype> findproductcasetype() throws Exception {
		Session session = this.getSession();
		String hqlStr = "from Productcasetype";
		Query query = session.createQuery(hqlStr);
		List<Productcasetype> productcasetype = query.list();
		return productcasetype;
	}

	public int updateproductcasetype(Productcasetype productcasetype)
			throws Exception {
		Session session = this.getSession();
		session.update(productcasetype);
		return 1;
	}

}
