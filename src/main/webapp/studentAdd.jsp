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
     <form class="form-horizontal" action="studentSave.action" method="post" > 
     
     	<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">学生姓名：</label>
			<div class="col-md-3 ">
				<input type="text" class="form-control"  required="required" name="st.studentName" ">
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">学生性别：</label>
			<div class="col-md-3 ">
			
			   <input type="text" class="form-control" required="required" name="st.studentSex" >
			
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">学号：</label>
			<div class="col-md-3 ">
			
			   <input type="text" class="form-control" required="required" name="st.sutdentCode" >
			
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">手机号：</label>
			<div class="col-md-3 ">
			
			   <input type="text" class="form-control" required="required" name="st.studentPhone" >
			
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">住址：</label>
			<div class="col-md-3 ">
			
			   <input type="text" class="form-control" required="required" name="st.studentAddress" >
			
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">毕业学校：</label>
			<div class="col-md-3 ">
			
			   <input type="text" class="form-control" required="required" name="st.studentCollege" >
			
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">学历：</label>
			<div class="col-md-3 ">
			
			   <input type="text" class="form-control" required="required" name="st.studentEdu" >
			
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">专业：</label>
			<div class="col-md-3 ">
			
			   <input type="text" class="form-control" required="required" name="st.studentProfessional" >
			
			</div>
		</div>
		<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">毕业时间:</label>
			<div class="col-md-3 " >				
			   <input type="date" class="form-control" required="required"  name="st.studentGraduateTime" >
			  	 
			</div>
		</div>
		  <div class="form-group">
			<label class="col-md-5 col-sm-5 control-label">所属班级：</label>
			<div class="col-md-3 " >				
			   <input type="text" class="form-control" value="${sessionScope.clazzId}" readonly="readonly" name="st.clazz.clazzId" >
			  	 
			</div>
		</div>
         
           
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