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
		<form action="${pageContext.request.contextPath }/addBiao.html?uname=${userCustom.userNicheng}" method="post">
			<label for="demo">目标（向谁表白）:</label>
			<%-- <input name="${userCustom.userNicheng}" id="${userCustom.userNicheng}"/> --%>
			<input name="pname" id="pname" value="" type="text">
			<label for="biaobai">表白内容:</label>
			<textarea rows="20" name="neirong" id="neirong">
			</textarea>
			<input type="submit" value="发布">
		</form>
	</div>
	<%@include file="foot.jsp" %>
</div>
</body>     
</html>
