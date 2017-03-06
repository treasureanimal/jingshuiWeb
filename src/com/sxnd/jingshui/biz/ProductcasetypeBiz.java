package com.sxnd.jingshui.biz;

import java.util.List;

import com.sxnd.jingshui.entity.Productcasetype;

public interface ProductcasetypeBiz {
	  public List<Productcasetype> findproductcasetype() throws Exception;
		
		public int addproductcasetype(Productcasetype productcasetype) throws Exception;
		
		public int updateproductcasetype(Productcasetype productcasetype) throws Exception;
		
		public int deleteproductcasetype(Productcasetype productcasetype) throws Exception;
		
		
}
