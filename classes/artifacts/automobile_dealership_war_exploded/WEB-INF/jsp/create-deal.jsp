<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: employee
  Date: 3/25/16
  Time: 5:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AutoDealer</title>
</head>
<%@ include file="header.jsp" %>
<body class="container">
<h2>Deal creation</h2>
<form action="/models" method="post">
    <label for="brand">Choose brand:</label>
    <select name="brand_id" id="brand">
        <c:forEach items="${brands}" var="brand">
            <option value="${brand.id}">${brand.name}</option>
        </c:forEach>
    </select>
    <input type="submit" value="confirm">
</form>
<form action="/price", method="post">
<label for="model">Choose model:</label>
<select name="model_id" id="model">
    <c:forEach items="${models}" var="model">
        <option value="${model.id}">${model.name}</option>
    </c:forEach>
</select>
    <input type="submit" value="confirm">
</form>
<span class="price">Price:  $ ${model.price}</span>

<input type="hidden" value="${user}">
</body>
</html>
