package com.sxnd.jingshui.biz;

import java.util.List;

import com.sxnd.jingshui.entity.Productcase;

public interface ProductcaseBiz {
	

	public int  addproductcase(Productcase productcase) throws Exception;
	
	public int updateproductcase(Productcase productcase)throws Exception;
	
	public int deleteproductcase(Productcase productcase)throws Exception;
	
	
	//动态条件查询
	public List<Productcase> findProductcase(Integer page,Integer pctid) throws Exception;
	
	
	//动态条件查询页数（根据产品类型id）
	public Integer findProductcasepages(Integer pctid)throws Exception;
	
	//根据产品案例id查出产品案例的具体属性
	public Productcase findProductcaseByPcId(Integer pcid)throws Exception;
}
