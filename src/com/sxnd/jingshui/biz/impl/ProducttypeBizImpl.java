package com.sxnd.jingshui.biz.impl;

import java.util.List;

import com.sxnd.jingshui.biz.ProducttypeBiz;
import com.sxnd.jingshui.dao.ProducttypeDao;
import com.sxnd.jingshui.entity.Producttype;

public class ProducttypeBizImpl implements ProducttypeBiz {
	private ProducttypeDao producttypeDao;

	public int addproducttype(Producttype producttype) throws Exception {
		// TODO Auto-generated method stub
		return producttypeDao.addproducttype(producttype);
	}

	public int deleteproducttype(Integer ptid) throws Exception {
		// TODO Auto-generated method stub
		Producttype p = producttypeDao.findproducttypeByptid(ptid);
		return producttypeDao.deleteproducttype(p);
	}

	public List<Producttype> findproducttype() throws Exception {
		// TODO Auto-generated method stub
		return producttypeDao.findproducttype();
	}

	public int updateproducttype(Producttype producttype) throws Exception {
		// TODO Auto-generated method stub
		return producttypeDao.updateproducttype(producttype);
	}

	public ProducttypeDao getProducttypeDao() {
		return producttypeDao;
	}

	public void setProducttypeDao(ProducttypeDao producttypeDao) {
		this.producttypeDao = producttypeDao;
	}

	public Producttype findproducttypeByptid(Integer ptid) throws Exception {
		// TODO Auto-generated method stub
		return producttypeDao.findproducttypeByptid(ptid);
	}
	

}
