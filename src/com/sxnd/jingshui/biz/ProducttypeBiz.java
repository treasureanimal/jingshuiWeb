package com.sxnd.jingshui.biz;

import java.util.List;

import com.sxnd.jingshui.entity.Producttype;

public interface ProducttypeBiz {
	
	
	public List<Producttype> findproducttype() throws Exception;
	
	public int addproducttype(Producttype producttype) throws Exception;
	
	public int updateproducttype(Producttype producttype) throws Exception;
	
	public int deleteproducttype(Integer ptid) throws Exception;
	
	//根据产品类型id查询查询产品类型
	public Producttype findproducttypeByptid(Integer ptid)throws Exception;

	

}
