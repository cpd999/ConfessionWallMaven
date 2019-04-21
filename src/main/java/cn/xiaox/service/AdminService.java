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

import cn.xiaox.po.AdminUser;
import cn.xiaox.po.AdminUserCustom;
import cn.xiaox.po.Biao;
import cn.xiaox.po.Pin;
import cn.xiaox.po.User;
import cn.xiaox.po.UserCustom;

/**  
 * <p>管理员逻辑控制</p> 
 * @ClassName:AdminService   
 * @author: XIAOX.周巍 
 * @date: 2019年4月20日 下午10:50:12   
 * @since: V0.1 
 * @version V0.1
 * @Copyright: 注意：本内容仅限于学习传阅，禁止外泄以及用于其他的商业目
 */
public interface AdminService {

	/**  
	 *<p>登录</p> 
	 * @Title: login    
	 * @version:V0.1     
	 * @param adminUser
	 * @return:AdminController
	 */
	AdminUserCustom login(AdminUser adminUser);

	/**  
	 *<p>查询所有用户</p> 
	 * @Title: findAllUser    
	 * @version:V0.1     
	 * @return:List<UserCustom>
	 */
	List<UserCustom> findAllUser();

	/**  
	 *<p>更新信息</p> 
	 * @Title: upUserInf    
	 * @version:V0.1     
	 * @param user    
	 * @return:void
	 */
	void upUserInf(User user);

	/**  
	 *<p>删除回复</p> 
	 * @Title: deletehui    
	 * @version:V0.1     
	 * @param pin    
	 * @return:void
	 */
	void deletehui(Pin pin);

	/**  
	 *<p>删除表白</p> 
	 * @Title: deletebiao    
	 * @version:V0.1     
	 * @param biaos    
	 * @return:void
	 */
	void deletebiao(Biao biaos);

}
