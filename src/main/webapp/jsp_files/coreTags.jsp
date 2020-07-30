<%@ page import="java.io.PrintWriter" %>
<%--
  Created by IntelliJ IDEA.
  User: bobby.singla
  Date: 01-05-2020
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSP Tags</title>
</head>
<body>
<%
    PrintWriter writer = response.getWriter();
    writer.println(request.getAttribute("label"));
%>

${requestScope.label}<br>
${requestScope.student}<br>
<c:forEach items="${requestScope.student}" var="s">
    ${s.name};<br>
</c:forEach>
</body>
</html>
