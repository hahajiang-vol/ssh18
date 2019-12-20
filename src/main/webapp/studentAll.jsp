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
		<table class="table table-striped">
		  <caption><font color="#2B669A" size="5">当前班级管理</font></caption>
		  
		  <thead>
		    <tr>
		      <th>序号</th>
		      <th>学生姓名</th>
		      <th>学生性别</th>
		      <th>学号</th>
		      <th>手机号</th>
		      <th>住址</th>
		      <th>学历</th>
		      <th>毕业院校</th>
		      <th>专业</th>
		      <th>毕业时间</th>
		      <th>所属班级</th>
		      <th>操作</th>
		    </tr>
		  </thead>
		  <tbody>
		  <c:forEach items="${sts }" var="stu" varStatus="i">
		    <tr>
		      <th>${i.count }</th>
		      <th>${stu.studentName }</th>
		      <th>${stu.sutdentCode }</th>
		      <th>${stu.studentSex }</th>
		      <th>${stu.studentPhone }</th>
		      <th>${stu.studentAddress }</th>
		      <th>${stu.studentEdu }</th>
		      <th>${stu.studentCollege }</th>
		      <th>${stu.studentProfessional }</th>
		      <th>${stu.studentGraduateTime }</th>
		      <th>${stu.clazz.clazzName }</th>
		      <th><a href="addClass.html" class="btn btn-primary btn-xs active" role="button">转班</a></th>
		      
		    </tr>
		    </c:forEach>
		    <div><a href="addClass.html" class="btn btn-primary btn-xs active" role="button">转班</a></div>
		  </tbody>
		   
		</table>
	</body>
</html>
