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

import cn.xiaox.dao.AdminUserMapper;
import cn.xiaox.dao.UserMapper;
import cn.xiaox.po.AdminUser;
import cn.xiaox.po.AdminUserCustom;
import cn.xiaox.po.Biao;
import cn.xiaox.po.Pin;
import cn.xiaox.po.User;
import cn.xiaox.po.UserCustom;
import cn.xiaox.service.AdminService;

/**  
 * <p>管理员业务逻辑</p> 
 * @ClassName:AdminServiceImpl   
 * @author: XIAOX.周巍 
 * @date: 2019年4月20日 下午10:50:31   
 * @since: V0.1 
 * @version V0.1
 * @Copyright: 注意：本内容仅限于学习传阅，禁止外泄以及用于其他的商业目
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminUserMapper adminUserMapper;
	@Autowired
	private UserMapper userMapper;
	
	/**   
	 * <p>Title: login</p>   
	 * <p>Description: </p>   
	 * @param adminUser
	 * @return   
	 * @see cn.xiaox.service.AdminService#login(cn.xiaox.po.AdminUser)   
	 */
	@Override
	public AdminUserCustom login(AdminUser adminUser) {
		return adminUserMapper.login(adminUser);
	}
	
	/**   
	 * <p>Title: findAllUser</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see cn.xiaox.service.AdminService#findAllUser()   
	 */
	@Override
	public List<UserCustom> findAllUser() {
		return userMapper.findAllUser();
	}
	
	/**   
	 * <p>Title: upUserInf</p>   
	 * <p>Description: </p>   
	 * @param user   
	 * @see cn.xiaox.service.AdminService#upUserInf(cn.xiaox.po.User)   
	 */
	@Override
	public void upUserInf(User user) {
		userMapper.upUserInf(user);
	}
	
	/**   
	 * <p>Title: deletehui</p>   
	 * <p>Description: </p>   
	 * @param pin   
	 * @see cn.xiaox.service.AdminService#deletehui(cn.xiaox.po.Pin)   
	 */
	@Override
	public void deletehui(Pin pin) {
		adminUserMapper.deletehui(pin);
	}
	
	/**   
	 * <p>Title: deletebiao</p>   
	 * <p>Description: </p>   
	 * @param biaos   
	 * @see cn.xiaox.service.AdminService#deletebiao(cn.xiaox.po.Biao)   
	 */
	
	@Override
	public void deletebiao(Biao biaos) {
		adminUserMapper.deletebiao(biaos);
	}
	
}
