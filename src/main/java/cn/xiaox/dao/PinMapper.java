package cn.xiaox.dao;

import java.util.List;

import cn.xiaox.po.Pin;
import cn.xiaox.po.PinCustom;

public interface PinMapper {

    
    //查询所有的评论
    List<PinCustom> findAllPin();

	/**  
	 *<p> </p> 
	 * @Title: addHui    
	 * @version:V0.1     
	 * @param pin    
	 * @return:void
	 */
	void addHui(Pin pin);
 
}