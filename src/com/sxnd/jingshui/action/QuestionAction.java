package com.sxnd.jingshui.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sxnd.jingshui.biz.QuestionBiz;
import com.sxnd.jingshui.entity.News;
import com.sxnd.jingshui.entity.Question;

public class QuestionAction extends ActionSupport   {
		private QuestionBiz questionBiz;
		private Map session;
		private Integer pages;
		private Integer nextpage;
		private Integer backpage;
		private Integer nowpage;
		private Question question;
		private Integer id;
		
		
		public String find(){
			System.out.println("findQuestionanswer");
			session = ActionContext.getContext().getSession();
			try{
				if(nowpage==null||nowpage==0){
					nowpage=1;
				}
				List<Question> questionList = questionBiz.findQuestion(nowpage);
				pages = questionBiz.findPageCount();
				backpage = nowpage-1;
				if(backpage<1)
					backpage = 1;
				nextpage = nowpage+1;
				if(nextpage>pages)
					nextpage = pages;
			
				session.put("pages", pages);
				session.put("nowpage", nowpage);
				session.put("questionList", questionList);
				}catch(Exception e){
					e.printStackTrace();
				}
				return "findquestion_success";
			
		}
		public String findquestionById() throws Exception {
			try{
				question = questionBiz.findQuestionById(id);
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return "findQuestionById_success";
		}
		public QuestionBiz getQuestionBiz() {
			return questionBiz;
		}
		public void setQuestionBiz(QuestionBiz questionBiz) {
			this.questionBiz = questionBiz;
		}
		public Map getSession() {
			return session;
		}
		public void setSession(Map session) {
			this.session = session;
		}
		public Integer getPages() {
			return pages;
		}
		public void setPages(Integer pages) {
			this.pages = pages;
		}
		public Integer getNextpage() {
			return nextpage;
		}
		public void setNextpage(Integer nextpage) {
			this.nextpage = nextpage;
		}
		public Integer getBackpage() {
			return backpage;
		}
		public void setBackpage(Integer backpage) {
			this.backpage = backpage;
		}
		public Integer getNowpage() {
			return nowpage;
		}
		public void setNowpage(Integer nowpage) {
			this.nowpage = nowpage;
		}
		public Question getQuestion() {
			return question;
		}
		public void setQuestion(Question question) {
			this.question = question;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		
		
}
