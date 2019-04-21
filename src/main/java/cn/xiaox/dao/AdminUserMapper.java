package cn.xiaox.dao;

import java.util.List;

import cn.xiaox.po.AdminUser;
import cn.xiaox.po.AdminUserCustom;
import cn.xiaox.po.Biao;
import cn.xiaox.po.Pin;

public interface AdminUserMapper {
	List<AdminUserCustom> findAllAdmindUser();

	/**  
	 *<p>登录</p> 
	 * @Title: login    
	 * @version:V0.1     
	 * @param adminUser
	 * @return    
	 * @return:AdminController
	 */
	AdminUserCustom login(AdminUser adminUser);

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