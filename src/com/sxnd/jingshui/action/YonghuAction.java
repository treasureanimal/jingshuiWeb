package com.sxnd.jingshui.action;

import java.util.Map;

import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sxnd.jingshui.biz.YonghuBiz;
import com.sxnd.jingshui.entity.Yonghu;

public class YonghuAction extends ActionSupport {
	private YonghuBiz yonghuBiz;
	private Map<String ,Object> session;
	private Yonghu yh;
	private String msg;
	public String login() throws Exception{
		try{
			System.out.println("进入login方法");
			session = ActionContext.getContext().getSession();
			System.out.println("hh"+yh.getYhname()+yh.getYhpwd());
			Yonghu loginYh = yonghuBiz.findyonghuByNameAndpass(yh.getYhname(),yh.getYhpwd());
			if(loginYh!=null){
				session.put("loginYh", loginYh);
				if("1".equals(loginYh.getIsadmin())){
					
					return "admin_success";
				}else{
					
					return "login_success";
				}
			}
		return "error_success";
		
		}catch(Exception e){
			e.printStackTrace();
			return "exception";
		}	
	}
	//注册
	public String add() throws Exception{
		try{
			int resu = yonghuBiz.addYonghu(yh);
			if(resu==0){
				msg = "用户名已拥有，请重新注册";
				return "add_error";
			}
			return "add_success"; 
		}catch(Exception e){
			e.printStackTrace();
			return "exception";
		}	
	}
	
	public YonghuBiz getYonghuBiz() {
		return yonghuBiz;
	}
	public void setYonghuBiz(YonghuBiz yonghuBiz) {
		this.yonghuBiz = yonghuBiz;
	}
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public Yonghu getYh() {
		return yh;
	}
	public void setYh(Yonghu yh) {
		this.yh = yh;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
