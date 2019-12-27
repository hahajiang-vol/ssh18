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
	<h3 align="center">Excel上传成绩</h3>
     <form class="form-horizontal" action="uploadScores.action" method="post" enctype="multipart/form-data"  > 

     	<div class="form-group">
			<label class="col-md-5 col-sm-5 control-label" >Excel成绩表单：</label>
			<div class="col-md-3 ">
			
			   <input type="file" class="form-control" required="required" name="scoreFile" >
			
			</div>
		</div>
		<div class="form-group" >
			<label class="col-md-5 col-sm-5 control-label" >上传格式示例：</label>
			
			<div class="col-md-3">
				<img alt="上传格式"  src="img/upload.png"/>		
			</div>
		</div>
		
     	<div class="form-group">
			<label class="col-md-5 col-sm-5"></label>
			<div class="col-md-3">
				<input type="submit" class="btn btn-info btn-block" value="上传">				
			</div>
		</div>
     </form>
	
</div>

<script type="text/javascript"  src="js/jquery-1.12.3.min.js"></script>

<script type="text/javascript"  src="js/bootstrap.min.js"></script>

</body>
</html>