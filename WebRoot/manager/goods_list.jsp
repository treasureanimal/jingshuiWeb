<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'goods_list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <link rel="stylesheet" type="text/css" href="./Style/skin.css" />
	 <script type="text/javascript"  src="./js/jquery.min.1.11.3.js"></script>
	 <script type="text/javascript">
	 	function quanxuan(op){
	 		var chk = document.getElementsByName("delproduct");
	 		for(var i=0;i<chk.length;i++){
	 			var chk_pro = chk.item(i);
		 		if(chk_pro.type=="checkbox"){
		 			chk_pro.checked = op;	
		 		}
	 		}
	 	}
	 	function doSearch(npage){
		if(npage!=null){
			document.getElementById("sform").nowpage.value=npage ;
		}
		document.getElementById("sform").submit();
	}
		function shanchu(delid){
			if(confirm("是否确认删除")){
				location.href="deleteProduct?pid="+delid;
			}
			
		}
		//批量删除
		function shanchumany(){
			var delids = "";
			var Checkbox=false;
			$("input[name='delproduct']").each(function() {
			if(this.checked==true){
				delids +=this.value+",";
				Checkbox=true;
			}
				
			});
			document.deleteform.delemanyIds.value=delids;
			if(Checkbox){
				var t=confirm("您确定要删除选定的内容吗");
				if(t==false){
					return false;
				}
				alert("aa:"+document.deleteform.delemanyIds.value);	
				document.deleteform.submit();
			}
			else{
				alert("请选择您要删除的内容");
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
                    <table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" background="././Images/content_bg.gif">
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
                        <!-- 产品列表开始 -->
                        <tr>
                            <td width="2%">&nbsp;</td>
                            <td width="96%">
                                <table width="100%">
                                    <tr>
                                        <td colspan="2">
                                            <!-- <form action="fenyeproductProduct.action" method=""> -->
                                                <table width="100%"  class="cont tr_color" border="0" >
                                                
                                                    <tr>
                                                        <th>选中</th>
                                                        <th>产品名称</th>
                                                        <th>产品图片</th>
                                                        <th>产品容量</th>
                                                        <th>产品类型</th>
                                                        <th>适用水压</th>
                                                        <th>额定功率</th>
                                                        <th>电源</th>
                                                        <th>过滤系统</th>
                                                        <th>出水咀数</th>
                                                        <th>使用人数</th>
                                                        <th>操作</th>
                                                    </tr>
                                                    <c:forEach var="product" items="${productList}">
                                                    <tr align="center" class="d"  style="height: 55px; width: 45px" >
                                                    
                                                        <td><input type="checkbox" name="delproduct" value="${product.PId}" /></td>
                                                        <td>${product.PName}</td>
                                                        <td><img style="width: 55px;height: 40px" src="images/${product.PImg}" alt=""></td>
                                                        <td>${product.PVolume}</td>
                                                        <td>${product.producttype.ptName}</td>
                                                        <td>${product.PKpa}</td>
                                                        <td>${product.PWate}</td>
                                                        <td>${product.PLine}</td>
                                                        <td>${product.PSystem}</td>
                                                        <td>${product.PYield}</td>
                                                        <td>${product.PUsernumber}</td>
                                                        
                                                        <td>
                                                        	<a href="javascript:shanchu(${product.PId})">删除</a>
                                                        	<a href="toupdateproductProduct.action?pid=${product.PId}">编辑</a>
                                                        </td>
                                                        
                                                    </tr>
                                                    </c:forEach>
                                                    <a href="javascript:quanxuan(true)">全选</a>| <a href="javascript:quanxuan(false)">全不选</a>&nbsp&nbsp&nbsp<a href="javascript:shanchumany()">删除</a>
                                                </table>
                                                <div class="page">
                
				  <A href="fenyepManager.action?nowpage=1&ptid=${ptid }">首页</A>
				  <A href="fenyepManager.action?nowpage=${backpage}&ptid=${ptid }">上一页</A>
				  <A href="fenyepManager.action?nowpage=${nextpage }&ptid=${ptid }">下一页</A>
				  <A href="fenyepManager.action?nowpage=${pages }&ptid=${ptid }">末页</A>
				  <SPAN class=total>${nowpage }/${pages}页</SPAN> 
            </div>
                                            </form>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                            <td width="2%">&nbsp;</td>
                        </tr>
                        <!-- 产品列表结束 -->
                        <tr>
                            <td height="40" colspan="4">
                                <table width="100%" height="1" border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
                                    <tr><td></td></tr>
                                </table>
                            </td>
                        </tr>
                        <form name="deleteform" action="deleteManyProduct.action" method="post">
                        	<input type="hidden" name="delemanyIds" value="">
                        </form>
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