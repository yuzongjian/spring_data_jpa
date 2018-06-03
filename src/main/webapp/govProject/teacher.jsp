<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<title>匹配专家</title>
	<link rel="stylesheet" type="text/css" href="../iconfont/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="../layui/css/layui.css" />
<style type="text/css"> .pagination {
  display: inline-block;
  padding-left: 0;
  margin: 20px 0;
  border-radius: 4px;
}
.pagination > li {
  display: inline;
}
.pagination > li > a,
.pagination > li > span {
  position: relative;
  float: left;
  padding: 6px 12px;
  margin-left: -1px;
  line-height: 1.42857143;
  color: #337ab7;
  text-decoration: none;
  background-color: #fff;
  border: 1px solid #ddd;
}
.pagination > li:first-child > a,
.pagination > li:first-child > span {
  margin-left: 0;
  border-top-left-radius: 4px;
  border-bottom-left-radius: 4px;
}
.pagination > li:last-child > a,
.pagination > li:last-child > span {
  border-top-right-radius: 4px;
  border-bottom-right-radius: 4px;
}</style>
</head>
<body class="layui-layout-body">

  	<div class="layui-layout layui-layout-admin">
		<div class="layui-header nav-header " style="background-color:#3059ca;height:120px;">
            <div class="layui-logo nav-logo">
            <center style="width:1500px; color: white;margin-left:5px;height:50px;font-size:28px;margin-top:30px">基于数据挖掘技术的专家领域预测系统 </center>          
            </div>          
        </div>			
			<!-- 内容主体区域 -->
			<div style="padding: 15px; flxed:left">
				<!-- 数据表格 -->
						<!-- 数据表格 -->
						
			<table class="layui-table">
  <colgroup>
    <col width="200">
    <col width="200">
       <col width="150">
         <col width="250">
    <col>
  </colgroup>
  <thead>
    <tr>
      <th><center>推荐系数(4为最大，0为最小)</th>
      <th><center>专家匹配程度</th>
      <th><center>专家姓名</th>    
      <th><center>匹配关键词</th>
      

    </tr> 
  </thead>
  <tbody>
 
				 <c:forEach var="InfoVo" items="${zhuanjiaList }" varStatus="status">
      	<tr>
 
      		<td><center>${InfoVo.cnt }</td>
      	<c:if test="${InfoVo.cnt==4 }">
	  			<td align="center">100%</td>
	  		</c:if>
	  			<c:if test="${InfoVo.cnt==3 }">
	  			<td align="center">75%</td>
	  		</c:if>
	  		<c:if test="${InfoVo.cnt==2 }">
	  			<td align="center">50%</td>
	  		</c:if>
	  		<c:if test="${InfoVo.cnt==1 }">
	  			<td align="center">25%</td>
	  		</c:if>
      		<td><center>${InfoVo.name }</td>
      		<td><center><font color=red>${InfoVo.keyword1 }</font></center></td>
      	</tr>
      </c:forEach>  </tbody></table></div></div>
     <center>		
		<ul class="pagination">
			${pageCode }
		</ul>
	
	</center> 
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	<script src="../layui/layui.js"></script>	
	<script>
	 $('#parentIframe').on('click', function(){
		    layer.open({
		      type: 2,
		      title: '适合上述项目的专家列表',
		      maxmin: true,
		      shadeClose: true, //点击遮罩关闭层
		      area : ['800px' , '520px'],
		      content: 'login.html'
		    });
		  });
	
</script>
</body>
</html>