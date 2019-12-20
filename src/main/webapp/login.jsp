<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
</head>
<body>
	<div style="margin: 0px;auto;">
		<nav style="background-image: url(img/banner.jpg);background-size: 100% 100%; height: 100px;margin: 0px;auto;text-align: center;">
			<div>
				<h1>管理系统登录界面</h1>
			</div>
		</nav>
		<div style="margin: 0px;auto;text-align: center;margin-top: 50px;">
			<form action="login.action" method="post">
				<div style="margin-top: 10px;">
					用户名：<input name="user.userName"/>
				</div>
				<div style="margin-top: 10px;">
					密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="user.userPwd" />
				</div>
				<div style="margin-top: 10px;">
					<input type="submit" value="登录"/>					
				</div>
			</form>
		</div>
		<div style="margin: 0px;auto;text-align: center;margin-top: 100px;">
			<span>&copy;蜗牛学院  版权所有</span>
		</div>

	</div>

<script type="text/javascript" src="js/jquery-3.4.1.min.js" ></script>
<script type="text/javascript" src="js/bootstrap.min.js" ></script>

</body>
</html>