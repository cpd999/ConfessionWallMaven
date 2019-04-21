package cn.xiaox.dao;

import cn.xiaox.po.Biao;
import cn.xiaox.po.BiaoCustom;
import java.util.List;

public interface BiaoMapper {
    //查询所有的表白
    List<BiaoCustom> findAllBiao();

	/**  
	 *<p> </p> 
	 * @Title: addBiao    
	 * @version:V0.1     
	 * @param biao    
	 * @return:void
	 */
	void addBiao(Biao biao);

}