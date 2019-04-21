<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta charset="utf-8">
        <title>小米管理系统</title>
    <link rel="shortcut icon" href="${pageContext.request.contextPath }/img/favicon.ico" type="image/x-icon">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <!-- 引入css -->
    <link href="admin/assets/css/bootstrap.min.css" rel="stylesheet">
	<script src="admin/assets/js/jquery.min.js"></script>
	<script src="admin/assets/js/bootstrap.min.js"></script>
    

    
</head>
<body>

<div class="div_list">
		<font></font>
		<table class="table">
			<tr>
				<td>用户ID</td>
				<td>用户名</td>
				<td>用户昵称</td>
				<td>用户密码</td>
				<td>功能</td>
			</tr>
			 <c:forEach var="UserCustom" items="${userList}">
			<tr>
				<td>${UserCustom.userId}</td>
				<td>${UserCustom.userName }</td>
				<td>${UserCustom.userNicheng }</td>
				<td>${UserCustom.password }</td>
				<td><button class="btn btn-warning btn-xs" data-toggle="modal" data-target="#myModal" onclick="update('${UserCustom.userId}','${UserCustom.userName }','${UserCustom.userNicheng}', '${UserCustom.password }')"><span class="glyphicon glyphicon-edit"></span> 修改</button></td>
			</tr>
			</c:forEach> 
			
		</table>
	</div>
	<!-- 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<!-- X 按钮关闭 -->
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<!-- 标题 -->
					<h4 class="modal-title" id="myModalLabel">
						信息修改
					</h4>
				</div>
			<!-- 表单 -->
				<form class="form-horizontal" role="form" action="${pageContext.request.contextPath }/upUserInf.html" method="post" ">
					<div class="modal-body">
					<!-- id -->
							<div class="form-group">
								<label for="disabledTextInput" class="col-sm-2 control-label">当前编号</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="userId" name="userId" readOnly="true">
								</div>
							</div>
					
					<!-- 用户名 -->
							<div class="form-group">
								<label for="lastname" class="col-sm-2 control-label">用户名</label>
								<div class="col-sm-10">
									<input type="text" id="userName" class="form-control" name="userName" readOnly="true">
								</div>
							</div>
					<!-- 密码 -->
							<div class="form-group">
								<label for="lastname" class="col-sm-2 control-label">新昵称</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="userNicheng" id="userNicheng">
								</div>
							</div>
							
							<div class="form-group">
								<label for="lastname" class="col-sm-2 control-label">修改密码</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" name="password" id="password">
								</div>
							</div>
					</div>
					<!-- 关闭及确定 -->
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭
						</button>
						<button type="submit" class="btn btn-primary">
							修改
						</button>
					</div>
				</form>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>
	
</body>
	<script type="text/javascript">
	function update(id, name,nicheng,password) {
		document.getElementById('userId').value = id;
		document.getElementById('userName').value = name;
		document.getElementById('userNicheng').value = nicheng;
		document.getElementById('password').value = password;
	}
	</script>
</html>
    