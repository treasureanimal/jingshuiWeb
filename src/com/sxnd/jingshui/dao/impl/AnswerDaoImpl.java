package com.sxnd.jingshui.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sxnd.jingshui.dao.AnswerDao;
import com.sxnd.jingshui.entity.Answer;

public class AnswerDaoImpl extends HibernateDaoSupport implements AnswerDao {

	public Answer findAnswerByQuestQid(Integer Qid) throws Exception {
		Session session = this.getSession();
		String hqlStr = "from Answer an where an.qid = :qid";
		Query query = session.createQuery(hqlStr);
		query.setInteger("qid",Qid);
		Answer answer =(Answer) query.uniqueResult();
		return answer;
	}

}
