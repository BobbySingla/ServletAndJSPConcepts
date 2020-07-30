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
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>JSP Tags</title>
</head>
<body>
<c:set var="str" value="My name is Abhi Singh"/>
Length is   : ${fn:length(str)}                     <br>
Index Of    : ${fn:indexOf(str, "is")}              <br>
<c:if test="${fn:contains(str, 'Abhi')}">
    Abhi is there in String
</c:if>                                             <br>

String in Upper case : ${fn:toUpperCase(str)}       <br>
</body>
</html>
