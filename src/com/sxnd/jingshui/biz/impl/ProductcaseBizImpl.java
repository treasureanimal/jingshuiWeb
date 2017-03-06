package com.sxnd.jingshui.biz.impl;

import java.util.List;

import com.sxnd.jingshui.biz.ProductcaseBiz;
import com.sxnd.jingshui.dao.ProductcaseDao;
import com.sxnd.jingshui.entity.Productcase;

public class ProductcaseBizImpl implements ProductcaseBiz {
	private ProductcaseDao productcaseDao;

	public int addproductcase(Productcase productcase) throws Exception {
		// TODO Auto-generated method stub
		return productcaseDao.addproductcase(productcase);
	}

	public int deleteproductcase(Productcase productcase) throws Exception {
		// TODO Auto-generated method stub
		return productcaseDao.deleteproductcase(productcase);
	}

	public List<Productcase> findProductcase(Integer page, Integer pctid)
			throws Exception {
		// TODO Auto-generated method stub
		return productcaseDao.findProductcase(page, pctid);
	}

	public Integer findProductcasepages(Integer pctid) throws Exception {
		// TODO Auto-generated method stub
		return productcaseDao.findProductcasepages(pctid);
	}

	public int updateproductcase(Productcase productcase) throws Exception {
		// TODO Auto-generated method stub
		return productcaseDao.updateproductcase(productcase);
	}

	public Productcase findProductcaseByPcId(Integer pcid) throws Exception {
		// TODO Auto-generated method stub
		return productcaseDao.findProductcaseByPcId(pcid);
	}
	public ProductcaseDao getProductcaseDao() {
		return productcaseDao;
	}

	public void setProductcaseDao(ProductcaseDao productcaseDao) {
		this.productcaseDao = productcaseDao;
	}

	
	

}
