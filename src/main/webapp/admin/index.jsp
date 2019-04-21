<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<meta http-equiv="Pragma" content="no-cache"> 
<meta http-equiv="Cache-Control" content="no-cache"> 
<meta http-equiv="Expires" content="0"> 
<title>川科表白墙管理后台</title>
<link href="${pageContext.request.contextPath }/css/Logins.css" rel="stylesheet" type="text/css" />
<script>	
				function sub(){
					var uname=document.getElementById("uname").value;
					var password = document.getElementById("padw").value;
					//创建2个新对象用于清除内容用.value方法
					var uname_two=document.getElementById("uname")
					var password_two = document.getElementById("padw")
					//将用户名输出在控制台
					//console.log(uname);
					//判断用户名长度（账号长度为6-12）
					if (uname.length>5&&uname.length<13) {
						alert("用户名正确");
						//密码必须以字母开头  6-16为
						if (/^[a-zA-Z]\w{5,17}$/.test(password)) {
							alert("密码正确");
						}else{
							password_two.value="";
							alert("密码格式错误");
						}
					}else{
						uname_two.value="";
						alert("用户名错误");
					}
				}
		</script>

</head>

<body>
	<div class="login_box">
	      <div class="login_l_img"><img src="${pageContext.request.contextPath }/img/login-img.png" /></div>
	      <div class="login">
	          <div class="login_logo"><a href="#"><img src="${pageContext.request.contextPath }/img/login_logo.png" /></a></div>
	          <div class="login_name">
	               <p>登陆管理</p>
	          </div>
	          <form method="post" action=" ${pageContext.request.contextPath }/logins.html " onsubmit="return sub">
	            <input name="name" type="text"  value="用户名" onfocus="this.value=''" onblur="if(this.value==''){this.value='用户名'}">
		        <span id="password_text" onclick="this.style.display='none';document.getElementById('password').style.display='block';document.getElementById('password').focus().select();" >密码</span>
				<input name="password" type="password" id="password" style="display:none;" onblur="if(this.value==''){document.getElementById('password_text').style.display='block';this.style.display='none'};"/>
		        <input value="登录" style="width:100%;" type="submit">
		        <!-- <input value="点击我一下去注册>>" style="width:100%;margin-top: 20px;float: right;" type="submit" onClick="window.open('re.jsp')"> -->
	          </form>
	          <p align="center" style="color: red;">${inf}</p>
	      </div>
	      <div class="copyright">小小工作室 版权所有©2018-2018 技术支持博客：<a href="https://xiaoandx.github.io/" target="_blank">XIAOANDX</a></div>
	</div>
</body>
</html>