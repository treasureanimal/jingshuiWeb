<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <script src="./js/prototype.lite.js" type="text/javascript"></script>
    <script src="./js/moo.fx.js" type="text/javascript"></script>
    <script src="./js/moo.fx.pack.js" type="text/javascript"></script>
	  <link rel="stylesheet" type="text/css" href="./css/skin.css" />
    <script type="text/javascript">
        window.onload = function () {
            var contents = document.getElementsByClassName('content');
            var toggles = document.getElementsByClassName('type');

            var myAccordion = new fx.Accordion(
            toggles, contents, {opacity: true, duration: 400}
            );
            myAccordion.showThisHideOpen(contents[0]);
            for(var i=0; i<document .getElementsByTagName("a").length; i++){
                var dl_a = document.getElementsByTagName("a")[i];
                    dl_a.onfocus=function(){
                        this.blur();
                    }
            }
        }
    </script>
</head>

<body>
    <table width="100%" height="280" border="0" cellpadding="0" cellspacing="0" bgcolor="#EEF2FB">
        <tr>
            <td width="182" valign="top">
                <div id="container">
                    <h1 class="type"><a href="javascript:void(0)">咨询公司</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="./images/manager/enu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="./manager/cat_add.jsp" target="main">咨询公司</a></li>
                            <li><a href="./manager/cat_manage.jsp" target="main">添加公司</a></li>
                        </ul>
                    </div>
                    <h1 class="type"><a href="javascript:void(0)">产品管理</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="./images/manager/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                             <li><a href="fenyepManager.action" target="main">产品列表</a></li>
                            <li><a href="toaaddProduct.action" target="main">添加产品</a></li>
                            <li><a href="findptProducttype.action" target="main">类型管理</a></li>
                           
                        </ul>
                    </div>
                    <h1 class="type"><a href="javascript:void(0)">新闻管理</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="./images/manager/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="./manager/order_1.jsp" target="main">新闻列表</a></li>
                            <li><a href="./manager/order_2.jsp" target="main">添加新闻</a></li>
                          		<!--<li><a href="./manager/order_3.jsp" target="main">已发货订单</a></li>
                            		<li><a href="./manager/order_4.jsp" target="main">已完成订单</a></li>
                         		-->
                         </ul>
                    </div>
                     <h1 class="type"><a href="javascript:void(0)">行业动态</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="./images/manager/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="./manager/order_1.jsp" target="main">行业动态</a></li>
                            <li><a href="./manager/order_2.jsp" target="main">添加动态</a></li>
                          		<!--<li><a href="./manager/order_3.jsp" target="main">已发货订单</a></li>
                            		<li><a href="./manager/order_4.jsp" target="main">已完成订单</a></li>
                         		-->
                         </ul>
                    </div>
                    <!-- *********** -->
                    <h1 class="type"><a href="javascript:void(0)">案例管理</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="./images/manager/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                         <ul class="RM">
                            <li><a href="./manager/goods_sort.jsp" target="main" style="font-size: 13px">案例分类</a></li>
                            <li><a href="./manager/goods_add.jsp" target="main">添加案例</a></li>
                            <li><a href="./manager/goods_list.jsp" target="main">案例列表</a></li>
                        </ul>
                    </div>
                  <!--   <h1 class="type"><a href="javascript:void(0)">系统设置</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="./images/manager/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="./manager/sys.jsp" target="main">网站设置</a></li>
                            <li><a href="./manager/admin.jsp" target="main">管理员设置</a></li>
                            <li><a href="javascript:void(0)" target="main">模板设置</a></li>
                        </ul>
                    </div>
                    *********** -->
                    <h1 class="type"><a href="javascript:void(0)">其它设置</a></h1>
                    <div class="content">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td><img src="./images/manager/menu_top_line.gif" width="182" height="5" /></td>
                            </tr>
                        </table>
                        <ul class="RM">
                            <li><a href="javascript:void(0)" target="main">友情连接</a></li>
                            <li><a href="javascript:void(0)" target="main">在线留言</a></li>
                            <li><a href="javascript:void(0)" target="main">网站投票</a></li>
                            <li><a href="javascript:void(0)" target="main">邮箱设置</a></li>
                            <li><a href="javascript:void(0)" target="main">图片上传</a></li>
                        </ul>
                    </div>
                    <!-- *********** -->
                </div>
            </td>
        </tr>
    </table>
</body>
</html>
