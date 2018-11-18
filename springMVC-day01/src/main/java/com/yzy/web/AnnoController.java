package com.yzy.web;

import com.yzy.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

@Controller
//将数据存入session中
@SessionAttributes(value = {"username","password"},types = {Integer.class})
@RequestMapping(value = "/anno")
public class AnnoController {

    /**
     * @param name
     * @param age
     * @return
     * @RequestParam:作用： 配置当参数名不一致时，手动添加映射
     * required：请求参数中是否必须提供此参数。
     * 默认值：true。表示必须提供，如果不提供将报错。
     * defaultValue：表示默认值，如果不传递值，则用该默认值替代
     */
    @RequestMapping(value = "/demo01")
    public String testRequestParam(@RequestParam(value = "username"/*,defaultValue = "hh"*/) String name, int age) {
        System.out.println("hello,springMVC  name:" + name + "  age:" + age);
        return "success";
    }

    /**
     * 注解@RequestBody用于获取请求体内容。
     * 参数required：是否必须有请求体。默认值是:true。
     * get请求会报错
     * 设置为false，get请求为空
     *
     * @param body
     * @return
     */
    @RequestMapping(value = "/demo02")
    public String testRequestBody(@RequestBody(required = false) String body) {
        System.out.println("hello,springMVC  body:" + body);
        return "success";
    }

    @RequestMapping(value = "/demo03/{uid}")
    public String testPathVariable(@PathVariable(value = "uid") int id) {
        System.out.println("hello,springMVC  id:" + id);
        return "success";
    }


    /**
     * POST请求对应save新增
     * @param user
     * @return
     */
    @RequestMapping(path = "/demo04",method = RequestMethod.POST)
    public String save(User user){
        System.out.println("Hello SpringMVC!!，测试@PathVariable，新增-请求方式Post");
        System.out.println(user);
        return "success";// 响应结果
    }

    /**
     * PUT请求方式对应更新
     * @param user
     * @return
     */
    @RequestMapping(path = "/demo05",method = RequestMethod.PUT)
    public String update(User user){
        System.out.println("Hello SpringMVC!!，测试@PathVariable，更新-请求方式Put");
        System.out.println(user);
        return "success";// 响应结果
    }

    /**
     * DELETE请求方式对应删除
     * @param id
     * @return
     */
    @RequestMapping(path = "/demo06/{uid}",method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "uid") Integer id){
        System.out.println("Hello SpringMVC!!，测试@PathVariable，删除-请求方式Delete");
        System.out.println(id);
        return "success";// 响应结果
    }

    /**
     * GET请求方式对应查询
     * @param id
     * @return
     */
    @RequestMapping(path = "/demo07/{uid}",method = RequestMethod.GET)
    public String findById(@PathVariable(value = "uid") Integer id){
        System.out.println("Hello SpringMVC!!，测试@PathVariable，查询一个-请求方式Get");
        System.out.println(id);
        return "success";// 响应结果
    }

    /**
     * 注解@RequestHeader：获取指定请求头信息
     * @param header
     * @return
     */
    @RequestMapping(path = "/demo08")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header){
        System.out.println("Hello SpringMVC!!，测试@RequestHeader");
        System.out.println(header);
        return "success";// 响应结果
    }

    @RequestMapping(path = "/demo09")
    public String testCookieValue(@CookieValue(value = "Idea-1c2d522") String cookie){
        System.out.println("Hello SpringMVC!!，测试@CookieValue");
        System.out.println(cookie);
        return "success";// 响应结果
    }

    /**
     * 注解@ModelAttribute：它可以用于修饰方法和参数。
     * 出现在方法上，表示当前方法会在控制器的方法执行之前，
     * 先执行。它可以修饰没有返回值的方法，也可以修饰有具体返回值的方法。
     * 出现在参数上，获取指定的数据给参数赋值。
     * @param
     */
    /*@ModelAttribute
    public void fun(User user){
        System.out.println("执行了fun方法"+user);
        user.setDate(new Date());
    }*/

    /**
     * 作为返回值传递，提前将要修改的数据先修改好，
     * 最后请求参数在做替换
     * @param name
     * @return
     */
   /* @ModelAttribute // 在执行的方法之前运行
    public User fun(String name) {
        //模拟去数据库查询
        User user = findUserByName(name);
        System.out.println("执行了showModel方法"+user);
        return user;
    }*/

    /**
     * 作参数时，用map来将传递修改后的user传递过去
     * @param name
     * @param maps
     */
   /* @ModelAttribute // 在执行的方法之前运行
    public void showModel(String name, Map<String,User> maps) {
        //模拟去数据库查询
        User user = findUserByName(name);
        maps.put("abc",user);
        System.out.println("执行了showModel方法"+user);
    }*/

    /**
     * 模拟修改用户方法
     * @param user
     * @return
     */
    @RequestMapping("/demo10")
    public String testModelAttribute(@ModelAttribute(value = "abc") User user) {
        System.out.println("控制器中处理请求的方法：修改用户："+user);
        return "success";
    }

    /** * 模拟去数据库查询 * @param username * @return */
    private User findUserByName(String name) {
        User user = new User();
        user.setName(name);
        user.setAge(19);
        user.setDate(new Date());
        return user;
    }


    /**
     * * 把数据存入SessionAttribute
     * * @param model
     * * @return
     * * Model是spring提供的一个接口，该接口有一个实现类ExtendedModelMap *
     * 该类继承了ModelMap，而ModelMap就是LinkedHashMap子类 */
    @RequestMapping("/demo11")
    public String testPut(Model model){
        System.out.println("把数据存入SessionAttribute");
        model.addAttribute("username", "泰斯特");
        model.addAttribute("password","123456");
        model.addAttribute("age",18);
        //跳转之前将数据保存到username、password和age中，因为注解@SessionAttribute中有这几个参数
        return "success";
    }
    /**
     * * 获取SessionAttribute
     */
    @RequestMapping("/demo12")
    public String testGet(ModelMap model){
        System.out.println("获取SessionAttribute");
        System.out.println(model.get("username")+";"+model.get("password")+";"+model.get("age"));
        return "success";
    }
    /**
     * * 清空SessionAttribute
     */
    @RequestMapping("/demo13")
    public String complete(SessionStatus sessionStatus){
        System.out.println("清空SessionAttribute");
        //清除session
        sessionStatus.setComplete();
        return "success";
    }


}
