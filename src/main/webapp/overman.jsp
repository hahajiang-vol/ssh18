<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>show</title>
		<script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
		<script type="text/jscript" src="js/bootstrap.js"></script>
		<link href="css/bootstrap.css" type="text/css" rel="stylesheet"/>
		<link rel="stylesheet" href="css/main.css" />
	</head>
	<body>
		<nav class="navbar navbar-inverse" role="navigation">
			<div class="container-fluid">
		        <div class="navbar-header">
		            <a class="navbar-brand" title="logoTitle" href="#">班主任</a>
		       </div>
		       <div class="collapse navbar-collapse">
		           <ul class="nav navbar-nav navbar-right">
		               <li role="presentation">
		                   <a href="#">当前用户：<span class="badge">${sessionScope.loginUser.userName }</span></a>
		               </li>
		               <li>
		                   <a href="exit.action">
		                         <span class="glyphicon glyphicon-lock"></span>退出登录</a>
		                </li>
		            </ul>
		       </div>
		    </div>
		</nav>
<div class="pageContainer">
     <div class="pageSidebar">
         <ul class="nav nav-stacked nav-pills">
             <li role="presentation">
                 <a href="studentFindAll.action" target="mainFrame" >当前班级管理</a>
             </li>
             <li role="presentation">
                 <a href="studentAddMany.jsp" target="mainFrame">批量添加</a>
             </li>
             <li role="presentation">
                 <a href="studentAll.action" target="mainFrame">考勤管理</a>
             </li>
             <li class="dropdown">
                 <a class="dropdown-toggle" data-toggle="dropdown" href="nav4.html" target="mainFrame">
                     个人设置<span class="caret"></span>
                 </a>
                 <ul class="dropdown-menu">
                     <li>
                         <a href="userPwdUpd.jsp" target="mainFrame">修改密码</a>
                     </li>
                     <li>
                         <a href="nav3.html" target="mainFrame">查看个人信息</a>
                     </li>
                 </ul>
             </li>
             <li role="presentation">
                 <a href="nav5.html" target="mainFrame">权限设置</a>
             </li>
         </ul>
     </div>

     <div class="splitter"></div>
     <div class="pageContent">
       <iframe src="studentFindAll.action" id="mainFrame" name="mainFrame" 
       	frameborder="0" width="100%"  height="100%" frameBorder="0">
       </iframe> 
     </div>

</div>
 <div class="footer">
     <p class="text-center">
         &copy;版权所有
     </p>
 </div>

	 <script type="text/javascript">
	 $(".nav li").click(function() {
	        $(".active").removeClass('active');
	        $(this).addClass("active");
	    }); 
	
	
	 </script>
		
	</body>
</html>