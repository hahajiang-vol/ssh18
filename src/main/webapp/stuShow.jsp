<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>
		<style type="text/css">
			.row{
				border: 1px solid black;
			}
		</style>
	</head>
	<body>
	

		<div class="container-fluid">
			<div class="row" style="height: 300px;text-align: center;line-height: 150px;font-size: 60px;font-family: '楷体'; background-image: url(img/banner.jpg);background-size: 100% 100%;">
				<div class="col-md-12 ">
					<strong>个人信息</strong>
					<h6 align="right">${sessionScope.loginUser.userName}已经在登录
					<a href="exit.do">安全退出</a>
					</h6>
				</div>
			</div>
			<div class="row" style="height: 800px;">
				<div class="col-md-3">
					<div class="panel-group" id="accordion">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
									<a data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
										 个人管理
									</a>
								</h4>
								
							</div>
							<div class="panel-collapse collapse in" id="collapseOne">
								<div class="panel-body">
									<ul>
										<li><a href="stuInfo.jsp" target="pro">个人信息</a></li>
										<li><a href="checkIn.jsp" target="pro">考勤情况</a></li>
										<li><a href="stuExam.jsp" target="pro">阶段成绩</a></li>
										<li><a href="#">修改密码</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
										
				</div>
				
				<div class="col-md-9">
					<iframe name="pro" Scrolling="yes" style="width: 100%;height: 800px;">
						
					</iframe>
				</div>
			</div>
			<div class="row" style="height: 100px;text-align: center;line-height: 80px;">
				<div class="col-md-12">
					<span>&copy;版权所有</span>
				</div>
			</div>			
		</div>
	
		<script type="text/javascript" src="js/jquery-3.4.1.min.js" ></script>
		<script type="text/javascript" src="js/bootstrap.min.js" ></script>
	</body>
</html>
