package com.sxnd.jingshui.dao;

import java.util.List;

import com.sxnd.jingshui.entity.Product;
import com.sxnd.jingshui.entity.Producttype;

public interface ProductDao {
	
	//动态条件查询（根据产品类型id）
	public List<Product> findproduct(Integer page,Integer ptid) throws Exception;
	
	//动态条件查询页数（根据产品类型id）
	public Integer findProductpages(Integer ptid)throws Exception;
	
	//添加产品
	public int addproduct(Product product) throws Exception;
	
	//修改产品
	public int updateproduct(Product product)throws Exception;
	
	//删除产品
	public int deleteProdunct(Integer id) throws Exception;
	
	//根据产品id查询产品
	public Product findproductById(Integer pid) throws Exception;
	

	
	

}
