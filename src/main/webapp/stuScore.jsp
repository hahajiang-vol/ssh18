<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>学生信息</title>
		<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
		<style type="text/css">
		
		th{
			border: black 1px solid;
		}
		</style>
	</head>
	
	<body>
		<h3 style="text-align: center;">阶段考试成绩</h3>
		<table class="table table-striped" style="width: 80%;margin: 0px auto;">
			<tr>
				<th>序号</th>
				<th>日期</th>
				<th>成绩</th>
			</tr>
			<c:forEach items="${scores }" var="sc" varStatus="i"> 
				<tr>
					<th>${i.count }</th>
					<th>${sc.scoreDate }</th>
					<th>${sc.scoreNum }</th>
				</tr>
			</c:forEach>
		</table>
		<script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
	</body>
</html>
