package com.platform.pc.manager.service;



import com.platform.pc.manager.pojo.TbExpress;

import java.util.List;

/**
 * @author wulinhao
 */
public interface ExpressService {

    /**
     * 获取快递列表
     * @return
     */
    List<TbExpress> getExpressList();

    /**
     * 添加快递
     * @param tbExpress
     * @return
     */
    int addExpress(TbExpress tbExpress);

    /**
     * 更新快递
     * @param tbExpress
     * @return
     */
    int updateExpress(TbExpress tbExpress);

    /**
     * 删除快递
     * @param id
     * @return
     */
    int delExpress(int id);
}
