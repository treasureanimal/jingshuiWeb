<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!-- 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<!DOCTYPE html>
 -->
<html>
  <head>
    <base href="<%=basePath%>">
    
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" language="javascript">
	function showChildMenu(obj,divname){
 
		var divobj = document.getElementById(divname);
		divobj.style.display="block";
		/* divobj.style.position="static"; */
		obj.style.backgroundColor = "#1C65B1";	//这是获得是li标签。
		
	}
	function hiddenChildMenu(obj,divname){
		var divobj = document.getElementById(divname);
		divobj.style.display= "none";
		obj.style.backgroundColor = "";	
	}
	</script>
	<title>标准网站通用模板</title>
	<meta name="keyword" content="">
	<meta name="description" content="">
	<meta name="author" content="Tengjungui">
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
	
		<div class="index_nav">
		<ul class="index_nav_ul index_public">
			<li><a href="toIndexIndexAction.action">首页</a></li>
			<!-- <li onmouseover="showChildMenu(this,'fileDiv')" onmouseout="hiddenChildMenu(this,'fileDiv')">公司
				<div id ="fileDiv" >
					<a href="findCompanygsjjCompany.action">公司简介</a>
					<a href="product.html">产品展示</a>
					<a href="product.html">产品展示</a>
				</div>
			</li> -->
			<li><a href="findcompanygsjjCompany.action" >公司简介</a></li>
			<li><a href="fenyeproductProduct.action">产品展示</a></li>
			<li><a href="findNews.action">新闻动态</a></li>
			<li><a href="jmys.html">招商加盟</a></li>
			<li><a href="findproductcaseProductcase.action">案例展示</a></li>
			<li><a href="findcompanylxwmCompany.action">联系我们</a></li> 
		</ul>
	</div>

       <div class="index_banner" style="height: 420px;">
			<div id="slideBox" class="slideBox">
			
			<div class="bd">
			 	<ul>
					<li><a href="" target="_blank"><img src="images/index_09.png" /></a></li>
					<li><a href="" target="_blank"><img src="images/index_09.png" /></a></li>
					<li><a href="" target="_blank"><img src="images/index_09.png" /></a></li>
				</ul> 
			</div></div>
			
			<a class="prev" href="javascript:void(0)"></a>
			<a class="next" href="javascript:void(0)"></a>

		</div>
