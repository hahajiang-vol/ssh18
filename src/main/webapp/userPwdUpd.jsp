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
	<form action="userPwdSave.action" id="formUser" method="post" style="margin-top: 150px; margin-left: 100px;">
		
		<table style="width: 50%;margin: 0px auto;">
			
			<tr>
				<th class="one">原&nbsp;&nbsp;密&nbsp;&nbsp;码：</th>
				<th><input type="password" id="oldUserPwd" name="oldUserPwd"></th>
				
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
			$("#newUserPwd").blur(function(){
				var newUserPwd = $("#newUserPwd").val();
				if(newUserPwd.length < 6 || newUserPwd.length > 16) {
					document.getElementById("new").style.color = "red";
					document.getElementById("new").innerHTML = "密码不规范";
				}else{
					document.getElementById("new").style.color="green";
					document.getElementById("new").innerHTML = "密码可用"; 
					$("#newUserPwd2").blur(function(){
						var newUserPwd = $("#newUserPwd").val();
						var newUserPwd2 = $("#newUserPwd2").val();
						if (newUserPwd != newUserPwd2 ) {
							/* document.getElementById("new2").style.color = "red";
				    		document.getElementById("new2").innerHTML = "密码输入不一致"; */
				    		$("new2").html("密码输入不一致");
						}else{
				    		document.getElementById("new2").style.color="green";
				    		document.getElementById("new2").innerHTML = "密码可用"; 
				    	}
					})
				}
			})
			

			
			//提交信息，如果输入错误，则无法提交
			$("#btnYes").click(function(){
				
				var newUserPwd = $("#newUserPwd").val();
				var newUserPwd2 = $("#newUserPwd2").val();
				if (newUserPwd.length < 6 || newUserPwd.length > 16) {
					return false;
				}else if(newUserPwd != newUserPwd2){
					return false;
				}else if(newUserPwd == newUserPwd2){
					$.ajax({
						url:"userPwdSave.action",
						type:"post",
						data:$("#formUser").serialize(),
						async:false,
						error:function(data){	
						},
						success:function(data){
							if(data === "true"){
								top.location.href="login.jsp";
							}else{
								alert("原密码错误");
								window.location.href="userPwdUpd.jsp";
							}
							
						}
						
					})
					
				}
				
				return false;
				
			})
			
		}
	
	
	</script>
	
</body>
</html>