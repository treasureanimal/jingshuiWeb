<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <TITLE> 用户注册</TITLE>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<LINK rel=stylesheet type=text/css href="css/styles.css">
	<LINK rel=stylesheet type=text/css href="css/login.css">
  </head>
  
  <body>
  <div class="login">
 <DIV id=regLogin class=wrap>
<DIV class=dialog>
<DL class=clearfix>
  <DT>新用户注册</DT>
  <DD class=past>填写个人信息</DD></DL>
<DIV class=box>
<FORM action="addYonghu.action" method="post">
<DIV class=infos>
<TABLE class=field>
  <TBODY>
  <TR>
    <TD class=field>用 户 名：</TD>
    <TD><INPUT class=text type=text name="yh.yhname"> 
    <s:fielderror fieldName="yh.yhname"></s:fielderror>
    </TD></TR>
  <TR>
    <TD class=field>密　　码：</TD>
    <TD><INPUT class=text type=password name="yh.yhpwd">
    <s:fielderror fieldName="yh.yhpwd"></s:fielderror>
    </TD></TR>
  <TR>
    <TD class=field>确认密码：</TD>
    <TD><INPUT class=text type=password name="repassword"> 
    <s:fielderror fieldName="repassword"></s:fielderror>
    </TD></TR>
  <TR>
    <TD class=field>电　　话：</TD>
    <TD><INPUT class=text type=text name="yh.yhphone"> 
    <s:fielderror fieldName="yh.yhphone"></s:fielderror>
    </TD></TR>
  </TBODY>
  </TABLE>
<DIV class=buttons>
<INPUT value=立即注册 type="submit">
</DIV></DIV></FORM></DIV></DIV></DIV></div>
<DIV id=footer class=wrap>
<DL>
  <DD>关于我们 · 联系方式 · 意见反馈 · 帮助中心</DD></DL></DIV>
  </body>
</html>
