package com.sxnd.jingshui.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sxnd.jingshui.dao.CompanyDao;
import com.sxnd.jingshui.entity.Company;

public class CompanyDaoImpl extends HibernateDaoSupport implements CompanyDao {

	public Company findCompany() throws Exception {
		String hqlStr = "from Company";
		Session session = this.getSession();
		Query query = session.createQuery(hqlStr);
		List<Company> companyList = query.list();
		
		Company company = new Company();
		
		if(companyList.size() > 0) {
			company = companyList.get(0);
			return company;
		}
		
		return null;
	}
}
