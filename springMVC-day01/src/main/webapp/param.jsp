<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/14
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>存储用户</h3>
<form action="hello/saveUser" method="post">
    用户姓名：<input type="text" name="name"/><br>
    用户年龄：<input type="text" name="age"/><br>
    <input type="submit" value="提交"/>
</form>

<h3>存储账户</h3>
<form action="hello/saveAccount" method="post">
    账号：<input type="text" name="username"/><br>
    密码：<input type="text" name="password"/><br>
    金额：<input type="text" name="money"/><br>
    用户姓名：<input type="text" name="user.name"/><br>
    用户年龄：<input type="text" name="user.age"/><br>
    <input type="submit" value="提交"/>
</form>

<h3>存储集合</h3>
<form action="hello/saveList" method="post">
    用户姓名（list)：<input type="text" name="list[0].name"/><br>
    用户年龄（list)：<input type="text" name="list[0].age"/><br>
    用户姓名（list)：<input type="text" name="list[1].name"/><br>
    用户年龄（list)：<input type="text" name="list[1].age"/><br>

    <h5>map集合</h5>
    用户姓名（map)：<input type="text" name="map['one'].name"/><br>
    用户年龄（map)：<input type="text" name="map['one'].age"/><br>
    用户姓名（map)：<input type="text" name="map['two'].name"/><br>
    用户年龄（map)：<input type="text" name="map['two'].age"/><br>
    <input type="submit" value="提交"/>
</form>

<h3>存储用户包含时间</h3>
<form action="hello/saveUser2" method="post">
    姓名：<input type="text" name="name"/><br>
    年龄：<input type="text" name="age"/><br>
    生日：<input type="text" name="date"/><br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
