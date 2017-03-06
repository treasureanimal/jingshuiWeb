package com.sxnd.jingshui.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sxnd.jingshui.dao.QuestionDao;
import com.sxnd.jingshui.entity.News;
import com.sxnd.jingshui.entity.Question;

public class QuestionDaoImpl extends HibernateDaoSupport implements QuestionDao {

	public List<Question> findQuestion(Integer page) throws Exception {
		String hqlStr = "from Question";
		Session session = this.getSession();
		Query query = session.createQuery(hqlStr);
		query.setFirstResult(5*(page-1));
		query.setMaxResults(5);
		List<Question> questionList = query.list();
		return questionList;
	}

	public int addQuestion(Question question) throws Exception {
		Session session = this.getSession();
		session.save(question);
		return 1;
	}

	public int updateQuestion(Question question) throws Exception {
		Session session = this.getSession();
		session.update(question);
		return 1;
	}

	public int deleteQuestion(Question question) throws Exception {
		Session session = this.getSession();
		session.delete(question);
		return 1;
	}

	public Integer findPageCount() throws Exception {
		String hqlStr = "select count(q) from Question q";
		Session session = this.getSession();
		Query query = session.createQuery(hqlStr);
		Object object=query.uniqueResult();
		int ts=Integer.parseInt(object.toString());
		int pageCount=0;
		if(ts%5==0){
			pageCount=ts/5;
			
		}else{
			pageCount=ts/5+1;
		}
		
		
		return pageCount;
		
	}

	public Question findQuestionById(Integer id) throws Exception {
		Session session = this.getSession();
		String hqlStr = "from Question q where q.QId = :qid";
		Query query = session.createQuery(hqlStr);
		query.setInteger("qid", id);
		Question question = (Question) query.uniqueResult();
		return question;
		
		
	}

}
