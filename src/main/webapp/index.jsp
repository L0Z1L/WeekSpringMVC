<%--
  Created by IntelliJ IDEA.
  User: asd
  Date: 2023/5/11
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jsp - Hello World</title>
</head>
<body>
<h1>入门程序</h1>
<br/>
<form action="/SpringLab11/test1" method="get">
    账户名称:<input name="accountName"/><br/>
    金额:<input name="money"/><br/>
    日期:<input name="createDate"><br/>
    用户姓名:<input name="user.uname"><br/>
    用户年龄:<input name="user.age"><br/>

    用户姓名:<input name="userList[0].uname"><br/>
    用户年龄:<input name="userList[0].age"><br/>

    用户姓名:<input name="userMap['one'].uname"><br/>
    用户年龄:<input name="userMap['one'].age"><br/>

    <input type="submit" value="确定">
</form>
<a href="hello/springMVC">入门程序</a>
</body>
</html>
