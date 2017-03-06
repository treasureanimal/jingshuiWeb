<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'product_show.jsp' starting page</title>
    
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
                <span class="case_left_t1">产品展示</span>
                <span class="case_left_t2">PRODUCT DISPLAY</span>
            </footer>
             <ul class="case_left_ul1">
            	<c:forEach var="producttype" items="${producttypeList}">
                <li><a href="fenyeproductProduct.action?ptid=${producttype.ptId}" class="case_left_li_on">${producttype.ptName}</a></li>
                </c:forEach>
               
            </ul>

          <!--   <footer class="case_left_b">
                <span class="case_left_b1">新闻咨询</span>
                <span class="case_left_b2"><a href="">MORE+</a></span>
            </footer>
            <ul class="case_left_ul2">
                <li>【饮水投标收藏手册】工程投标技巧</li>
                <li>警惕！选购净水器常见陷阱和骗术… </li>
                <li>净水经销商如何经营好自己的区域… </li>
                <li>免费直饮水在中国是“贵族</li>
                <li>警惕！选购净水器常见陷阱和骗术… </li>
                <li>净水经销商如何经营好自己的区域… </li>
                <li>免费直饮水在中国是“贵族</li>
            </ul> -->

        </section>
        <section class="case_right">
            <header class="case_right_f">
                <div class="case_right_f_l">产品展示</div>
                <div class="case_right_f_r">
                    <a href="jvascript:;">首页</a>&gt
                    <a href="">案例展示</a>&gt
                    <a href="">酒店饮水类</a>
                </div>
                <div class="clear"></div>
            </header>
        <div class="case_right_box">
            <div class="producmt1">

                <div class="producmt1_l">
                    <div class="game163" style="margin:0 auto">
                         <ul class="bigImg">
                            <li>
                                <a href="" target="_blank"><img src="images/${product.PImg}" /></a>
                    
                            </li>
                            <li>
                                <a href="" target="_blank"><img src="images/product_03.png" /></a>
                               </li>
                            <li>
                                <a href="" target="_blank"><img src="images/product_03.png" /></a>
                                
                            </li>
                            <li>
                                <a href="" target="_blank"><img src="images/product_03.png" /></a>
                                
                            </li>
                            <li>
                                <a href="" target="_blank"><img src="images/product_03.png" /></a>
                                
                            </li>
                            <li>
                                <a href="" target="_blank"><img src="images/product_03.png" /></a>
                                
                            </li>
                            <li>
                                <a href="" target="_blank"><img src="images/product_03.png" /></a>
                                
                            </li>
                            <li>
                                <a href="" target="_blank"><img src="images/product_03.png" /></a>
                                
                            </li>
                        </ul>
                        <div class="smallScroll">
                            <a class="sPrev" href="javascript:void(0)">←</a>
                            <div class="smallImg">
                                     <ul>
                                        <li><a><img src="images/${product.PImg}" /></a></li>
                                        <li><a><img src="images/product_03.png" /></a></li>
                                        <li><a><img src="images/product_03.png" /></a></li>
                                        <li><a><img src="images/product_03.png" /></a></li>
                                        <li><a><img src="images/product_03.png" /></a></li>
                                        <li><a><img src="images/product_03.png" /></a></li>
                                        <li><a><img src="images/product_03.png" /></a></li>
                                        <li><a><img src="images/product_03.png" /></a></li>
                                    </ul>
                            </div>
                            <a class="sNext" href="javascript:void(0)">→</a>
                        </div>
                </div>
                <script type="text/javascript">
                    //大图切换
                    jQuery(".game163").slide({ titCell:".smallImg li", mainCell:".bigImg", effect:"fold", autoPlay:true,delayTime:100,
                        startFun:function(i,p){
                            //控制小图自动翻页
                            if(i==0){ jQuery(".game163 .sPrev").click() } else if( i%4==0 ){ jQuery(".game163 .sNext").click()}
                        }
                    });

                    //小图左滚动切换
                    jQuery(".game163 .smallScroll").slide({ mainCell:"ul",delayTime:100,vis:4,scroll:4,effect:"left",autoPage:true,prevCell:".sPrev",nextCell:".sNext",pnLoop:false });
                </script>
                </div>
                
                <div class="producmt1_r">
                
                    <div class="producmt1_r_h">${product. PName}</div>
                    <table id="producmt1_r_t">
    
                        <tr>
                            <td width="80px" class="producmt1_r_t1">${product.PUsernumber}</td>
                            <td>${product.PUsernumber}</td>
                        </tr>
                        <tr>
                            <td width="80px" class="producmt1_r_t1">${product.PVolume}</td>
                            <td>18L</td>
                        </tr>
                        <tr>
                            <td width="80px" class="producmt1_r_t1">供水量</td>
                            <td>开水20L/H 温水80L/H</td>
                        </tr>
                        <tr>
                            <td width="80px" class="producmt1_r_t1">额定功率</td>
                            <td>2000W</td>
                        </tr>
                        <tr>
                            <td width="80px" class="producmt1_r_t1">电源</td>
                            <td>60*39*115cm</td>
                        </tr>
                        <tr>
                            <td width="80px" class="producmt1_r_t1">过滤系统</td>
                            <td>三级过滤（超速）</td>
                        </tr>
                        <tr>
                            <td width="80px" class="producmt1_r_t1">出水咀数</td>
                            <td>一温一开</td>
                        </tr>
                        <tr>
                            <td width="80px" class="producmt1_r_t1">试用水压</td>
                            <td>100-600（kPa）</td>
                        </tr>
            
                    </table>
                    
                    <div class="producmt1_r_t2_box">
                        <table id="producmt1_r_t2">
                        <tr>
                            <td class="producmt1_r_t2_d1">地区</td>
                            <td><input type="text"></td>
                        </tr>
                        <tr>
                            <td class="producmt1_r_t2_d1">姓名</td>
                            <td><input type="text"></td>
                        </tr>
                        <tr>
                            <td class="producmt1_r_t2_d1">电话</td>
                            <td><input type="text"></td>
                        </tr>
                        <tr style="height:100px">
                            <td class="producmt1_r_t2_d1">备注</td>
                            <td><textarea name=""></textarea></td>
                        </tr>
                        <tr>
                            <td class="producmt1_r_t2_d1"></td>
                            <td class="producmt1_r_t2_d12">
                                <input type="submit" value="立即提交">
                                <a href="">在线联系</a>
                            </td>
                        </tr>
                    </table>
                    </div> 
                </div>
             <div class="clear"></div>   
            </div>
            
            <dl class="product_show_dl" style="margin-top:30px">
                <dt>商品详情</dt>
                <dd><img src="images/product_07.png" alt=""></dd>
            </dl>
            <dl class="product_show_dl" style="margin-top:10px">
                <dt>相关推荐</dt>
                <dd class="product_show_dl2">
                    <dl class="product_dl">
                        <dt><a href="product_show.html"><img src="images/index_57.png" alt=""></a></dt>
                        <dd><a href="">优质市政自来水</a></dd>
                    </dl>
                    <dl class="product_dl">
                        <dt><a href="product_show.html"><img src="images/index_60.png" alt=""></a></dt>
                        <dd><a href="">优质市政自来水</a></dd>
                    </dl>
                    <dl class="product_dl">
                        <dt><a href="product_show.html"><img src="images/index_63.png" alt=""></a></dt>
                        <dd><a href="">优质市政自来水</a></dd>
                    </dl>
                    <dl class="product_dl">
                        <dt><a href="product_show.html"><img src="images/index_57.png" alt=""></a></dt>
                        <dd><a href="">优质市政自来水</a></dd>
                    </dl>
                    <div class="clear"></div>
                </dd>
            </dl>
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
