
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 头部 -->
			<div data-role = "header" data-position = "fixed">
				<h1>
				<c:if test="${not empty userCustom }">
				欢迎<span style="color: red;">${userCustom.userNicheng }</span>登陆&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/outUI.html">退出账号</a>
				</c:if>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;川科表白墙</h1>
			</div>