package com.sxnd.jingshui.dao;

import java.util.List;

import com.sxnd.jingshui.entity.Productcasetype;
import com.sxnd.jingshui.entity.Producttype;

public interface ProductcasetypeDao {
	
    public List<Productcasetype> findproductcasetype() throws Exception;
	
	public int addproductcasetype(Productcasetype productcasetype) throws Exception;
	
	public int updateproductcasetype(Productcasetype productcasetype) throws Exception;
	
	public int deleteproductcasetype(Productcasetype productcasetype) throws Exception;
	
	
}
