
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 网站下面 -->
<div data-role="footer" data-position="fixed">
		<div  data-role="navbar" data-position="fixed">    
			<c:if test="${empty userCustom}">
				<ul>        
						<li><a href="${pageContext.request.contextPath}/loginUI.html">登录账号</a></li>        
						<li><a href="${pageContext.request.contextPath}/registUI.html">注册账号</a></li>   
				</ul>  
			</c:if>   
			
			<c:if test="${not empty userCustom}">
				<ul>        
						<li><a href="${pageContext.request.contextPath}/biaoUI.html">发布表白</a></li>   
				</ul>  
			</c:if>   
		</div>
	</div>