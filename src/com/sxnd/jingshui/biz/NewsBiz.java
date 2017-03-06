package com.sxnd.jingshui.biz;

import java.util.List;

import com.sxnd.jingshui.entity.Hydt;
import com.sxnd.jingshui.entity.News;

public interface NewsBiz {
	
	public int addNews(News news) throws Exception;
	
	public int updateNews(News news)throws Exception;
	
	public int deleteNews(News news)throws Exception;
	
	//��ҳ��ѯ����
	public List<News> findNews(Integer page)throws Exception;
	
	//��ѯ��ҳ��
	public Integer findPageCount()throws Exception;
	
	//��ѯ������ʾ9������Ϊ����
	public List<News> findNewsByNine() throws Exception;
	
	//��������id��ѯ����
	public News findNewsById(Integer id) throws Exception;
	
	public News findlastNews(Integer id) throws Exception;
	
	public News findnextNews(Integer id) throws Exception;
	
}
