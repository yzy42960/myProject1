package com.yzy.test;

import com.yzy.bean.Items;
import com.yzy.dao.ItemsDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {

    @Test
    public void fun(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        Items items = itemsDao.findById(1);
        System.out.println(items);
    }
}
