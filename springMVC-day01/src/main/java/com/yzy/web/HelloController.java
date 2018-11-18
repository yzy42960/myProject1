package com.yzy.web;


import com.yzy.bean.Account;
import com.yzy.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    //基本参数类型
    @RequestMapping(value = "/hellotest"/*params = "name=ls"指定参数限制条件必须为name=ls*/)
    public String sayHello(String name,int age){
        System.out.println("hello,springMVC  name:"+name+"  age:"+age);
        return "success";
    }

    //实体类型--将参数封装到user对象中
    @RequestMapping(value = "/saveUser")
    public String saveUser(User user){
        System.out.println("saveUser....user="+user);
        return "success";
    }

    //实体类型--将参数封装到Account对象中，Account中包含user对象
    @RequestMapping(value = "/saveAccount")
    public String saveAccount(Account account){
        System.out.println("saveAccount....account="+account);
        return "success";
    }

    //实体类型--将参数封装到Account对象中，Account中包含user对象
    //包含list集合，map集合，集合中存放着user
    @RequestMapping(value = "/saveList")
    public String saveList(Account account){
        System.out.println("saveAccount....account="+account);
        return "success";
    }

    //实体类型--将参数封装到user对象中,包含日期
    @RequestMapping(value = "/saveUser2")
    public String saveUser2(User user){
        System.out.println("saveUser....user="+user);
        return "success";
    }

}
