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
		<h3 style="text-align: center;">学生考勤信息表</h3>
		<table class="table table-striped" style="width: 80%;margin: 0px auto;">
			<tr>
				<th>序号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>考勤率</th>
				<th>考勤详情</th>
				<th>平均成绩</th>
				<th>成绩详情</th>
				
			</tr>
			<c:forEach items="${stuCheckIns }" var="st" varStatus="i">
				
				<tr>
					<th>${i.count }</th>
					<th>${st.studentName }</th>
					<th>${st.studentSex }</th>
					<th>${st.checkInRate }</th>
					<th><a href="#">考勤详情</a></th>
					<th>${st.scoreAvg }</th>
					<th><a href="#">成绩详情</a></th>
					
				</tr>
				
			</c:forEach>
			
		</table>
		<script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
	</body>
</html>
