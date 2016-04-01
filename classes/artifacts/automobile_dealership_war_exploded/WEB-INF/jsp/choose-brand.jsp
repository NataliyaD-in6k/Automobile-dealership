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
<%@ include file="navigation.jsp" %>
<body class="container">
<div class="creation col-md-12 text-center">
        <h2>Deal creation</h2>
        <h3 class="step">Step 1</h3>
    <form action="/models" method="post" class="form-inline creation-deal">
        <div class="form-group">
            <label for="brand" class="form-control-label">Choose make:</label>
            <select name="brand_id" id="brand" class="form-control">
                <c:forEach items="${brands}" var="brand">
                    <option value="${brand.id}">${brand.name}</option>
                </c:forEach>
            </select>
            <input type="submit" value="next" class="form-control btn btn-success">
        </div>
    </form>
</div>
</body>
</html>
