<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/7/16
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <h1>登录</h1>
    <form action="userLogin" method="post">
        username:<input type="text" name="username" placeholder="请输入用户名"/>
        password:<input type="password" name="password" placeholder="请输入密码"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
