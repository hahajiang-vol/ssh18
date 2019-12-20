<%@ page language="java" pageEncoding="utf-8"%>
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
		<h3 style="text-align: center;">学生个人信息</h3>
		<table class="table table-striped" style="width: 80%;margin: 0px auto;">
			<tr>
				<th>姓名：${loginUser.student.studentName }</th>
				<th>学号：${loginUser.student.sutdentCode }</th>
			</tr>
			<tr>
				<th>性别：${loginUser.student.studentSex }</th>
				<th>联系方式：${loginUser.student.studentPhone }</th>
			</tr>
			<tr>
				<th colspan="2">地址：${loginUser.student.studentAddress }</th>
			</tr>
			<tr>
				<th>学校：${loginUser.student.studentCollege }</th>
				<th>学历：${loginUser.student.studentEdu }</th>
			</tr>
			<tr>
				<th colspan="2">专业：${loginUser.student.studentProfessional }</th>
			</tr>
			<tr>
				<th colspan="2">毕业时间：${loginUser.student.studentGraduateTime }</th>
			</tr>
			
		</table>
		<script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
	</body>
</html>
