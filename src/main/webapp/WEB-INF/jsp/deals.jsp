<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: employee
  Date: 3/29/16
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ include file="header.jsp" %>
<head>
    <title>Automobile Dealership</title>
</head>
<body class="container">
<div class="container">
    <h2 class="text-center">Deals</h2>
    <%--<a href="/choose-brand">New deal</a>--%>
    <table class="table stripped-table table-striped text-center table-hover">
        <tr class="text-center">
            <th>Brand</th>
            <th>Model</th>
            <th>Sum of deal, $</th>
        </tr>
        <c:forEach items="${deals}" var="deal">
            <tr>
                <td>${deal.model.brand.name}</td>
                <td>${deal.model.name}</td>
                <td style="padding-right: 50px">${deal.model.price}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
