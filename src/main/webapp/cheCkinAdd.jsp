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
		<style type="text/css">
		
		</style>
	</head>
	<body>
	
		<table class="table table-striped">
		  <caption><font color="#2B669A" size="5">今日考勤</font></caption>
		 
		  <thead>
		    <tr>
		      <th>序号</th>
		      <th>学生姓名</th>
		      <th>学号</th>
		      <th>出勤日期</th>		      
		      <th>考勤类型</th>		      
		      
		    </tr>
		  </thead>
		  <tbody>
		  <c:forEach items="${sts }" var="stu" varStatus="i">
		    <tr>
		      <th>${i.count }</th>
		      <th>${stu.studentName}</th>
		      <th>${stu.sutdentCode} </th>
		      <th><script type="text/javascript">
                     var date = new Date();
                     document.write(  date.getFullYear() + "年" + (date.getMonth() + 1) + "月" + date.getDate() + "日" + " 星期" + "日一二三四五六".charAt(date.getDay()));
                   </script></th>
			
				
				 
		      <th >
		
				<a href="checkinSave.action?checkin.student.studentId=${stu.studentId}&checkin.checkintype.checkInTypeId=1" class="btn btn-primary btn-xs active" role="button" onsubmit="return saveReport();">出勤</a>		     
		       <a href="checkinSave.action?checkin.student.studentId=${stu.studentId}&checkin.checkintype.checkInTypeId=2" class="btn btn-primary btn-xs active" role="button">迟到</a>
		       <a href="checkinSave.action?checkin.student.studentId=${stu.studentId}&checkin.checkintype.checkInTypeId=3" class="btn btn-primary btn-xs active" role="button">病假</a>
		       <a href="checkinSave.action?checkin.student.studentId=${stu.studentId}&checkin.checkintype.checkInTypeId=4" class="btn btn-primary btn-xs active" role="button">事假</a>
		      	<a href="checkinSave.action?checkin.student.studentId=${stu.studentId}&checkin.checkintype.checkInTypeId=5" class="btn btn-primary btn-xs active" role="button">旷课</a>
	      
		      </th>		      
		    </tr>
		    </c:forEach>
		  	 
		  </tbody>		   
		</table>
		<script type="text/javascript">
		function saveReport() {
	    	// jquery 表单提交
	    	$('a').ajaxSubmit(function(message) {
	    	// 对于表单提交成功后处理，message为提交页面saveReport.htm的返回内容
	    	
	    	});

	    	return false; // 必须返回false，否则表单会自己再做一次提交操作，并且页面跳转
	    	
	    }
		 $('a').on('click',function(e){
    
		    $(this).css('background','#000').siblings().css('background','#fff');
		    
		}); 
		 
		 
		</script>
	
	</body>
</html>
