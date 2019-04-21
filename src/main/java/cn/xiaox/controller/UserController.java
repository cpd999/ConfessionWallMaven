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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.xiaox.po.Biao;
import cn.xiaox.po.Pin;
import cn.xiaox.po.User;
import cn.xiaox.po.UserCustom;
import cn.xiaox.service.UserService;

/**  
 * <p> </p> 
 * @ClassName:UserController   
 * @author: XIAOX.周巍 
 * @date: 2019年4月20日 下午3:26:02   
 * @since: V0.1 
 * @version V0.1
 * @Copyright: 注意：本内容仅限于学习传阅，禁止外泄以及用于其他的商业目
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	/**
	 *<p>跳转到注册界面 </p> 
	 * @Title: registUI    
	 * @version:V0.1     
	 * @return:String
	 */
	@RequestMapping("registUI")
	public String registUI() {
		return "registed";
	}
	
	@RequestMapping("admin")
	public String AdminUI() {
		return "admin/index";
	}
	
	/**
	 *<p> 跳转登录界面</p> 
	 * @Title: loginUI    
	 * @version:V0.1     
	 * @return:String
	 */
	@RequestMapping("loginUI")
	public String loginUI() {
		return "login";
	}
	
	@RequestMapping("biaoUI")
	public String biaoUI() {
		return "biao";
	}
	
	/**
	 *<p> 显示网页所有数据评论</p> 
	 * @Title: findPinBiao    
	 * @version:V0.1     
	 * @param request
	 * @return:String
	 */
	@RequestMapping("findPinBiao")
	public String findPinBiao( HttpServletRequest request) {
		
		request.setAttribute("biao", userService.findAllBiao());
		request.setAttribute("pin", userService.findAllPin());
		return "index";
	}
	
	/**
	 *<p>登录 </p> 
	 * @Title: login    
	 * @version:V0.1     
	 * @param user
	 * @param request
	 * @return:String
	 */
	@RequestMapping(value="login")
	public String login(User user, HttpServletRequest request) {
		UserCustom userCustom = userService.login(user);
		//request.setAttribute("userCustom", userCustom);
		request.getSession().setAttribute("userCustom", userCustom);
		request.getSession().setAttribute("biao", userService.findAllBiao());
		request.getSession().setAttribute("pin", userService.findAllPin());
		
		
		//3.判断user值  生成返回信息
		if(userService.login(user)==null){
			//用户名与密码不匹配
			request.setAttribute("msg", "账号密码错误");
			return "login";
		}
		return "index";
	}
	
	/**
	 *<p>注册 </p> 
	 * @Title: registed    
	 * @version:V0.1     
	 * @param user
	 * @param request
	 * @return:String
	 */
	@RequestMapping("addUser")
	public String registed(User user, HttpServletRequest request) {
		System.out.println(user);
		try {
			userService.addUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "login";
	}
	
	/**
	 *<p>发布表白 </p> 
	 * @Title: addBiao    
	 * @version:V0.1     
	 * @param biaos
	 * @param request
	 * @param uname
	 * @param response
	 * @return:String
	 */
	@RequestMapping("addBiao")
	public String addBiao(Biao biaos, HttpServletRequest request, String uname, HttpServletResponse response) {
		biaos.setUname(uname);
		try {
			userService.addBiao(biaos);	
				request.setAttribute("biao", userService.findAllBiao());
				request.setAttribute("pin", userService.findAllPin());
				response.sendRedirect(request.getContextPath() + "/findPinBiao.html");
			} catch (IOException e) {
				request.setAttribute("msg", "发表失败");
				return "index";
			}
			return null;
	}
	
	/**
	 *<p> 评论回复</p> 
	 * @Title: addHui    
	 * @version:V0.1     
	 * @param pin
	 * @param uname
	 * @param nid
	 * @param request
	 * @param response
	 * @return:String
	 */
	@RequestMapping("addHui")
	public String addHui(Pin pin, String uname, String nid, HttpServletRequest request, HttpServletResponse response) {
		pin.setUname(uname);
		pin.setNid(nid);
		try {
			System.out.println(pin);
			userService.addHui(pin);
			request.setAttribute("biao", userService.findAllBiao());
			request.setAttribute("pin", userService.findAllPin());
			response.sendRedirect(request.getContextPath() + "/findPinBiao.html");
		} catch (IOException e) {
			request.setAttribute("msg", "回复失败");
			return "index";
		}
		return null;
	}
	
	/**
	 *<p> 退出</p> 
	 * @Title: outUI    
	 * @version:V0.1     
	 * @param request
	 * @param response
	 * @return:String
	 */
	@RequestMapping("outUI")
	public String outUI(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().invalidate();
		try {
			response.sendRedirect(request.getContextPath() + "/findPinBiao.html");
			
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
		
	}
}
