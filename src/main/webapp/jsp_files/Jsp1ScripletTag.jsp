<%--
  Created by IntelliJ IDEA.
  User: bobby.singla
  Date: 30-04-2020
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#00ffff">
<%

    int i = Integer.parseInt(request.getParameter("num1"));
    int j = Integer.parseInt(request.getParameter("num2"));
    int k = i + j;
    int l= i/j;
%>
Result Add is : <%= k %>
Result Div is : <%= l %>
</body>
</html>
