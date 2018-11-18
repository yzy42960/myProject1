package com.yzy.dao;

import com.yzy.bean.Items;

public interface ItemsDao {

    /**
     * 通过id查询用户
     * @param id
     * @return
     */
    Items findById(int id);
}
