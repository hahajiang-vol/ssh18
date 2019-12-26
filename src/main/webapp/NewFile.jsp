<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
		<script type="text/jscript" src="js/bootstrap.js"></script>
		
		<link href="css/bootstrap.css" type="text/css" rel="stylesheet"/>
		<script type="text/javascript">
var ctx = document.getElementById("myChart").getContext("2d");                
var data = {                        
/// 表现在X轴上的数据，数组形式                            
 labels : ["January","February","March","April","May","June","July"],                         
 /// 第一条线                             
 datasets : [                             
 {                                     
 /// 曲线的填充颜色                                         
 fillColor : "rgba(220,220,220,0.5)",                                     
 /// 填充块的边框线的颜色                                         
 strokeColor : "rgba(220,220,220,1)",                                     
 /// 表示数据的圆圈的颜色                                         
 pointColor : "rgba(220,220,220,1)",                                     
 /// 表示数据的圆圈的边的颜色                                         
 pointStrokeColor : "#fff",                                         
 data : [65.5,59.2,90,81,56,55,40]                     
 },                     
 /// 第二条线                     
 {                                 
 fillColor : "rgba(151,187,205,0.5)",                                 
 strokeColor : "rgba(151,187,205,1)",                                 
 pointColor : "rgba(151,187,205,1)",                                 
 pointStrokeColor : "#fff",                                 
 data : [28,48,40,19,96,27,100]                         
 }                     
 ]                 
 }                 
 /// 动画效果call                 
 var options = {                      
 scaleFontStyle: "normal"                
 }                 
 /// 创建对象，生成折线图表                
 new Chart(ctx).Line(data,options);
</script>
</head>
<body>
<div id="myChart"></div>
</body>
</html>