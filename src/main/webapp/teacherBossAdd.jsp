<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/20
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<form class="form-horizontal" role="form" action="clazzSave.action" method="post">
    <div class="form-group" style="margin-left: 380px; margin-top: 30px;">
        <label class="col-sm-2 control-label">班级名称</label>
        <div class="col-md-4">
            <input type="text" class="form-control" id="cName" name="clazz.clazzName"/>
        </div>
    </div>
    <div class="form-group" style="margin-left: 380px;">
        <label  class="col-sm-2 control-label">班级类型</label>
        <div class="col-md-4">
            <select class="form-control" name="clazz.clazzType">
                <option>开发</option>
                <option>测试</option>
            </select>
        </div>
    </div>
    <div class="form-group" style="margin-left: 380px;">
        <label  class="col-sm-2 control-label">阶段</label>
        <div class="col-md-4">
             <input type="text" class="form-control" id="cName" name="stage.stageId" value="1" placeholder="一阶段" disabled/>
             
        </div>
    </div>
   
    <div class="form-group" style="margin-left: 380px;">
        <label class="col-sm-2 control-label">教师</label>
        <div class="col-md-4">
            <select class="form-control" name="clazz.teacher.teacherId">
            	 <c:forEach items="${teachers }" var="cc">
                <option value="${cc.teacherId }">${cc.teacherName }</option>
                </c:forEach>
            </select>
        </div>
    </div>
     
    <div class="form-group" style="margin-left: 380px;">
        <label class="col-sm-2 control-label">班主任</label>
        <div class="col-md-4">
            <select class="form-control" name="clazz.overman.overmanId">
            <c:forEach items="${overmans }" var="cc">
                <option value="${cc.overmanId }">${cc.overmanName }</option> 
            </c:forEach>
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
