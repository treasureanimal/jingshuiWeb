<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'goods_add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="./Style/skin.css" />
	<script type="text/javascript">
		function submitForm(){
			alert("添加成功");
			document.addsuccess.submit();
		}
 		//验证用户姓名
 		function checkusername() {
	 		var username = jQuery("#username").val();
	 		var reg = /^[\u4E00-\u9FA5]{2,4}$/;
	 		if(username=="") {
	 			jQuery("#showright_username").html("");
	 			jQuery("#showerror_username").html("用户姓名不能为空");
	 			return false; 	
	 		}
	 		if(!reg.test(username)) {
	 			jQuery("#showright_username").html("");
	 			jQuery("#showerror_username").html("用户姓名格式不正确");
	 			return false;
	 		}
	 		jQuery("#showright_username").html("用户姓名输入正确");
	 		jQuery("#showerror_username").html("");
	 		return true;
	 	}
	 	//验证邮箱
	 	function checkemail() {
	 		var emailStr = jQuery("#useremail").val();
	 		var reg = /^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$/;
	 		/* if(emailStr=="") {
	 			jQuery("#showright_useremail").html("");	
	 			jQuery("#showerror_useremail").html("用户邮箱不能为空");
	 			return false;
	 		} */
	 		if(!reg.test(emailStr)) {
	 			jQuery("#showright_useremail").html("");	
	 			jQuery("#showerror_useremail").html("用户邮箱格式不正确");
	 			return false;
	 		}
	 		jQuery("#showright_useremail").html("用户邮箱格式正确");
	 		jQuery("#showerror_useremail").html("");
	 		return true;
	 	}
	 	//验证密码
	 	function checkpwd1() {
	 		var passwordstr = jQuery("#password").val();
	 		if(passwordstr=="") {
	 			jQuery("#showright_password").html("");	
				jQuery("#showerror_password").html("用户密码不能为空");	
				return false;	
	 		}
	 		if(passwordstr.length<6 || passwordstr.length>16) {
	 			jQuery("#showright_password").html("");	
				jQuery("#showerror_password").html("用户密码为6到16位,请重新输入");	
				return false;	
	 		}
	 		jQuery("#showerror_password").html("");
	 		jQuery("#showright_password").html("密码格式正确");	
	 		return true;
	 	}
	 	
	 	//验二次证密码
	 	function checkpwd2() {
	 		var passwordstr1 = jQuery("#password").val();
	 		var passwordstr2 = jQuery("#repassword").val();
	 		if(passwordstr1!=passwordstr2) {
		 		jQuery("#showright_repassword").html("");
		 		jQuery("#showerror_repassword").html("两次输入密码不一致");	
	 			return false;
	 		}
	 		jQuery("#showerror_repassword").html("");
	 		jQuery("#showright_repassword").html("两次输入密码正确");	
	 		return true;
	 	}
	 	
	 	//最终提交验证
	 	function submitform(){
	 		var ckusername= checkusername();
	 		var ckemail=checkemail();
	 		var ckpwd1=checkpwd1();
	 		var ckpwd2=checkpwd2();
	 		
	 		if(ckusername && ckemail && ckpwd1 && ckpwd2) {
	 			return true;
	 		}else {
	 		return false; 
	 		}
	 	}
 </script>
