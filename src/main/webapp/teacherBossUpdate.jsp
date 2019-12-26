<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/20
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<form class="form-horizontal" role="form" action="clazzSaveUpdate.action" method="post">
    <div class="form-group" style="margin-left: 380px; margin-top: 30px;">
        <label class="col-sm-2 control-label">班级名称</label>
        <div class="col-md-4">
            <input class="form-control" id="cname" type="text" value="${clazz.clazzName}" name="clazz.clazzName" disabled>
        </div>
    </div>
    <div class="form-group" style="margin-left: 380px;">
        <label class="col-sm-2 control-label">班级类型</label>
        <div class="col-md-4">
            <input class="form-control" id="ctype" type="text" value="${clazz.clazzType}" name="clazz.clazzType" disabled>
        </div>
    </div>
    <div class="form-group" style="margin-left: 380px;">
        <label  class="col-sm-2 control-label">阶段</label>
        <div class="col-md-4">
             <select class="form-control" name="clazz.stage.stageId">
                <option value="1">一阶段</option>
                <option value="2">二阶段</option>
                <option value="3">三阶段</option>
                <option value="4">四阶段</option>
            </select>
        </div>
    </div>
    <div class="form-group" style="margin-left: 380px;">
        <label  class="col-sm-2 control-label">教师</label>
        <div class="col-md-4">
            <select class="form-control" name="clazz.teacher.teacherId">
            <c:forEach items="${teachers }" var="cc">
                <option value="${cc.teacherId }">${cc.teacherName }</option>
            </c:forEach>
            </select>
        </div>
    </div>
    <div class="form-group" style="margin-left: 380px;">
        <label  class="col-sm-2 control-label">班主任</label>
        <div class="col-md-4">
          <input class="form-control" id="coverman" type="text"  placeholder="${clazz.overman.overmanName}" name="clazz.overman.overmanName" disabled>
        </div>
    </div>
    <!-- 隐藏域 -->
	<input type = "hidden" name = "clazz.overman.oermanId" value="${clazz.overman.overmanId}">
	<input type = "hidden" name = "clazz.clazzId" value = "${clazz.clazzId }">
    <div class="form-group" style="margin-left: 380px;">
        <div class="col-md-offset-2 col-md-10">
            <button type="submit" class="btn btn-success">保存</button>
        </div>
    </div>
</form>
</body>
</html>
