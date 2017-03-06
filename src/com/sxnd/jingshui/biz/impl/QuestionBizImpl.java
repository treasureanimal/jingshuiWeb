package com.sxnd.jingshui.biz.impl;

import java.util.List;

import com.sxnd.jingshui.biz.QuestionBiz;
import com.sxnd.jingshui.dao.QuestionDao;
import com.sxnd.jingshui.entity.News;
import com.sxnd.jingshui.entity.Question;

public class QuestionBizImpl implements QuestionBiz {
	private QuestionDao questionDao;
	public List<Question> findQuestion(Integer page) throws Exception {
		List<Question> questionList = questionDao.findQuestion(page);
		for (Question question : questionList) {
			String title = question.getQContent();
			//遍历出来的题目只能显示22个长度
			/*if(title.length()>22){
				title = title.substring(0,23);
				title+="...";
			}*/
		question.setQContent(title);
		}
		return questionList;
		
	}
	public int addQuestion(Question question) throws Exception {
		// TODO Auto-generated method stub
		return questionDao.addQuestion(question);
	}
	public int updateQuestion(Question question) throws Exception {
		// TODO Auto-generated method stub
		return questionDao.updateQuestion(question);
	}
	public int deleteQuestion(Question question) throws Exception {
		// TODO Auto-generated method stub
		return questionDao.deleteQuestion(question);
	}
	public Integer findPageCount() throws Exception {
		// TODO Auto-generated method stub
		return questionDao.findPageCount();
	}
	public Question findQuestionById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return questionDao.findQuestionById(id);
	}
	public QuestionDao getQuestionDao() {
		return questionDao;
	}
	public void setQuestionDao(QuestionDao questionDao) {
		this.questionDao = questionDao;
	}
	
}
