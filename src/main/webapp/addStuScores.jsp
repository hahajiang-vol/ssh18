<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css">
</head>
<body>
<div id="container" style="margin-top: 30px" class="container">
     <form class="form-horizontal" action="addStuScores.action" method="post" > 
     	<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">学生姓名：</label>
				<div class="col-md-3 ">
					<input type="text" class="form-control"  required="required" name="score.student.studentName" value="${student.studentName}" disabled="disabled">
				</div>
		</div>
		
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">学号：</label>
				<div class="col-md-3 ">
					<input type="text" class="form-control" required="required" name="score.student.sutdentCode" value="${student.sutdentCode}" disabled="disabled">
				</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">成绩：</label>
				<div class="col-md-3 ">
					<input type="text" class="form-control" required="required"  name="score.scoreNum" >
				</div>
		</div>
		<input type="hidden" name="score.student.studentId" value="${student.studentId}"/>
		
           
		<div class="form-group">
			<label class="col-md-5 col-sm-5"></label>
				<div class="col-md-3">
					<input type="submit" class="btn btn-info btn-block" value="保存">
			</div>
		</div>
    </form>
</div>

<script type="text/javascript"  src="js/jquery-1.12.3.min.js"></script>

<script type="text/javascript"  src="js/bootstrap.min.js"></script>


</body>
</html>