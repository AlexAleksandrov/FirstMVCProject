<%--<%@ page import="dto.User" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: AALEKSANDROV
  Date: 08.07.14
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<h1>Login Successful Welcome!</h1>

<%--<% User user = (User)request.getAttribute("user");%>--%>
<jsp:useBean id="user" class="dto.User" scope="request">
<jsp:setProperty name="user" property="userName" value="Default" />
</jsp:useBean>

<%--<b>Hello <%=user.getUserName()%> </b>--%>
Hello <jsp:getProperty  property="userName" name="user"/>
</body>
</html>
