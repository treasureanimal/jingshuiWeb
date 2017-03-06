package com.sxnd.jingshui.dao;

import java.util.List;

import com.sxnd.jingshui.entity.Hydt;



public interface HydtDao {
	
	public int addHydt(Hydt hydt) throws Exception;
	
	public int updateHydt(Hydt hydt)throws Exception;
	
	public int deleteHydt(Hydt hydt)throws Exception;
	
	//分页查询新闻
	public List<Hydt> findHydt(Integer page)throws Exception;
	
	//查询总页数
	public Integer findPageCount()throws Exception;
	
	public List<Hydt> findHydtsByNine() throws Exception;
	
	//根据行业动态id查询内容
	public Hydt findHydtsById(Integer id) throws Exception;
	
}
