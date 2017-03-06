package com.sxnd.jingshui.dao;

import com.sxnd.jingshui.entity.Answer;

public interface AnswerDao {
	
	public Answer findAnswerByQuestQid(Integer qid) throws Exception;

}
