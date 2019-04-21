<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta charset="utf-8">
        <title>川科表白墙管理系统</title>
    <link rel="shortcut icon" href="${pageContext.request.contextPath }/img/favicon.ico" type="image/x-icon">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <!-- 引入css -->
    <link rel="stylesheet" type="text/css" href="admin/static/css/plugins/font-awesome-4.7.0/css/font-awesome.min.css"  media="all">
    <link rel="stylesheet" type="text/css" href="admin/static/lib/layui-v2.3.0/css/layui.css"  media="all">
    <link rel="stylesheet" type="text/css" href="admin/static/css/main.css"  media="all">
    

    
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <!-- 导航栏 -->
    <div class="layui-header">
        <a href="#" class="layui-logo">
            <span class="layui-logo-mini">管理系统</span>
            <span class="layui-logo-lg">表白墙管理系统</span>
        </a>
        <a class="side-toggle layui-layout-left" href="#">
            <i class="layui-icon layui-icon-shrink-right"></i>
            <i class="layui-icon layui-icon-spread-left"></i>
        </a>
        <ul class="layui-nav layui-layout-right">
        	
            
            <li class="layui-nav-item">
                <a href="#">
                    <i class="fa fa-bell-o fa-lg"></i>
                </a>
            </li>
            <li class="layui-nav-item">
                <a class="timo-screen-full" href="#">
                    <i class="fa layui-icon layui-icon-screen-full"></i>
                </a>
            </li>
            <li class="layui-nav-item timo-nav-user">
                <a class="timo-header-nickname">${adminUserCustom.nicheng }</a>
                <div class="layui-nav-child">
                    <div class="timo-nav-child-box">
                        
                        <div><a href="${pageContext.request.contextPath }/adminOut.html"><i class="fa fa-power-off"></i>退出登录</a></div>
                    </div>
                </div>
            </li>
        </ul>
    </div>

    <!-- 侧边栏 -->
    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <div class="layui-side-user">
                <img class="layui-side-user-avatar" src="${pageContext.request.contextPath }/img/char-ccmiao.png" alt="头像">
                <div>
                    <p class="layui-side-user-name">${adminUserCustom.nicheng }</p>
                    <p class="layui-side-user-designation">在线</p>
                </div>
            </div>
            <!-- 导航区域 -->
            <ul class="layui-nav layui-nav-tree" lay-filter="layui-nav-side">
                <li class="layui-nav-item">
                    <a href="javascript:;" lay-url="${pageContext.request.contextPath }/admin/main.jsp"><i
                            class="layui-icon layui-icon-home"></i><span class="layui-nav-title">主页</span></a>
                    
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;" lay-url="#"><i
                            class="fa fa-cog"></i><span class="layui-nav-title">用户管理</span></a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" lay-url="${pageContext.request.contextPath }/findAllUser.html"><span
                                class="layui-nav-title">查看所有用户</span></a></dd>
                        
                        
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;" lay-url="#"><i
                            class="fa fa-database"></i><span class="layui-nav-title">表白管理</span></a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" lay-url="${pageContext.request.contextPath }/findALlbiaobao.html"><span
                                class="layui-nav-title">查看表白内容</span></a></dd>
                       
                    </dl>
                </li>
                
            </ul>
        </div>
    </div>
    <!-- 主体区域 -->
    <div class="layui-body layui-tab layui-tab-brief" lay-allowclose="true" lay-filter="iframe-tabs">
        <!-- 标签栏 -->
        <ul class="layui-tab-title"></ul>
        <!-- 内容区域 -->
        <div class="layui-tab-content"></div>
    </div>
</div>

        <script src="admin/static/lib/layui-v2.3.0/layui.js" charset="utf-8"></script>
        <script src="admin/static/js/main.js" charset="utf-8"></script>
        
    
</body>
</html>
    