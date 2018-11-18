package com.yzy.service;

import com.yzy.bean.Items;

public interface ItemsService {

    /**
     * 通过id查询用户
     * @param id
     * @return
     */
    Items findById(int id);
}
