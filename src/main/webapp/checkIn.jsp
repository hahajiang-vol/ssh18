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
		<h3 style="text-align: center;">个人考勤信息</h3>
		<table class="table table-striped" style="width: 80%;margin: 0px auto;">
			<c:forEach items="user.student.checkins" var="ch">
				<tr>
					<th>姓名：${ch.checkInDate }</th>
					<th>学号：${ch.checkintype }</th>
				</tr>
			</c:forEach>
			
		</table>
		<script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
	</body>
</html>
