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
     <form class="form-horizontal" action="studentUpdate.action" method="post" >
       
       
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">学生姓名：</label>
			<div class="col-md-3 ">
				<input type="text" class="form-control"  required="required" name="st.studentName" readonly="readonly" value="${requestScope.student.studentName}">
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">学生性别：</label>
			<div class="col-md-3 ">
			
			   <input type="text" class="form-control" required="required" name="st.studentSex"  readonly="readonly" value="${requestScope.student.studentSex}">
			
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">学号：</label>
			<div class="col-md-3 ">
			
			   <input type="text" class="form-control" required="required" name="st.sutdentCode"  readonly="readonly" value="${requestScope.student.sutdentCode}">
			
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">手机号：</label>
			<div class="col-md-3 ">
			
			   <input type="text" class="form-control" required="required" name="st.studentPhone"  readonly="readonly" value="${requestScope.student.studentPhone}">
			
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">住址：</label>
			<div class="col-md-3 ">
			
			   <input type="text" class="form-control" required="required" name="st.studentAddress"  readonly="readonly" value="${requestScope.student.studentAddress}">
			
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">毕业学校：</label>
			<div class="col-md-3 ">
			
			   <input type="text" class="form-control" required="required" name="st.studentCollege"  readonly="readonly" value="${requestScope.student.studentCollege}">
			
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">毕业日期：</label>
			<div class="col-md-3 ">
			
			   <input type="text" class="form-control" required="required" name="st.studentGraduateTime"  readonly="readonly" value="${requestScope.student.studentGraduateTime}">
			
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">学历：</label>
			<div class="col-md-3 ">		
			   <input type="text" class="form-control" required="required" name="st.studentEdu"  readonly="readonly" value="${requestScope.student.studentEdu}">
			
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">专业：</label>
			<div class="col-md-3 ">
			
			   <input type="text" class="form-control" required="required" name="st.studentProfessional"  readonly="readonly" value="${requestScope.student.studentProfessional}">
			
			</div>
		</div>
		
		  <div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">转入班级:</label>
			<div class="col-md-3 ">				
			   
			  	 <select name="st.clazz.clazzId" class="form-control" >
				 	<option value="1">1</option>
				 	<option value="2">2</option>
				 	
				 </select>
			</div>
		</div>
        
           
		<div class="form-group">
			<label class="col-md-5 col-sm-5"></label>
			<div class="col-md-3">
				<input type="submit" class="btn btn-info btn-block" value="保存">
				<input type="hidden" value="${requestScope.student.studentId}" name="st.studentId" > 
				<input type="hidden" value="${requestScope.student.user.userId}" name="st.user.userId" >
			</div>
			
		</div>
     </form>
	
</div>

<script type="text/javascript"  src="js/jquery-1.12.3.min.js"></script>

<script type="text/javascript"  src="js/bootstrap.min.js"></script>


</body>
</html>