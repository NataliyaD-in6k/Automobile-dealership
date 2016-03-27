<%--
  Created by IntelliJ IDEA.
  User: employee
  Date: 3/25/16
  Time: 2:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Automobile Dealership</title>
</head>
<body>
<%@ include file="header.jsp" %>
<form action="/process-form" method="post">
    <input type="text" name="email">
    <input type="submit" value="Enter">
</form>
</body>
</html>
