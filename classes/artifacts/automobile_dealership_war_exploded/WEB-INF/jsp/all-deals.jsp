<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: employee
  Date: 4/1/16
  Time: 12:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Automobile Dealership</title>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="container">
    <h2 class="text-center">Deals</h2>
    <table class="table stripped-table table-striped text-center table-hover">
        <tr class="text-center">
            <th>First name</th>
            <th>Last name</th>
            <th>Brand</th>
            <th>Model</th>
            <th>Sum of deal, $</th>
        </tr>
        <c:forEach items="${deals}" var="deal">
            <tr>
                <td>${deal.user.firstName}</td>
                <td>${deal.user.lastName}</td>
                <td>${deal.model.brand.name}</td>
                <td>${deal.model.name}</td>
                <td class="text-right col-sm-2 deal-sum" style="padding-right: 50px;">${deal.model.price}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
