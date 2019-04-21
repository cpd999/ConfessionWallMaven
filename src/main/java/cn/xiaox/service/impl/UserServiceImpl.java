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
package cn.xiaox.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xiaox.dao.BiaoMapper;
import cn.xiaox.dao.PinMapper;
import cn.xiaox.dao.UserMapper;
import cn.xiaox.po.Biao;
import cn.xiaox.po.BiaoCustom;
import cn.xiaox.po.Pin;
import cn.xiaox.po.PinCustom;
import cn.xiaox.po.User;
import cn.xiaox.po.UserCustom;
import cn.xiaox.service.UserService;

/**  
 * <p>用户持久层 </p> 
 * @ClassName:UserService   
 * @author: XIAOX.周巍 
 * @date: 2019年4月20日 下午4:10:43   
 * @since: V0.1 
 * @version V0.1
 * @Copyright: 注意：本内容仅限于学习传阅，禁止外泄以及用于其他的商业目
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private BiaoMapper biaoMapper;
	@Autowired
	private PinMapper pinMapper;
	@Autowired
	private UserMapper userMapper;
	
	/**
	 *<p> 查询所有评论</p> 
	 * @Title: findAllPin    
	 * @version:V0.1     
	 * @return:List<PinCustom>
	 */
	public List<PinCustom> findAllPin(){
		return pinMapper.findAllPin();
	}
	
	/**
	 *<p> 查询所有表白</p> 
	 * @Title: findAllBiao    
	 * @version:V0.1     
	 * @return:List<BiaoCustom>
	 */
	public List<BiaoCustom> findAllBiao(){
		return biaoMapper.findAllBiao();
	}

	/**   
	 * <p>Title: login</p>   
	 * <p>Description: </p>   
	 * @param user
	 * @return   
	 * @see cn.xiaox.service.UserService#login(cn.xiaox.po.User)   
	 */
	@Override
	public UserCustom login(User user) {
		return userMapper.login(user);
	}


	/**   
	 * <p>Title: addUser</p>   
	 * <p>Description: </p>   
	 * @param user   
	 * @see cn.xiaox.service.UserService#addUser(cn.xiaox.po.User)   
	 */
	@Override
	public void addUser(User user) {
		userMapper.addUser(user);
	}

	/**   
	 * <p>Title: addBiao</p>   
	 * <p>Description: </p>   
	 * @param biao   
	 * @see cn.xiaox.service.UserService#addBiao(cn.xiaox.po.Biao)   
	 */
	@Override
	public void addBiao(Biao biao) {
		biaoMapper.addBiao(biao);
	}

	/**   
	 * <p>Title: addHui</p>   
	 * <p>Description: </p>   
	 * @param pin   
	 * @see cn.xiaox.service.UserService#addHui(cn.xiaox.po.Pin)   
	 */
	@Override
	public void addHui(Pin pin) {
		pinMapper.addHui(pin);
	}

	
	

	
}
