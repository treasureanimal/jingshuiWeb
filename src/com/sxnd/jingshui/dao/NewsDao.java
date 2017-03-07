package com.sxnd.jingshui.dao;

import java.util.List;

import com.sxnd.jingshui.entity.Hydt;
import com.sxnd.jingshui.entity.News;

public interface NewsDao {
	
	public int addNews(News news) throws Exception;
	
	public int updateNews(News news)throws Exception;
	
	public int deleteNews(Integer nid)throws Exception;
	
	//分页查询新闻
	public List<News> findNews(Integer page)throws Exception;
	
	//查询总页数
	public Integer findPageCount()throws Exception;
	
	//查询新闻显示9个汉字为标题
	public List<News> findNewsByNine() throws Exception;
	
	//根据新闻id查询内容
	public News findNewsById(Integer id) throws Exception;
	
}
