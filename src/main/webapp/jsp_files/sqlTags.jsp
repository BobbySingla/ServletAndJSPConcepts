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
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
<head>
    <title>JSP Tags</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/?user=root/world" user="root" password="password"/>
<sql:query var="rs" dataSource="${db}">select * from sakila.film</sql:query>

<c:forEach items="${rs.rows}" var="film">
    ${film.title};<br>
</c:forEach>
</body>
</html>
