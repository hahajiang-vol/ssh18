<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<style type="text/css">
	.one{
		width: 10px;
	}
</style>
</head>
<body>
	<form action="userPwdSave.action" method="post" style="margin-top: 150px; margin-left: 100px;">
		
		<table style="width: 50%;margin: 0px auto;">
			
			<tr>
				<th class="one">原&nbsp;&nbsp;密&nbsp;&nbsp;码：</th>
				<th><input type="password" id="oldUserPwd">&nbsp;&nbsp;<span id="old"></span></th>
				
			</tr>
			<tr>
				<th class="one">新&nbsp;&nbsp;密&nbsp;&nbsp;码：</th>
				<th><input type="password" id="newUserPwd" name="newUserPwd">&nbsp;&nbsp;<span id="new"></span></th>
				
			</tr>
			<tr>
				<th class="one">确认密码：</th>
				<th><input type="password" id="newUserPwd2">&nbsp;&nbsp;<span id="new2"></span></th>
			</tr>
			<tr>
				<th class="one"></th>
				<th><input type="submit" value="保存" id="btnYes">
					<a href="student.jsp">
						<input type="button" value="返回">
					</a>
				</th>
				
			</tr>
		
		</table>
	</form>			
	
<script src="js/jquery-3.4.1.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script type="text/javascript">
	
		
		/*调函数*/
		updPwd();
		/*函数*/ 
		function updPwd(){
			
		//失焦事件，输入提示信息	
		$("#oldUserPwd").blur(function(){
				var oldUserPwd = $("#oldUserPwd").val();
				var userPwd = ${loginUser.userPwd};
				if (oldUserPwd != userPwd) {
					document.getElementById("old").style.color = "red";
					document.getElementById("old").innerHTML = "密码输入错误";
				}else{
					document.getElementById("old").style.color="green";
					document.getElementById("old").innerHTML = "密码输入正确"; 
				}
			})
			
			$("#newUserPwd").blur(function(){
				var newUserPwd = $("#newUserPwd").val();
				if(newUserPwd.length < 6) {
					document.getElementById("new").style.color = "red";
					document.getElementById("new").innerHTML = "密码不规范";
				}else{
					document.getElementById("new").style.color="green";
					document.getElementById("new").innerHTML = "密码可用"; 
				}
			})
			
			$("#newUserPwd2").blur(function(){
				var newUserPwd = $("#newUserPwd").val();
				var newUserPwd2 = $("#newUserPwd2").val();
				if (newUserPwd != newUserPwd2 ) {
					document.getElementById("new2").style.color = "red";
		    		document.getElementById("new2").innerHTML = "密码输入不一致";
				}else{
		    		document.getElementById("new2").style.color="green";
		    		document.getElementById("new2").innerHTML = "密码输入一致"; 
		    	}
			})
			
			//提交信息，如果输入错误，则无法提交
			$("#btnYes").click(function(){
				alert("${loginUser.userPwd}");
				var oldUserPwd = $("#oldUserPwd").val();
				
				var newUserPwd = $("#newUserPwd").val();
				
				var newUserPwd2 = $("#newUserPwd2").val();
				
				if (oldUserPwd != ${loginUser.userPwd }) {
					alert("用户名输入不正确");
					return false;
				}else if (newUserPwd.length < 6) {
					alert("密码输入不规范"); 
					return false;
				}else if(newUserPwd != newUserPwd2){
					alert("两次密码输入不一致");
					return false;
				}
				
			})
			
		}
	
	
	</script>
	
</body>
</html>