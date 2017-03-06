package com.sxnd.jingshui.biz.impl;

import java.util.List;

import com.sxnd.jingshui.biz.CompanyBiz;
import com.sxnd.jingshui.dao.CompanyDao;
import com.sxnd.jingshui.entity.Company;

public class CompanyBizImpl implements CompanyBiz {
	private CompanyDao companyDao;

	public Company findCompany() throws Exception {
		// TODO Auto-generated method stub
		return companyDao.findCompany();
	}

	public CompanyDao getCompanyDao() {
		return companyDao;
	}

	public void setCompanyDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}
	
	

}
