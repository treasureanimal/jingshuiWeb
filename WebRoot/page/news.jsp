<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'news.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/style.css">
    <script src="js/jquery.min.1.11.3.js"></script>
    <script src="js/SuperSlide.2.1.1.js"></script>
    <script src="js/js.js"></script>
  </head>
  
  <body>&nbsp; 
    <header class="index_header">
        <div class="index_header_l">
            <img src="images/index_03.png" alt="">
        </div>
        <ul class="index_header_l2">
            <li>尚品牌</li>
            <li>·</li>
            <li>重信誉</li>
            <li>·</li>
            <li>高质量</li>
            <li>·</li>
            <li>强服务</li>
        </ul>
        <dl class="index_header_r">
            <dt><img src="images/index_05.png" alt=""><span>027-81331070</span>
            <div class="clear"></div>
            </dt>
            <dd>7X24小时全国服务热线，欢迎来电咨询！</dd>
        </dl>
        <div class="clear"></div>
    </header>
    <nav class="index_nav">
        <ul class="index_nav_ul index_public">
            <li><a href="toIndexIndexAction.action">首页</a></li>
            <li><a href="findcompanygsjjCompany.action">公司简介</a></li>
			<li><a href="fenyeproductProduct.action">产品展示</a></li>
			<li><a href="findNews.action">新闻动态</a></li>
			<li><a href="jmys.html">招商加盟</a></li>
			<li><a href="findproductcaseProductcase.action">案例展示</a></li>
			<li><a href="findcompanylxwmCompany.action">联系我们</a></li>
		</ul>
    </nav>
    <!-- banner -->
    <div class="index_case_banner index_public">
        <img src="images/case_03.png" alt="">
    </div>
    <!-- main -->
    <div class="case_main index_public">
        <section class="case_left">
            <footer class="case_left_t">
                <span class="case_left_t1">新闻动态</span>
                <span class="case_left_t2">NEWS INFORMATION</span>
            </footer>
            <ul class="case_left_ul1">
                <li><a href="" class="case_left_li_on">公司新闻</a></li>
                <li><a href="fenyehangyedongtaiHydt.action">行业动态</a></li>
                <li><a href="">常见问题</a></li>
            </ul>

            <footer class="case_left_b">
                <span class="case_left_b1">新闻咨询</span>
                <span class="case_left_b2"><a href="">MORE+</a></span>
            </footer>
            <ul class="case_left_ul2">
                <li><a href="">【饮水投标收藏手册】工程投标技巧</a></li>
                <li><a href="">警惕！选购净水器常见陷阱和骗术…</a> </li>
                <li><a href="">净水经销商如何经营好自己的区域…</a> </li>
                <li><a href="">免费直饮水在中国是“贵族</a></li>
                <li><a href="">警惕！选购净水器常见陷阱和骗术…</a> </li>
                <li><a href="">净水经销商如何经营好自己的区域…</a> </li>
                <li><a href="">免费直饮水在中国是“贵族</a></li>
            </ul>

        </section>
        <section class="case_right">
            <header class="case_right_f">
                <div class="case_right_f_l">公司新闻</div>
                <div class="case_right_f_r">
                    <a href="toIndexIndexAction.action">首页</a>&gt
                    <a href="findNews.action">公司新闻</a>&gt
                </div>
                <div class="clear"></div>
            </header>
            <div class="case_right_box">
                <c:forEach var="news" items="${newList}">
                <section class="news-list">
                
                    <a href=""><img src="images/${news.NImg}" alt=""></a>
                    <dl>
                        <dt>${news. NTitle}</dt>
                        <dd class="news-list_dd1">
                            <img src="images/news_10 (2).png" alt="" class="news-list_d1_i1">
                            <span>${news.NDate}</span>
                            <img src="images/news_10 (1).png" alt="" class="news-list_d1_12">
                            <span>${news.NWriter}</span>
                        </dd>
                        <dd class="news-list_dd2">${news.NContent}      <a href="findnewsByIdNews.action?id=${news.NId}" class="news-list_dd2_a">[查看详情]</a></dd>
                    </dl>
                    <div class="clear"></div>
                   
                </section>
               </c:forEach>
                <div class="clear"></div>
            </div>
            <div class="page">
                <a href="findNews.action?nowpage=1">首页</a>
                <a href="findNews.action?nowpage=${backpage}">上一页</a>
                <a href="findNews.action?nowpage=${nextpage}">下一页</a>
                <a href="findNews.action?nowpage=${pages}">末页</a>
               <SPAN class=total>${nowpage }/${pages}页</SPAN> 
            </div>
        </section>
        <div class="clear"></div>
    </div>
    <!-- 页尾 -->
    <footer class="index_footer">
        <div class="index_footer_box index_public">
            <div class="index_footer_l">
                <img src="images/index1_03.png" alt="">
            </div>
            <div class="index_footer_c">
                <ul>
                    <li><a href="">厨房家电加盟</a></li>
                    <li>|</li>
                    <li><a href="">净水器厂家</a></li>
                    <li>|</li>
                    <li><a href="">深圳净水器</a></li>
                    <li>|</li>
                    <li><a href="">pp滤芯</a></li>
                    <li>|</li>
                    <li><a href="">辽宁招标网</a></li>
                    <li>|</li>
                    <li><a href="">空气能地暖</a></li>
                    <li>|</li>
                    <li><a href="">净水器招商</a></li>
                    <li>|</li>
                    <li><a href="">医疗污水处理设备</a></li>

                </ul>
                <div>版权所有 © 武汉京楚泓缘节能设备有限公司  手机：13098876211 <br/> 传真：027-81331070
地址:湖北省武汉市江夏区庙山开发区肖家塝57号</div>
            </div>
            <div class="index_footer_r">
                <img src="images/index_88.png" alt="">
            </div>
            <div class="clear">
            </div>
        </div>
    </footer>
  </body>
</html>
