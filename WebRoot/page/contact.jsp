<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>标准网站通用模板</title>
    <meta name="keyword" content="">
    <meta name="description" content="">
    <meta name="author" content="Tengjungui">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/style.css">
    <script src="js/jquery.min.1.11.3.js"></script>
    <script src="js/SuperSlide.2.1.1.js"></script>
    <script src="js/js.js"></script>
<!--[if lt IE 9]>
<script src="js/html5.js"></script>
<![endif]-->
<!--[if IE 6]>
<script src="js/png.js"></script>
<script>
<![endif]-->
</head>
<body>
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
                <span class="case_left_t1">联系我们</span>
                <span class="case_left_t2">CONTACT US</span>
            </footer>
            <ul class="case_left_ul1">
                <li><a href="contact.html" class="case_left_li_on">联系我们</a></li>
                <li><a href="map.html">公司地图</a></li>
            
            </ul>

            <footer class="case_left_b">
                <span class="case_left_b1">新闻咨询</span>
                <span class="case_left_b2"><a href="news.html">MORE+</a></span>
            </footer>
            <ul class="case_left_ul2">
                <li>【饮水投标收藏手册】工程投标技巧</li>
                <li>警惕！选购净水器常见陷阱和骗术… </li>
                <li>净水经销商如何经营好自己的区域… </li>
                <li>免费直饮水在中国是“贵族</li>
                <li>警惕！选购净水器常见陷阱和骗术… </li>
                <li>净水经销商如何经营好自己的区域… </li>
                <li>免费直饮水在中国是“贵族</li>
            </ul>

        </section>
        <section class="case_right">
            <header class="case_right_f">
                <div class="case_right_f_l">联系我们</div>
                <div class="case_right_f_r">
                    <a href="jvascript:;">首页</a>&gt
                    <a href="">联系我们</a>&gt
                    <a href="">关于我们</a>
                </div>
                <div class="clear"></div>
            </header>
            <div class="case_right_box">
                <dl class="contact_dl">
                    <dt>武汉京楚泓缘节能设备有限公司</dt>
                    <dd>
武汉京楚泓缘节能设备有限公司<br/>
全国免费咨询电话： 027-81331070<br/>
电话：027-81331070<br/>
传真：027-81331079<br/>
手机：13098876211<br/>
邮箱：1079095832@qq.com<br/>
网站：http://www.whsjchy.com/<br/>
地址：江夏区庙山开发区肖家塝57号
                    </dd>
                </dl>
                <div class="contact_r">
                <p><img src="images/contact_03_03.png" alt=""></p>
                </div>
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