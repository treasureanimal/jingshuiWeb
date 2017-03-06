package com.sxnd.jingshui.biz.impl;

import java.util.List;

import com.sxnd.jingshui.biz.ProductcasetypeBiz;
import com.sxnd.jingshui.dao.ProductcasetypeDao;
import com.sxnd.jingshui.entity.Productcasetype;

public class ProductcasetypeBizImpl implements ProductcasetypeBiz {
	
	
	private ProductcasetypeDao productcasetypeDao;

	public int addproductcasetype(Productcasetype productcasetype)
			throws Exception {
		// TODO Auto-generated method stub
		return productcasetypeDao.addproductcasetype(productcasetype);
	}

	public int deleteproductcasetype(Productcasetype productcasetype)
			throws Exception {
		// TODO Auto-generated method stub
		return productcasetypeDao.deleteproductcasetype(productcasetype);
	}

	public List<Productcasetype> findproductcasetype() throws Exception {
		// TODO Auto-generated method stub
		return productcasetypeDao.findproductcasetype();
	}

	public int updateproductcasetype(Productcasetype productcasetype)
			throws Exception {
		// TODO Auto-generated method stub
		return productcasetypeDao.updateproductcasetype(productcasetype);
	}

	public ProductcasetypeDao getProductcasetypeDao() {
		return productcasetypeDao;
	}

	public void setProductcasetypeDao(ProductcasetypeDao productcasetypeDao) {
		this.productcasetypeDao = productcasetypeDao;
	}
	
}
