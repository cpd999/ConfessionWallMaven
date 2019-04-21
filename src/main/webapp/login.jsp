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
<script>
	$( "#mypanel" ).trigger( "updatelayout" );  
</script> 
<script type="text/javascript">
    $(document).ready(function(){
      $("div").bind("swiperight", function(event) {
        $( "#mypanel" ).panel( "open" );
      });  
    });
 </script>
 <script type="text/javascript">
	 if((${msg!=null})){
	 	alert("${msg}");
	 }
 </script>
</head>               
<body>     
<div data-role="page">
	
		<form action="${pageContext.request.contextPath }/login.html" method="post">
			<label for="zhanghao">账号:</label>
			<input name="userName" id="userName" value="" type="text">
			<label for="zhanghao">密码:</label>
			<input name="password" id="password" value="" type="password">
			<fieldset class="ui-grid-a">
				<div class="ui-block-a">
					<input type="submit" value="登陆">
				</div>
				<div class="ui-block-b">
					<a data-role="button" href="${pageContext.request.contextPath}/registUI.html">注册</a>
				</div>
			</fieldset>
		</form>
	<%@include file="head.jsp" %>
	
	<%@include file="foot.jsp" %>
</div>
</body>     
</html>
