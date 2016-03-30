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
<%@ include file="navigation.jsp" %>

<body class="container">
<div class="col-xs-8">
    <h2 class="text-center">Deals</h2>
    <table class="table stripped-table text-center">
        <tr class="text-center">
            <th>User name</th>
            <th>Sum of deal, $</th>
            <th>Brand model</th>
        </tr>
        <c:forEach items="${deals}" var="deal">
            <tr>
                <td>${deal.user.firstName} ${deal.user.lastName}</td>
                <td>${deal.model.price}</td>
                <td>${deal.model.brand.name} ${deal.model.name}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
