<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'cat_manage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <link rel="stylesheet" type="text/css" href="./Style/skin.css" />
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
                        <!-- 添加栏目开始 -->
                        <tr>
                            <td width="2%">&nbsp;</td>
                            <td width="96%">
                                <table width="100%">
                                    <tr>
                                        <td colspan="2">
                                            <form action="" method="">
                                                <table width="100%"  class="cont tr_color">
                                                    <tr>
                                                        <th>排序</th>
                                                        <th>栏目名称</th>
                                                        <th>栏目类型</th>
                                                        <th>显示/隐藏</th>
                                                        <th>栏目位置</th>
                                                        <th>操作</th>
                                                    </tr>
                                                    <tr align="center" class="d">
                                                        <td>1</td>
                                                        <td>公司首页</td>
                                                        <td>链接</td>
                                                        <td>显示</td>
                                                        <td>顶部底部</td>
                                                        <td>编辑 删除 内容管理</td>
                                                    </tr>
                                                    <tr align="center" class="d">
                                                        <td>2</td>
                                                        <td>公司首页</td>
                                                        <td>链接</td>
                                                        <td>显示</td>
                                                        <td>顶部底部</td>
                                                        <td>编辑 删除 内容管理</td>
                                                    </tr>
                                                    <tr align="center" class="d">
                                                        <td>3</td>
                                                        <td>公司首页</td>
                                                        <td>链接</td>
                                                        <td>显示</td>
                                                        <td>顶部底部</td>
                                                        <td>编辑 删除 内容管理</td>
                                                    </tr>
                                                    <tr align="center" class="d">
                                                        <td>4</td>
                                                        <td>公司首页</td>
                                                        <td>链接</td>
                                                        <td>显示</td>
                                                        <td>顶部底部</td>
                                                        <td>编辑 删除 内容管理</td>
                                                    </tr>
                                                    <tr align="center" class="d">
                                                        <td>5</td>
                                                        <td>公司首页</td>
                                                        <td>链接</td>
                                                        <td>显示</td>
                                                        <td>顶部底部</td>
                                                        <td>编辑 删除 内容管理</td>
                                                    </tr>
                                                    <tr align="center" class="d">
                                                        <td>6</td>
                                                        <td>公司首页</td>
                                                        <td>链接</td>
                                                        <td>显示</td>
                                                        <td>顶部底部</td>
                                                        <td>编辑 删除 内容管理</td>
                                                    </tr>
                                                    <tr align="center" class="d">
                                                        <td>7</td>
                                                        <td>公司首页</td>
                                                        <td>链接</td>
                                                        <td>显示</td>
                                                        <td>顶部底部</td>
                                                        <td>编辑 删除 内容管理</td>
                                                    </tr>
                                                    <tr align="center" class="d">
                                                        <td>5</td>
                                                        <td>公司首页</td>
                                                        <td>链接</td>
                                                        <td>显示</td>
                                                        <td>顶部底部</td>
                                                        <td>编辑 删除 内容管理</td>
                                                    </tr>
                                                    <tr align="center" class="d">
                                                        <td>6</td>
                                                        <td>公司首页</td>
                                                        <td>链接</td>
                                                        <td>显示</td>
                                                        <td>顶部底部</td>
                                                        <td>编辑 删除 内容管理</td>
                                                    </tr>
                                                </table>
                                            </form>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                            <td width="2%">&nbsp;</td>
                        </tr>
                        <!-- 添加栏目结束 -->
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