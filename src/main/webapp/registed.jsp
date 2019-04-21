<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />   
<meta name="viewport" content="width=device-width, initial-scale=0.5">  
<!--<script src="cordova.js"></script>-->     
		<link rel="stylesheet" href="css/jquery.mobile-1.4.5.min.css" />
		<script src="js/jquery-1.11.3.js"></script>
		<script src="js/jquery.mobile-1.4.5.js"></script>
</head>               
<body>     
<div data-role="page">
	<%@include file="head.jsp" %>
	<div data-role="content">
		<form action="${pageContext.request.contextPath}/addUser.html" method="post">
			<label for="zhanghao">账号:</label>
			<input name="userName" id="userName" value="" type="text">
			<label for="nicheng">昵称（请尽量使用真实姓名）:</label>
			<input name="userNicheng" id="userNicheng" value="" type="text">
			<label for="zhanghao">密码:</label>
			<input name="password" id="password" value="" type="password">
			<input type="submit" value="注册">
		</form>
	</div>
	<%@include file="foot.jsp" %>
</div>
</body>     
	<script type="text/javascript">
	</script>
</html>