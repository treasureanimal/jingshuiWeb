package com.sxnd.jingshui.dao;

import java.util.List;

import com.sxnd.jingshui.entity.News;
import com.sxnd.jingshui.entity.Question;

public interface QuestionDao {
	
	public List<Question> findQuestion(Integer page) throws Exception;
	
	public int addQuestion(Question question) throws Exception;
	
	public int updateQuestion(Question question) throws Exception;
	
	public int deleteQuestion(Question question) throws Exception;
	
	//查询总页数
	public Integer findPageCount()throws Exception;
			
	//根据常见问题id查询内容
	public Question findQuestionById(Integer id) throws Exception;
}
