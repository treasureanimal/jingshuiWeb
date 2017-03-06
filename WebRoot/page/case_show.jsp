<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'case.jsp' starting page</title>
    
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
  
  <body>
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
                <span class="case_left_t1">案例列表</span>
                <span class="case_left_t2">PRODUCT DISPLAY</span>
            </footer>
              <ul class="case_left_ul1">
                <c:forEach var="productcasetype" items="${productcasetypeList}">
							<li>
								<a href="findproductcaseProductcase.action?pctid=${productcasetype.pctId}" target="_blank" class="case_left_li_on">${productcasetype.pctName}</a>
							</li>
							</c:forEach>
            </ul>


            <!-- <footer class="case_left_b">
                <span class="case_left_b1">产品展示</span>
                <span class="case_left_b2"><a href="">MORE+</a></span>
            </footer> 
            <ul class="case_left_ul2">
            <c:forEach var="productcase" items="">
            
            </c:forEach>
                <li>【饮水投标收藏手册】工程投标技巧</li>
                <li>警惕！选购净水器常见陷阱和骗术… </li>
                <li>净水经销商如何经营好自己的区域… </li>
                <li>免费直饮水在中国是“贵族</li>
                <li>警惕！选购净水器常见陷阱和骗术… </li>
                <li>净水经销商如何经营好自己的区域… </li>
                <li>免费直饮水在中国是“贵族</li>
 -->            </ul>

        </section>
        <section class="case_right">
            <header class="case_right_f">
                <div class="case_right_f_l">案例展示</div>
                <div class="case_right_f_r">
                    <a href="jvascript:;">首页</a>&gt
                    <a href="">案例展示</a>&gt
                    <a href="">工程案例</a>
                </div>
                <div class="clear"></div>
            </header>
            <div class="case_right_box">
            	<ul>
					<li><a href="" target="_blank"><img style="height:350px;width:500px" src="images/anli/${productcase.pcImg }" /></a></li>
				</ul> 
              <!--  <dl class="case_show">
                   <dt>中南财经政法大学采购信息</dt>
                   <dd class="case_show_dd1">
                       <span>时间：2016-09-24 </span>
                       <span>来源：新华网</span>
                       <span>浏览量：167</span>
                   </dd>
                   <dd class="case_show_dd2">
                       
                                   
   中山市威可利节能环保设备有限公司成立于2012年6月，是一家专业从事健康节能饮水器、饮水机、校园饮水设备研发、生产、销售与投资于一体化经营的高科技企业，致力于提供健康、节能、安全的公共饮水设备与整体服务解决方案。威可利位于中国著名的小家电产业基地珠三角腹地中山东凤镇，处于物流中心，物流配送便捷、高效，为广大经销商客户提供优质配送业务。
   威可利成立以来，始终贯彻“诚信第一、顾客至上”的经营理念，并囊括了行业内最卓越的具有十年从业经验的技术工程师，拥纳了一批高素质的专业技术人才和资深管理职业人才，企业现有员工达158名。公司在短短的两年时间里一跃成为行业的领航者，签约渠道商（代理、经销、OEM、校园投资项目商）已有600多家，各类饮水机年产能10多万台，发展速度稳居行业第一。公司依仗强劲的综合实力，成熟的项目方案，完善的技术品质，全方位的售后服务在竞争中脱颖而出，战略客户涵盖了医院、学校、工厂、政府机关等，其中学校项目中大学以及高等学院合作伙伴数量众多.
   受广大客户的好评，并先后获得数十项国家发明专利与实用专利技术机行业十大品牌、质量·服务·信誉3A企业、国家工业生产许可权威企业，并获得企业最高信誉级别“3A级信用企业”。
                   </dd>
               </dl> -->
            </div>
            <!-- <div class="page_show">
                <p>上一篇：<a href="">中山市威可利节能环</a></p>
                <p>下一篇：<a href="">中山市威可利节能环</a></p>
            </div> -->
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