<script>
		$(".slideBox").slide({mainCell:".bd ul",effect:"left",autoPlay:true});
	</script>
	</div>
	  
	<div class="index_styll1">
		<div class="index_styll1_box index_public">
			<div class="index_styll1_1">
				<img src="images/index3_12.png" alt="">
				<dl>
					<dt>饮用水接触配件</dt>
					<dd>100%采用食品级304不锈钢不含任何有害金属</dd>
				</dl>
			</div>
			<div class="index_styll1_1">
				<img src="images/index_21.png" alt="">
				<dl>
					<dt>饮用水接触配件</dt>
					<dd>100%采用食品级304不锈钢不含任何有害金属</dd>
				</dl>
			</div>
			<div class="index_styll1_1">
				<img src="images/index_12.png" alt="">
				<dl>
					<dt>饮用水接触配件</dt>
					<dd>100%采用食品级304不锈钢不含任何有害金属</dd>
				</dl>
			</div>
			<div class="index_styll1_1">
				<img src="images/index_18.png" alt="">
				<dl>
					<dt>饮用水接触配件</dt>
					<dd>100%采用食品级304不锈钢不含任何有害金属</dd>
				</dl>
			</div>
		</div>
	</div>
	<div class="index_public" style="border:1px solid #ccc">
		<div class="index_style2">
			<div class="index_style2_top">
				<span class="index_style2_top1">产品展示</span>
				<span class="index_style2_top2">PRODUCT DISPLAY</span>
				<a href="product.html" class="index_style2_top3">更多 +</a>
			</div>

			<div class="index_style2_bottom">
				<div class="slideGroup" style="margin:0 auto">
					<div class="parBd">

					<div class="slideBox">
						<a class="sPrev" href="javascript:void(0)"></a>
						<ul>
						<c:forEach var="producttype" items="${producttypeList}">
							<li>
						
								<div class="pic"><a href="fenyeproductProduct?ptid=${producttype.ptId}" target="_blank"><img src="images/${producttype.ptImg}" /></a></div>
								<div class="title"><a href="fenyeproductProduct?ptid=${producttype.ptId}" target="_blank">${producttype.ptName}</a></div>
							</li>
							<!--<li>
								<div class="pic"><a href="product_show.html" target="_blank"><img src="images/index3_35.png" /></a></div>
								<div class="title"><a href="product_show.html" target="_blank">工程饮水类</a></div>
							</li>
							<li>
								<div class="pic"><a href="product_show.html" target="_blank"><img src="images/index3_28.png" /></a></div>
								<div class="title"><a href="product_show.html" target="_blank">医院饮水类</a></div>
							</li>
							<li>
								<div class="pic"><a href="product_show.html" target="_blank"><img src="images/index3_30.png" /></a></div>
								<div class="title"><a href="product_show.html" target="_blank">办公饮水类</a></div>
							</li>
							<li>
								<div class="pic"><a href="product_show.html" target="_blank"><img src="images/index_38.png" /></a></div>
								<div class="title"><a href="product_show.html" target="_blank">酒店饮水类</a></div>
							</li>
							<li>
								<div class="pic"><a href="product_show.html" target="_blank"><img src="images/index3_40.png" /></a></div>
								<div class="title"><a href="product_show.html" target="_blank">酒店饮水类</a></div>
							</li>
							<li>
								<div class="pic"><a href="product_show.html" target="_blank"><img src="images/index_33.png" /></a></div>
								<div class="title"><a href="product_show.html" target="_blank">酒店饮水类</a></div>
							</li>
							--></c:forEach>
						</ul>
						<a class="sNext" href="javascript:void(0)"></a>
					</div> 
					<div class="clear"></div>
                     
				</div>
			</div>
			<script>
				jQuery(".slideGroup .slideBox").slide({ mainCell:"ul",vis:6,prevCell:".sPrev",nextCell:".sNext",effect:"leftLoop"});
			</script>
			</div>
          
		</div>
		<div class="index_style2_product">
			<c:forEach var="product" items="${productList}">
				<dl>
					<dt><a href="findproductByIdProduct.action?pid=${product.PId}"><img src="images/${product.PImg }" alt=""></a></dt>
					<dd><a href="findproductByIdProduct.action?pid=${product.PId}">${product.PName}</a></dd>
				</dl>
			</c:forEach>
             
			<div class="clear"></div>
            <div class="page">
               
				  <A href="toIndexIndexAction.action?nowpage=1">首页</A>
				  <A href="toIndexIndexAction.action?nowpage=${lastpage }">上一页</A>
				  <A href="toIndexIndexAction.action?nowpage=${nextpage }">下一页</A>
				  <A href="toIndexIndexAction.action?nowpage=${pages }">末页</A>
				  <SPAN class=total>${nowpage }/${pages}页</SPAN> 
            </div>
		</div>
      
	</div>
    
	<div class="index_style3">
		<div class="index_public">
			<div class="index_style3_l">
				<ul>
					<!-- 
					<li class="index_style3_l_on">公司介绍</li>
					 -->
					<li class="index_style3_l_on">行业动态</li>
					<li>公司新闻</li>
					<a href="news.html" class="index_style3_l_r">跟多+</a>
				</ul>
				<div class="index_style3_l_box">
				
					<div class="index_style3_l_box1">
						<img src="images/${hydtLeft.HImg}" alt="">
						<ul>
						<%--行业动态 --%>
						<c:forEach var="hydt" items="${hydtList}">
							<li><a href="fenyehangyedongtaiHydt.action">${hydt.HTitle}</a></li>
						</c:forEach>
						<!-- 
							<li><a href="news_show.html">aa选购净水器常见陷阱和骗术，你中招了吗？—…</a></li>
							<li><a href="news_show.html">净水经销商如何经营好自己的区域，多关注这3个…</a></li>
							<li><a href="news_show.html">【饮水投标收藏手册】工程投标技巧与策略</a></li>
							<li><a href="news_show.html">警惕！选购净水器常见陷阱和骗术，你中招了吗？—…</a></li>
							<li><a href="news_show.html">净水经销商如何经营好自己的区域，多关注这3个…</a></li>
							<li><a href="news_show.html">净水经销商如何经营好自己的区域，多关注这3个…</a></li>
							<li><a href="news_show.html">【饮水投标收藏手册】工程投标技巧与策略</a></li>
							<li><a href="news_show.html">警惕！选购净水器常见陷阱和骗术，你中招了吗？—…</a></li>
						 -->
						</ul>

					</div>

					<div class="index_style3_l_box1">
						<img src="images/index_73.png" alt="">
						<ul>
						<%--公司新闻 --%>
						<c:forEach var="news" items="${newsList}">
							<li><a href="findNews.action">${news.NTitle}</a></li>
						</c:forEach>
							<!--<li><a href="">bb选购净水器常见陷阱和骗术，你中招了吗？—…</a></li>
							<li><a href="">净水经销商如何经营好自己的区域，多关注这3个…</a></li>
							<li><a href="">【饮水投标收藏手册】工程投标技巧与策略</a></li>
							<li><a href="">警惕！选购净水器常见陷阱和骗术，你中招了吗？—…</a></li>
							<li><a href="">净水经销商如何经营好自己的区域，多关注这3个…</a></li>
							<li><a href="">净水经销商如何经营好自己的区域，多关注这3个…</a></li>
							<li><a href="">【饮水投标收藏手册】工程投标技巧与策略</a></li>
							<li><a href="">警惕！选购净水器常见陷阱和骗术，你中招了吗？—…</a></li>-->
						</ul>
					</div>

					
					
					
				</div>
			</div>
			<div class="index_style3_r">
				<div class="index_style3_r_top">
					<span>常见问题</span>
					<a href="findQuestion.action">跟多+</a>
				</div>
				<dl class="index_style3_r_dl">
					 <dt><img src="images/index_69.png" alt="">${question.QContent} </dt>
					 <!--  <dd><img src="images/index_75.png" alt=""> -->
                     <c:forEach var="answer" items="${question.answers}">
                     <dd><img src="images/index_75.png" alt="">
					 <span>${answer.AContent}</span>
					 </dd>
					</c:forEach>
				</dl>
				<!-- <dl class="index_style3_r_dl">
					<dt><img src="images/index_69.png" alt="">有史以来最全的商用开水机故障处理方法 </dt>
					<dd><img src="images/index_75.png" alt="">
					<span>可能出现在产品刚安装、较大范围拆卸水机、从新安装后。可能错将高压泵与RO膜膜壳之间的水管直接接到后置活性碳的三通处，</span>
					</dd>
				</dl> -->
			</div>
			<div class="clear"></div>
		</div>
	</div>


	<div class="index_public index_case" >
		<div class="index_style2">
			<div class="index_style2_top index_case1">
				<span class="index_style2_top1">案例展示</span>
				<span class="index_style2_top2">PRODUCT DISPLAY</span>
				<a href="page/product.jsp" class="index_style2_top3">更多 +</a>
			</div>

			<div class="index_style2_bottom index_style2_bottom1">
				<div class="slideGroup1" style="margin:0 auto">
					<div class="parBd">

					<div class="slideBox">
						<a class="sPrev" href="javascript:void(0)"></a>
						<ul>
							<c:forEach var="productcase" items="${productCaseList}">
							<li>
								<div class="pic"><a href="findproductcaseByPcIdProductcase.action?pcid=${productcase.pcId}" target="_blank"><img src="images/anli/${productcase.pcImg}" /></a></div>
								<div class="title"><a href="findproductcaseByPcIdProductcase.action?pcid=${productcase.pcId}" target="_blank">${productcase.pcName}</a></div>
							
							</li>
							</c:forEach>
							 
							<!--<li>
								<div class="pic"><a href="product_show.html" target="_blank"><img src="images/index_81.png" /></a></div>
								<div class="title"><a href="" target="_blank">武汉市育才高中</a></div>
							</li>
							<li>
								<div class="pic"><a href="product_show.html" target="_blank"><img src="images/index_79.png" /></a></div>
								<div class="title"><a href="" target="_blank">中南财经政法大学</a></div>
							</li>
							<li>
								<div class="pic"><a href="product_show.html" target="_blank"><img src="images/index_81.png" /></a></div>
								<div class="title"><a href="" target="_blank">武汉市育才高中</a></div>
							</li>
							<li>
								<div class="pic"><a href="product_show.html" target="_blank"><img src="images/index_79.png" /></a></div>
								<div class="title"><a href="" target="_blank">中南财经政法大学</a></div>
							</li>
							<li>
								<div class="pic"><a href="product_show.html" target="_blank"><img src="images/index_81.png" /></a></div>
								<div class="title"><a href="" target="_blank">武汉市育才高中</a></div>
							</li>
							<li>
								<div class="pic"><a href="product_show.html" target="_blank"><img src="images/index_79.png" /></a></div>
								<div class="title"><a href="" target="_blank">中南财经政法大学</a></div>
							</li>
							<li>
								<div class="pic"><a href="product_show.html" target="_blank"><img src="images/index_81.png" /></a></div>
								<div class="title"><a href="" target="_blank">武汉市育才高中</a></div>
							</li>
							 

						--></ul>
						<a class="sNext" href="javascript:void(0)"></a>
					</div> 
					<div class="clear"></div>
				</div>
			</div>
			<script>
				jQuery(".slideGroup1 .slideBox").slide({ mainCell:"ul",vis:4,prevCell:".sPrev",nextCell:".sNext",effect:"leftLoop"});
			</script>
			</div>
		</div>
	</div>

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
地址:湖北省武汉市江夏区庙山开发区肖家塝57号 来源:<a href="http://www.mycodes.net/" target="_blank">源码之家</a></div>
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
