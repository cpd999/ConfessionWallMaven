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
package cn.xiaox.service;

import java.util.List;

import cn.xiaox.po.Biao;
import cn.xiaox.po.BiaoCustom;
import cn.xiaox.po.Pin;
import cn.xiaox.po.PinCustom;
import cn.xiaox.po.User;
import cn.xiaox.po.UserCustom;

/**  
 * <p> 用户模块</p> 
 * @ClassName:UserService   
 * @author: XIAOX.周巍 
 * @date: 2019年4月20日 下午4:10:05   
 * @since: V0.1 
 * @version V0.1
 * @Copyright: 注意：本内容仅限于学习传阅，禁止外泄以及用于其他的商业目
 */
public interface UserService {
	/**
	 *<p> 查询所有评论</p> 
	 * @Title: findAllPin    
	 * @version:V0.1     
	 * @return:List<PinCustom>
	 */
	public List<PinCustom> findAllPin();
	
	/**
	 *<p> 查询所有表白</p> 
	 * @Title: findAllBiao    
	 * @version:V0.1     
	 * @return:List<BiaoCustom>
	 */
	public List<BiaoCustom> findAllBiao();
	
	/**  
	 *<p> 登录</p> 
	 * @Title: login    
	 * @version:V0.1     
	 * @param usercustom    
	 * @return:void
	 */
	public UserCustom login(User user);
	
	/**  
	 *<p> 注册</p> 
	 * @Title: addUser    
	 * @version:V0.1     
	 * @param user    
	 * @return:void
	 */
	public void addUser(User user);
	
	/**  
	 *<p> 发表表白</p> 
	 * @Title: addBiao    
	 * @version:V0.1     
	 * @param biao    
	 * @return:void
	 */
	public void addBiao(Biao biao);
	
	/**  
	 *<p> 回复评论</p> 
	 * @Title: addHui    
	 * @version:V0.1     
	 * @param pin    
	 * @return:void
	 */
	public void addHui(Pin pin);
}
