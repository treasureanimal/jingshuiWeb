<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">

 <!-- 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
 -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'about.jsp' starting page</title>
    
<link rel="Shortcut Icon" href="favicon.ico" />
<link href="css/login.css" rel="stylesheet" charset="utf-8" type="text/css" />
<script type="text/javascript">
		function refresh() {
			document.getElementById("image").src="createImage.action?"+Math.random()+new Date();
		}
	</script>
</head>


<body>
    <div class="login">
        <div class="loginbox">
        	<div class="login_top">欢迎来到登陆界面</div>
            <div class="loginmain" >
                <form action="loginYonghu.action" method="post">
                
                <div class="loginname">用户名：<input id="txt_loginName" type="text" name="yh.yhname">
                	<s:fielderror fieldName="yh.yhname"></s:fielderror> 
                </div>
                <div class="loginpwd">密 &nbsp;码：<input id="txt_pwd" type="password" name="yh.yhpwd" >
                	<s:fielderror fieldName="yh.yhpwd"></s:fielderror>
                </div> 
                <div class="loginyzm">验证码： <input id="txt_yzm" name="checkCode"  type="text" class=""></div>
                 <div class="yzm"><img id="image" src="createImage.action" title="看不清 换一张" alt="" width="100" height="32" class="passcode" style="height:43px;cursor:pointer;" onclick="refresh()" alt="" />
                	  <s:fielderror fieldName="checkCode" cssStyle="color:red"></s:fielderror>        
                </div>
                <div class="autobtn">
                	<div class="autobtn_left"><a href="page/regs.jsp">立即注册</a></div>
                    <!--<div class="autobtn_right"><a href="">忘记密码</a></div>
                --></div>
                <input id="btn_login" type="submit"  class="loginbtn" value="">
                <input id="btn_reset" type="button" class="resetbtn" value="">
                </form>
            </div>
          
        </div>
    </div>
    <div class="seereals_loading"></div>

<div style="text-align:center;">
</div>

</body>
</html>
