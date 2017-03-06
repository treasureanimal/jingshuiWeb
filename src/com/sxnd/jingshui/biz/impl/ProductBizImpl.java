package com.sxnd.jingshui.biz.impl;

import java.util.List;

import com.sxnd.jingshui.biz.ProductBiz;
import com.sxnd.jingshui.dao.ProductDao;
import com.sxnd.jingshui.entity.Product;

public class ProductBizImpl implements ProductBiz {
	private ProductDao productDao;

	public int addproduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return productDao.addproduct(product);
	}

	public int deleteProdunct(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return productDao.deleteProdunct(id);
	}

	public Integer findProductpages(Integer ptid) throws Exception {
		// TODO Auto-generated method stub
		return productDao.findProductpages(ptid);
	}

	public List<Product> findproduct(Integer page, Integer ptid)
			throws Exception {
		// TODO Auto-generated method stub
		return productDao.findproduct(page, ptid);
	}

	public int updateproduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return productDao.updateproduct(product);
	}
	
	public Product findproductById(Integer pid) throws Exception {
		
		return productDao.findproductById(pid);
	}

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	

	
	
	

}