</head>
    <body>
        <table width="100%" border="0" cellpadding="0" cellspacing="0">
            <!-- 头部开始 -->
            <tr>
                <td width="17" valign="top" background="./images/manager/mail_left_bg.gif">
                    <img src="./images/manager/left_top_right.gif" width="17" height="29" />
                </td>
                <td valign="top" background="./images/manager/content_bg.gif">
                    <table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" background="././images/manager/content_bg.gif">
                        <tr><td height="31"><div class="title">添加栏目</div></td></tr>
                    </table>
                </td>
                <td width="16" valign="top" background="./images/manager/mail_right_bg.gif"><img src="./images/manager/nav_right_bg.gif" width="16" height="29" /></td>
            </tr>
            <!-- 中间部分开始 -->
            <tr>
                <!--第一行左边框-->
                <td valign="middle" background="./images/manager/mail_left_bg.gif">&nbsp;</td>
                <!--第一行中间内容-->
                <td valign="top" bgcolor="#F7F8F9">
                    <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
                        <!-- 空白行-->
                        <tr><td colspan="2" valign="top">&nbsp;</td><td>&nbsp;</td><td valign="top">&nbsp;</td></tr>
                        <tr>
                            <td colspan="4">
                                <table>
                                    <tr>
                                        <td width="100" align="center"><img src="./images/manager/mime.gif" /></td>
                                        <td valign="bottom"><h3 style="letter-spacing:1px;">在这里，您可以根据您的需求，填写网站参数！</h3></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <!-- 一条线 -->
                        <tr>
                            <td height="40" colspan="4">
                                <table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                                    <tr><td></td></tr>
                                </table>
                            </td>
                        </tr>
                        <!-- 添加产品开始 -->
                        <tr>
                            <td width="2%">&nbsp;</td>
                            <td width="96%">
                                <table width="100%">
                                    <tr>
                                        <td colspan="2">
                                            <form action="addProduct.action" enctype="multipart/form-data" target="_self" name="addsuccess" method="post">
                                                <table width="100%"class="cont">
                                                     <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td width="15%">产品名称：</td>
                                                        <td width="25%"><input class="text" type="text" name="product.PName" /></td>
                                                        <td>设置产品名称</td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                    <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>水胆容量：</td>
                                                        <td width="20%"><input class="text" type="text" name="product.PVolume" /></td>
                                                        <td>设置产品容量</td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                               
                                                     <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>额定功率：</td>
                                                        <td width="20%"><input class="text" type="text" name="product.PWate" /></td>
                                                        <td>设置产品额定功率</td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                     <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>电源：</td>
                                                        <td width="20%"><input class="text" type="text" name="product.PLine" /></td>
                                                        <td>设置电源线长度</td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                      <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>使用人数：</td>
                                                        <td width="20%"><input class="text" type="text" name="product.PUsernumber" /></td>
                                                        <td>设置使用人数</td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                     <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>产品图片：</td>
                                                        <td width="20%">
                                                        <input type="file"name="image">
                                                        </td>
                                                        <td>上传产品图片</td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr> 
                                                    <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>过滤系统：</td>
                                                         <td>
                                                         	<select name="product.PSystem">
	                                                        	<option>请选择...</option>
	                                                        	<option value="一级过滤">一级过滤</option>
	                                                        	<option value="二级过滤">二级过滤</option>
	                                                        	<option value="三级过滤">三级过滤</option>
                                                        	</select>
                                                         </td>
                                                        <td>设置产品编号</td>
                                                        <td>&nbsp;</td>
                         		                           </tr>
                                                  <!--   <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>产品价格：</td>
                                                        <td width="20%"><input class="text" style="width:100px;" type="text" name="cat_name" value="" /></td>
                                                        <td>填写产品价格</td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr> -->
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>产品出水咀数：</td>
                                                        <td>
                                                            <select name="product.PYield">
                                                                <option>请选择...</option>
                                                                <option value="一温一开">一温一开</option>
                                                                <option value="一温两开">一温两开</option>
                                                                <option value="一凉一开">一凉一开</option>
                                                                <option value="两温一开">两温一开</option>
                                                                <option value="两凉一开">两凉一开</option>
                                                                <option value="两温两开">两温两开</option>
                                                            </select>
                                                        </td>
                                                        <td>设置产品级别</td>
                                                        <td>&nbsp;</td>
                                                    </tr> 
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>适用水压：</td>
                                                        <td>
                                                            <select name="product.PKpa">
                                                                <option selected="true">请选择...</option>
                                                                <option value="100-600(kpa)">100-600(kpa)</option>
                                                                <option value="600-800(kpa)">600-800(kpa)</option>
                                                                <option value="800-1000(kpa)">800-1000(kpa)</option>
                                                                <option value="1000以上">1000以上</option>
                                                            </select>
                                                        </td>
                                                        <td>设置适用水压</td>
                                                        <td>&nbsp;</td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>产品类型：</td>
                                                        <td>
                                                            <select name="product.producttype.ptId">
                                                                <option selected="true">请选择...</option>
                                                                <c:forEach var="producttype" items="${producttypeList}">
                                                                	<option value="${producttype.ptId}">${producttype.ptName}</option>
                                                                </c:forEach>
                                                              
                                                            </select>
                                                        </td>
                                                        <td>设置产品分类</td>
                                                        <td>&nbsp;</td>
                                                    </tr> 
                                      
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td colspan="3"><input class="btn" type="button" onclick="submitForm()"  value="添加" /></td>
                                                        <td>&nbsp;</td>
                                                    </tr>
                                                </table>
                                            </form>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                            <td width="2%">&nbsp;</td>
                        </tr>
                        <!-- 添加产品结束 -->
                        <tr>
                            <td height="40" colspan="4">
                                <table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                                    <tr><td></td></tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td width="2%">&nbsp;</td>
                            <td width="51%" class="left_txt">
                                <img src="./images/manager/icon_mail.gif" width="16" height="11"> 客户服务邮箱：rainman@foxmail.com<br />
                                <img src="./images/manager/icon_phone.gif" width="17" height="14"> 官方网站：<a href="http://www.mycodes.net/" target="_blank">源码之家</a>
                            </td>
                            <td>&nbsp;</td><td>&nbsp;</td>
                        </tr>
                    </table>
                </td>
                <td background="./images/manager/mail_right_bg.gif">&nbsp;</td>
            </tr>
            <!-- 底部部分 -->
            <tr>
                <td valign="bottom" background="./images/manager/mail_left_bg.gif">
                    <img src="./images/manager/buttom_left.gif" width="17" height="17" />
                </td>
                <td background="./images/manager/buttom_bgs.gif">
                    <img src="./images/manager/buttom_bgs.gif" width="17" height="17">
                </td>
                <td valign="bottom" background="./images/manager/mail_right_bg.gif">
                    <img src="./images/manager/buttom_right.gif" width="16" height="17" />
                </td>           
            </tr>
        </table>
    </body>
</html>