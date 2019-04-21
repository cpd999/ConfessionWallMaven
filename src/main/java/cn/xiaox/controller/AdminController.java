/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.xiaox.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.xiaox.po.AdminUser;
import cn.xiaox.po.AdminUserCustom;
import cn.xiaox.po.Biao;
import cn.xiaox.po.Pin;
import cn.xiaox.po.User;
import cn.xiaox.po.UserCustom;
import cn.xiaox.service.AdminService;
import cn.xiaox.service.UserService;

/**  
 * <p>管理员模块</p> 
 * @ClassName:AdminController   
 * @author: XIAOX.周巍 
 * @date: 2019年4月20日 下午10:33:21   
 * @since: V0.1 
 * @version V0.1
 * @Copyright: 注意：本内容仅限于学习传阅，禁止外泄以及用于其他的商业目
 */
@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	@Autowired
	private UserService userService;
	
	/**
	 *<p>管理员登录</p> 
	 * @Title: logins    
	 * @version:V0.1     
	 * @param adminUser
	 * @param request
	 * @return    
	 * @return:String
	 */
	@RequestMapping("logins")
	public String logins(AdminUser adminUser, HttpServletRequest request) {
		AdminUserCustom adminUserCustom = adminService.login(adminUser);
		if(adminUserCustom == null) {
			request.setAttribute("inf", "登陆失败");
			return "admin/index";
		}
		request.getSession().setAttribute("adminUserCustom", adminUserCustom);
		return "admin/Dome";
	}
	
	/**
	 *<p>管理员退出 </p> 
	 * @Title: adminOut    
	 * @version:V0.1     
	 * @param request
	 * @return    
	 * @return:String
	 */
	@RequestMapping("adminOut")
	public String adminOut(HttpServletRequest request) {
		request.getSession().invalidate();
		request.getSession().removeAttribute("adminUserCustom");
		return "idex2";
	}
	
	/**
	 *<p>默认主界面</p> 
	 * @Title: mainUI    
	 * @version:V0.1     
	 * @return    
	 * @return:String
	 */
	@RequestMapping("main")
	public String mainUI() {
		return "admin/main";
	}
	
	/**
	 *<p>查询所有用户信息</p> 
	 * @Title: findAllUser    
	 * @version:V0.1     
	 * @param request
	 * @return    
	 * @return:String
	 */
	@RequestMapping("findAllUser")
	public String findAllUser(HttpServletRequest request) {
		List<UserCustom> userList= adminService.findAllUser();
		request.setAttribute("userList", userList);
		return "admin/selectAllInf";
	}
	
	/**
	 *<p>修改用户信息</p> 
	 * @Title: upUserInf    
	 * @version:V0.1     
	 * @param user
	 * @param request
	 * @return    
	 * @return:String
	 */
	@RequestMapping("upUserInf")
	public String upUserInf(User user, HttpServletRequest request) {
		adminService.upUserInf(user);
		List<UserCustom> userList= adminService.findAllUser();
		request.setAttribute("userList", userList);
		return "admin/selectAllInf";
	}
	
	/**
	 *<p>查询所有表白信息</p> 
	 * @Title: findALlbiaobao    
	 * @version:V0.1     
	 * @param request
	 * @return    
	 * @return:String
	 */
	@RequestMapping("findALlbiaobao")
	public String findALlbiaobao(HttpServletRequest request) {
		request.setAttribute("biao", userService.findAllBiao());
		request.setAttribute("pin", userService.findAllPin());
		return "admin/biaobai";
	}
	
	/**
	 *<p> 删除回复</p> 
	 * @Title: deletehui    
	 * @version:V0.1     
	 * @param pins
	 * @param request
	 * @param response    
	 * @return:void
	 */
	@RequestMapping("deletehui")
	public void deletehui(Pin pins, HttpServletRequest request, HttpServletResponse response) {
		adminService.deletehui(pins);
		try {
			request.setAttribute("biao", userService.findAllBiao());
			request.setAttribute("pin", userService.findAllPin());
			response.sendRedirect(request.getContextPath() + "/findALlbiaobao.html");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	/**
	 *<p> 删除表白</p> 
	 * @Title: deletebiao    
	 * @version:V0.1     
	 * @param biaos
	 * @param request
	 * @param response    
	 * @return:void
	 */
	@RequestMapping("deletebiao")
	public void deletebiao(Biao biaos, HttpServletRequest request, HttpServletResponse response) {
		adminService.deletebiao(biaos);
		try {
			request.setAttribute("biao", userService.findAllBiao());
			request.setAttribute("pin", userService.findAllPin());
			response.sendRedirect(request.getContextPath() + "/findALlbiaobao.html");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
