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
    
    <title>My JSP 'goods_add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="./Style/skin.css" />
	<script type="text/javascript">
		function submitForm1(){
			alert("修改成功");
			document.updatesuccess.submit();
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
                                            <form action="updateproductProduct.action" enctype="multipart/form-data" name="updatesuccess" method="post">
                                                <table width="100%"class="cont">
                                                    <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td width="15%">产品名称：</td>
                                                        <td width="25%"><input class="text" type="text" name="product.PName" value="${product.PName}" /></td>
                                                        <td>设置产品名称</td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                    <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>水胆容量：</td>
                                                        <td width="20%"><input class="text" type="text" name="product.PVolume" value="${product.PVolume}" /></td>
                                                        <td>设置产品容量</td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                               <!--       <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>供水量：</td>
                                                        <td width="20%"><input class="text" type="text" name="product.PLine" value="" /></td>
                                                        <td>设置产品供水量，不填将自动创建!</td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr> -->
                                                     <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>额定功率：</td>
                                                        <td width="20%"><input class="text" type="text" name="product.PWate" value="${product.PWate}" /></td>
                                                        <td>设置产品额定功率</td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                     <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>电源：</td>
                                                        <td width="20%"><input class="text" type="text" name="product.PLine" value="${product.PLine}" /></td>
                                                        <td>设置电源线长度</td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                      <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>使用人数：</td>
                                                        <td width="20%"><input class="text" type="text" name="product.PUsernumber" value="${product.PUsernumber}" /></td>
                                                        <td>设置使用人数</td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                    <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>产品图片：</td>
                                                        <td width="20%">
                                                        <img style="width: 55px;height: 40px" src="images/${product.PImg}" alt="">
                                                        <input type="file" name="image" value="${product.PImg}">
                                                        </td>
                                                        <td>上传产品图片</td>
                                                        <td width="2%">&nbsp;</td>
                                                    </tr>
                                                    <tr>
                                                        <td width="2%">&nbsp;</td>
                                                        <td>过滤系统：</td>
                                                        <!-- <td width="20%"><input class="text" style="width:50px;" type="text" name="cat_name" value="" /></td>
                                                         -->
                                                         <td>
                                                         	<select name="product.PSystem">
                                                         	
	                                                        	<option selected="true" value="${product.PSystem }">${product.PSystem }</option>
	                                                        	<option <c:if test="${product.PSystem eq '一级过滤'}">selected="selected"</c:if>>一级过滤</option>
	                                                        	<option <c:if test="${product.PSystem eq '二级过滤'}">selected="selected"</c:if>>二级过滤</option>
	                                                        	<option <c:if test="${product.PSystem eq '三级过滤'}">selected="selected"</c:if>>三级过滤</option>
	                                                        
                                                        	</select>
                                                         </td>
                                                        <td>设置产品编号</td>
                                                        <td>&nbsp;</td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td>产品出水咀数：</td>
                                                        <td>
                                                            <select name="product.PYield">
                                                                <option selected="true" value="${product.PYield}">${product.PYield}</option>
                                                                <option <c:if test="${product.PYield eq '一温一开'}">selected="selected"</c:if>>一温一开</option>
                                                                <option <c:if test="${product.PYield eq '一温两开'}">selected="selected"</c:if>>一温两开</option>
                                                                <option <c:if test="${product.PYield eq '一凉一开'}">selected="selected"</c:if>>一凉一开</option>
                                                                <option <c:if test="${product.PYield eq '两温一开'}">selected="selected"</c:if>>两温一开</option>
                                                                <option <c:if test="${product.PYield eq '两凉一开'}">selected="selected"</c:if>>两凉一开</option>
                                                                <option <c:if test="${product.PYield eq '两温两开'}">selected="selected"</c:if>>两温两开</option>
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
                                                                <option selected="true" value="${product.PKpa}">${product.PKpa}</option>
                                                                <option <c:if test="${product.PKpa eq '100-600(kpa)'}">selected="selected"</c:if>>100-600(kpa)</option>
                                                                <option <c:if test="${product.PKpa eq '600-800(kpa)'}">selected="selected"</c:if>>600-800(kpa)</option>
                                                                <option <c:if test="${product.PKpa eq '800-1000(kpa)'}">selected="selected"</c:if>>800-1000(kpa)</option>
                                                                <option <c:if test="${product.PKpa eq '1000以上'}">selected="selected"</c:if>>1000以上</option>
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
                                                                
                                                                <c:forEach var="producttype" items="${producttypeList}">
                                                                <option value="${producttype.ptId}">${producttype.ptName}</option>
                                                                </c:forEach>
                                                              <!--   <option>公司动态</option>
                                                                <option>产品展示</option>
                                                                <option>关于我们</option> -->
                                                            </select>
                                                        </td>
                                                        <td>设置产品分类</td>
                                                        <td>&nbsp;</td>
                                                    </tr>
                                                    <tr>
                                                        <td>&nbsp;</td>
                                                        <td colspan="3"><input class="btn" type="button" onclick="submitForm1()" value="修改" /></td>
                                                        <td>&nbsp;</td>
                                                    </tr> 
                                                </table>
                                                <input type="hidden" name="product.PId" value="${product.PId}">
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