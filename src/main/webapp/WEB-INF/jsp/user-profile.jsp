<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Automobile Dealership</title>
</head>
<body class="container">
<%@ include file="header.jsp" %>
<%@ include file="navigation.jsp" %>
<div class="profile col-sm-offset-4">

    <c:set var="admin" scope="session" value="${user.admin}"/>
    <c:if test="${!admin}">
        <h2>Profile:</h2>
        <div>First name: ${user.firstName}</div>
        <div>Last name: ${user.lastName}</div>
    </c:if>
    <c:if test="${admin}">
        <c:redirect url="/all-deals"/>
    </c:if>
    <a href="static/deal-registration.html"><button class="create-deal-button col-sm-3 btn btn-success">Register deal</button></a>
</div>
</body>
</html>
