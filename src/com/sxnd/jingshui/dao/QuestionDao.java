package com.sxnd.jingshui.dao;

import java.util.List;

import com.sxnd.jingshui.entity.News;
import com.sxnd.jingshui.entity.Question;

public interface QuestionDao {
	
	public List<Question> findQuestion(Integer page) throws Exception;
	
	public int addQuestion(Question question) throws Exception;
	
	public int updateQuestion(Question question) throws Exception;
	
	public int deleteQuestion(Question question) throws Exception;
	
	//��ѯ��ҳ��
	public Integer findPageCount()throws Exception;
			
	//���ݳ�������id��ѯ����
	public Question findQuestionById(Integer id) throws Exception;
}