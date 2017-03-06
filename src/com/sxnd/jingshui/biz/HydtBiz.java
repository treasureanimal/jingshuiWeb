package com.sxnd.jingshui.biz;

import java.util.List;

import com.sxnd.jingshui.entity.Hydt;

public interface HydtBiz {
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
	
	//查找当前行业动态的上一个
	public Hydt findlastHydt(Integer id) throws Exception;
	//查找当前行业动态的下一个
	public Hydt findnextHydt(Integer id) throws Exception;
	

}
