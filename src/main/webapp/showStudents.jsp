<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>showClass</title>
		<script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
		<script type="text/jscript" src="js/bootstrap.js"></script>
		<link href="css/bootstrap.css" type="text/css" rel="stylesheet"/>
	</head>
	<body>
		<table class="table table-striped" style="width: 80%;margin: 0px auto;">
		  <caption><font color="#2B669A" size="5">班级成员测试成绩管理</font></caption>
		  
		  <thead>
		    <tr>
		      <th>序号</th>
		      <th>学生姓名</th>
		      <th>学号</th>
		      <th><a href="uploadScores.jsp">Excel上传成绩</a></th>
		    </tr>
		  </thead>
		  <tbody>
		  <c:forEach items="${students }" var="stu" varStatus="i">
		    <tr>
		      <th>${i.count }</th>
		      <th>${stu.studentName }</th>
		      <th>${stu.sutdentCode }</th>
		      <th><a href="addStuScoresFrame.action?studentId=${stu.studentId }">添加学生成绩</a></th>
		      
		    </tr>
		    </c:forEach>
		  	 
		  </tbody>		   
		</table>
	</body>
</html>
