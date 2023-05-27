<%@ page import="com.Until.AccountInfo" %><%--
  Created by IntelliJ IDEA.
  User: asd
  Date: 2023/5/11
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
success.

<%
    AccountInfo accountInfo = (AccountInfo) session.getAttribute("accountInfo");
%>
账户名称：${sessionScope.accountInfo.accountName}
金额：${sessionScope.accountInfo.money}
日期：<%=accountInfo.getCreateDate()%>
User.姓名：<%=accountInfo.getUser().getUname()%>
User.年龄：<%=accountInfo.getUser().getAge()%>
Userlist.姓名：<%=accountInfo.getUserList().get(0).getUname()%>
UserList.年龄：<%=accountInfo.getUserList().get(0).getAge()%>
UserMap.姓名：<%=accountInfo.getUserMap().get("one").getUname()%>
UserMap.年龄:<%=accountInfo.getUserMap().get("one").getAge()%>



</body>
</html>
