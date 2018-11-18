<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/14
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>@RequestBody</h3>
post请求jsp代码： <br>
<!-- request body注解 -->
<form action="anno/demo02" method="post">
    用户名称：<input type="text" name="name" ><br/>
    用户年龄：<input type="text" name="age" ><br/>
    <input type="submit" value="保存">
</form>
get请求jsp代码： <br>
<a href="anno/demo02?body=test">requestBody注解get请求</a>

<h3>@PathVariable注解</h3>
<!-- PathVariable注解 -->
<a href="anno/demo03/100">pathVariable注解</a>


<!-- 保存 -->
<form action="anno/demo04" method="post">
    用户名称：<input type="text" name="name"><br/>
    <!-- <input type="hidden" name="_method" value="POST"> -->
    <input type="submit" value="保存"></form>
<hr/>
<!-- 更新 -->
<form action="anno/demo05" method="post">
    用户名称：<input type="text" name="name"><br/>
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="更新">
</form>
<hr/>
<!-- 删除 -->
<form action="anno/demo06/1" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="删除">
</form>
<hr/>
<!-- 查询一个 -->
<form action="anno/demo07/1" method="post">
    <input type="hidden" name="_method" value="GET">
    <input type="submit" value="查询">
</form>
<hr/>


<h3>测试@RequestHeader注解</h3>
<!-- RequestHeader注解 -->
<a href="anno/demo08">获取请求消息头</a>


<h3>测试@CookieValue注解</h3>
<!-- CookieValue注解 -->
<a href="anno/demo09">CookieValue注解</a>


<h3>测试@ModelAttribute注解</h3>
需求： 修改用户信息，要求用户的日期不能修改 jsp的代码：
<!-- 修改用户信息 -->
<form action="anno/demo10" method="post">
    用户名称：<input type="text" name="name" ><br/>
    用户年龄：<input type="text" name="age" ><br/>
    <input type="submit" value="保存">
</form>



<h3>测试@SessionAttribute注解</h3>
<!-- SessionAttribute注解的使用 -->
<a href="anno/demo11">存入SessionAttribute</a> <hr/>
<a href="anno/demo12">取出SessionAttribute</a> <hr/>
<a href="anno/demo13">清除SessionAttribute</a>

</body>
</html>
