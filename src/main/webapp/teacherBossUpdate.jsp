<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/20
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>addClass</title>
    <script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
    <script type="text/jscript" src="js/bootstrap.js"></script>
    <link href="css/bootstrap.css" type="text/css" rel="stylesheet"/>
</head>
<body>
<h3><p align="center">班级管理</p></h3>
<form class="form-horizontal" role="form">
    <div class="form-group" style="margin-left: 380px; margin-top: 30px;">
        <label class="col-sm-2 control-label">班级名称</label>
        <div class="col-md-4">
            <input class="form-control" id="cname" type="text" placeholder="sssssss" disabled>
        </div>
    </div>
    <div class="form-group" style="margin-left: 380px;">
        <label class="col-sm-2 control-label">班级类型</label>
        <div class="col-md-4">
            <input class="form-control" id="ctype" type="text" placeholder="sssssss" disabled>
        </div>
    </div>
    <div class="form-group" style="margin-left: 380px;">
        <label  class="col-sm-2 control-label">阶段</label>
        <div class="col-md-4">
            <input class="form-control" id="cs" type="text" placeholder="sssssss" disabled>
        </div>
    </div>
    <div class="form-group" style="margin-left: 380px;">
        <label  class="col-sm-2 control-label">教师</label>
        <div class="col-md-4">
            <select class="form-control">
                <option>张老师</option>
                <option>王老师</option>
            </select>
        </div>
    </div>
    <div class="form-group" style="margin-left: 380px;">
        <label  class="col-sm-2 control-label">班主任</label>
        <div class="col-md-4">
            <select class="form-control">
                <option>李老师</option>
                <option>刘老师</option>
            </select>
        </div>
    </div>

    <div class="form-group" style="margin-left: 380px;">
        <div class="col-md-offset-2 col-md-10">
            <button type="submit" class="btn btn-success">保存</button>
        </div>
    </div>
</form>
</body>
</html>
