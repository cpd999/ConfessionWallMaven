<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<meta name="viewport" content="width=device-width,initial-scale=0.5"/>
		<title>川科表白墙</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/jquery.mobile-1.4.5.min.css" />
		<script src="${pageContext.request.contextPath }/js/jquery.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath }/js/jquery-1.11.3.js"></script>
		<script src="${pageContext.request.contextPath }/js/jquery.mobile-1.4.5.js"></script>
	</head>
	<body>
		<div data-role="page">
			
			<div data-role="content" >
		<div  id="bbb" data-role="collapsible-set" >
			
			<c:forEach items="${biao }" var="BiaoCustom">
				<div data-role='collapsible' >
				<h4>${BiaoCustom.uname}向${BiaoCustom.pname }表白</h4>
				<h4>${BiaoCustom.neirong }</h4>
				
					<c:forEach items="${pin }" var="PinCustom">
					<c:if test="${BiaoCustom.nid==PinCustom.nid}">
					 <p><b>${PinCustom.uname }：</b>${PinCustom.huifurei } <a href="${pageContext.request.contextPath}/deletehui.html?pid=${PinCustom.pid}">删除该条回复</a></p>
					 </c:if>
					</c:forEach>

				<form method="post" action="${pageContext.request.contextPath}/deletebiao.html?nid=${BiaoCustom.nid}" >
					<input type="submit" value="删除表白">
				</form>
				</div>
			</c:forEach>
			
		</div>
	</div>

</div>
	</body>
	
</html>
