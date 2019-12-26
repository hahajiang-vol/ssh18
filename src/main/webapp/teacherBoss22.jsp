<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		  <caption><font color="#2B669A" size="5">班级管理</font></caption>
		  <thead>
		    <tr>
		      <th>序号</th>
		      <th>班级名称</th>
		      <th>班级类型</th>
		      <th>阶段</th>
		      <th>教师</th>
		      <th>班主任</th>
		      <th>操作</th>
		    </tr>
		  </thead>
		  <tbody>
		  <c:forEach items="${clazzs }" var="cc" varStatus="i">
		    <tr>
		      <td>${i.count}</td>
		      <td><a href="clazzCheckin.action">${cc.clazzName}</a></td>
		      <td>${cc.clazzType}</td>
		      <td>${cc.stage.stageName}</td>
		      <td>${cc.teacher.teacherName}</td>
		      <td>${cc.overman.overmanName}</td>
		      <td>
		      	<a href="getOneClazzById.action?clazzId=${cc.clazzId }" class="btn btn-primary btn-xs active" role="button">修改</a>
		      	&nbsp;&nbsp;&nbsp;
		      	<a href="endOneClazzById.action?clazzId=${cc.clazzId }" class="btn btn-danger btn-xs active" role="button">结课</a>
		      </td>
		    </tr>
		  </c:forEach>
		    <tr>
		      <td colspan="7">
				  <a href="allTeacherAndOverman.action" class="btn btn-primary btn-xs active" role="button">增加班级</a>
			  </td>
		    </tr>
		  </tbody>
		</table>
	</body>
</html>