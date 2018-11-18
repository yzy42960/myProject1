package com.yzy.service.impl;

import com.yzy.bean.Items;
import com.yzy.dao.ItemsDao;
import com.yzy.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "itemsService")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(int id) {
        return itemsDao.findById(id);
    }
}
