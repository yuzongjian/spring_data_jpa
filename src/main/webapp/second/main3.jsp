<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">  
<meta http-equiv="X-UA-COMPATIBLE" content="IE=edge,chrome=1"/>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
	<title>匹配专家</title>
	<link rel="stylesheet" type="text/css" href="../iconfont/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="../layui/css/layui.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap3/css/bootstrap-theme.min.css">
<script src="${pageContext.request.contextPath}/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap3/js/bootstrap.min.js"></script>
</head>
<body class="layui-layout-body">
  	<div class="layui-layout layui-layout-admin">
		<div class="layui-header nav-header " style="background-color:#3059ca;height:120px;">
            <div class="layui-logo nav-logo">
            	<center style="width:1500px; color: white;margin-left:5px;height:50px;font-size:28px;margin-top:30px">评分预测系统 </center>
          </div>          
        </div>			
			<!-- 内容主体区域 -->
	<div style="padding: 15px; flxed:left">
				<!-- 查询部分 -->
       <form method="POST"  enctype="multipart/form-data" id="form1" action="${pageContext.request.contextPath}/second/main3.do">  
        <table style="width:450px">  
         <tr>  
            <td>上传文件: </td>  
            <td> <input id="upfile" type="file" name="upfile" style="display:inline"></td> 
         </tr>  
        <tr>  
            <td><input type="submit" value="提交" onclick="return checkData()" style="position:absolute; left:300px;top:135px;z-index:100"></td>   
         </tr>  
        </table>    
    </form>  
				<!-- 数据表格 -->
	<div style=" height:582px; overflow:scroll;">			
 <table class="layui-table">
                <thead>
     <tr >                
      <th>编号</th>
      <th>项目名称</th>
      <th>项目负责人</th>
      <th>所属单位</th>
      <th>项目关键词1</th>
      <th>项目关键词2</th>
      <th>项目关键词3</th>
      <th>项目关键词4</th>
  <th >  <center>执行操作</center></th>
    </tr> 
  </thead>
  <tbody>
	<c:forEach var="InfoVo" items="${userList }" varStatus="status">
      	<tr>
      		<td>${status.index+1 }</td>
      		<td>${InfoVo.name }</td>
      		<td>${InfoVo.leader }</td>
      		<td>${InfoVo.company }</td>
      		<td>${InfoVo.keyword1 }</td>
      		<td>${InfoVo.keyword2 }</td>
      		<td>${InfoVo.keyword3 }</td>
      		<td>${InfoVo.keyword4 }</td>
      		<td>
      		<form action="${pageContext.request.contextPath}/govProject/teacher.do" target="_blank">
      	<center>	<button type="submit" class="layui-btn layui-btn-normal" id="parentIframe")">匹配专家</button></center>
      		<input type = "hidden" id="keyword1" name="keyword1" value="${InfoVo.keyword1 }">
      		<input type = "hidden" id="keyword2" name="keyword2" value="${InfoVo.keyword2 }">
      		<input type = "hidden" id="keyword3" name="keyword3" value="${InfoVo.keyword3 }">
      		<input type = "hidden" id="keyword4" name="keyword4" value="${InfoVo.keyword4 }">
      		</td>
      		</form>
      	</tr>
      </c:forEach>  
      </tbody>
      </table>
      </div>
      </div>
      </div>
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	<script src="../layui/layui.js"></script>
 <script type="text/javascript">  
            //ajax 方式上传文件操作  
             $(document).ready(function(){  
                $('#btn').click(function(){  
                    if(checkData()){  
                        $('#form1').ajaxSubmit({    
                            url:'uploadExcel/ajaxUpload.do',  
                            dataType: 'text',  
                            success: resutlMsg,  
                            error: errorMsg  
                        });   
                        function resutlMsg(msg){  
                            alert(msg);     
                            $("#upfile").val("");  
                        }  
                        function errorMsg(){   
                            alert("导入excel出错！");      
                        }  
                    }  
                });  
             });   </script>
             <script type="text/javascript">  
             var array = new Array();    
             <c:forEach items="${userlist}" var="item" varStatus="status" >  
                 array.push("${item}");  //对象，加引号
                 var temp = "${item}";   
                console.log("${item.name}");   //传递过来的是字符串，加引号 
              //传递过来的是int或float类型，不需要加引号 
             </c:forEach> 
             </script>
         <script>  
             //JS校验form表单信息  
             function checkData(){  
                var fileDir = $("#upfile").val();  
                var suffix = fileDir.substr(fileDir.lastIndexOf("."));  
                if("" == fileDir){  
                    alert("选择需要导入的Excel文件！");  
                    return false;  
                }  
                if(".xls" != suffix && ".xlsx" != suffix ){  
                    alert("选择Excel格式的文件导入！");  
                    return false;  
                }  
                return true;  
             }  
           
    </script>  
</body>
</html>