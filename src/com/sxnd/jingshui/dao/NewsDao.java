package com.sxnd.jingshui.dao;

import java.util.List;

import com.sxnd.jingshui.entity.Hydt;
import com.sxnd.jingshui.entity.News;

public interface NewsDao {
	
	public int addNews(News news) throws Exception;
	
	public int updateNews(News news)throws Exception;
	
	public int deleteNews(Integer nid)throws Exception;
	
	//��ҳ��ѯ����
	public List<News> findNews(Integer page)throws Exception;
	
	//��ѯ��ҳ��
	public Integer findPageCount()throws Exception;
	
	//��ѯ������ʾ9������Ϊ����
	public List<News> findNewsByNine() throws Exception;
	
	//��������id��ѯ����
	public News findNewsById(Integer id) throws Exception;
	
}
