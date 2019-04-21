package cn.xiaox.dao;

import java.util.List;

import cn.xiaox.po.User;
import cn.xiaox.po.UserCustom;

public interface UserMapper {
	public UserCustom login(User user);

	/**  
	 *<p> </p> 
	 * @Title: findUserKey    
	 * @version:V0.1     
	 * @param user
	 * @return    
	 * @return:User
	 */
	public User findUserKey(User user);

	/**  
	 *<p> </p> 
	 * @Title: addUser    
	 * @version:V0.1     
	 * @param user    
	 * @return:void
	 */
	public void addUser(User user);

	/**  
	 *<p> </p> 
	 * @Title: findAllUser    
	 * @version:V0.1     
	 * @return    
	 * @return:List<UserCustom>
	 */
	public List<UserCustom> findAllUser();

	/**  
	 *<p> </p> 
	 * @Title: upUserInf    
	 * @version:V0.1     
	 * @param user    
	 * @return:void
	 */
	public void upUserInf(User user);

	/**  
	 *<p> </p> 
	 * @Title: addBiao    
	 * @version:V0.1     
	 * @param biao    
	 * @return:void
	 */
	
}