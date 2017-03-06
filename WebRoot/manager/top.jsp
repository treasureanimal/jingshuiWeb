<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <base href="<%=basePath%>">
    
    <title>My JSP 'top.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <link rel="stylesheet" type="text/css" href="./css/skin.css" />
    <script type="text/javascript">
        function logout() {
            if(window.confirm('您确定要退出吗？')) {
                top.location = './page/login.jsp';
            }
        }       
    </script>
</head>
    <body>
        <table cellpadding="0" width="100%" height="64" background="./images/manager/top_top_bg.gif">
        <c:forEach var="yonghu" items="loginYh">
            <tr valign="top">
                <td width="50%"><a href="javascript:void(0)" style="color:#0F0;border:none; font-family:'楷体'; font-size:30px">网站后台管理中心</a></td>
                <td width="30%" style="padding-top:13px;font:15px Arial,SimSun,sans-serif;color:#FFF">管理员：<b>${loginYh.yhname}</b> 您好，感谢登陆使用！</td>
<!--                 <td style="padding-top:10px;" align="center"><a href="javascript:void(0)"><img style="border:none" src="./images/manager/index.gif" /></a></td> -->
                <td style="padding-top:10px;" align="center"><a href="javascript:void(0)"><img style="border:none" src="./images/manager/out.gif" onclick="logout();" /></td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>