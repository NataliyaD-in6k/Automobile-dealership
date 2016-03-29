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
<div class="creation col-md-8 col-md-offset-1">
    <h2 class="col-md-9">Deal creation</h2>
    <form action="/models" method="post" class="form-inline">
        <div class="form-group">
            <label for="brand" class="form-control-label">Choose brand:</label>
            <select name="brand_id" id="brand" class="form-control">
                <c:forEach items="${brands}" var="brand">
                    <option value="${brand.id}">${brand.name}</option>
                </c:forEach>
            </select>
            <input type="submit" value="confirm" class="form-control btn btn-success">
        </div>
    </form>
    <form action="/price" method="post" class="form-inline">
        <div class="form-group">
            <label for="model" class="form-control-label">Choose model:</label>
            <select name="model_id" id="model" class="form-control">
                <c:forEach items="${models}" var="model">
                    <option value="${model.id}">${model.name}</option>
                </c:forEach>
            </select>
            <input type="submit" value="confirm" class="form-control btn btn-success">
        </div>
    </form>
    <%--<span class="price">Price: $ ${model.price}</span>--%>
    <form action="/register-deal" method="post" class="form-inline">
        <div class="form-group" style="padding: 0">
            <label class="price" class="form-control-label">Price: $ ${model.price}</label>
            <input class="form-control" type="hidden" name="user_id" value="${user.id}">
            <input class="form-control" type="hidden" name="model_id" value="${model.id}">
            <input type="submit" class="form-control btn btn-success" value="Register">
        </div>
    </form>
</div>
</body>
</html>
