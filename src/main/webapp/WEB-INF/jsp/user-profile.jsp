<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Automobile Dealership</title>
</head>
<body class="container">
<%@ include file="header.jsp" %>
<div class="profile col-sm-offset-3">
    <h2 class="">Information about profile:</h2>
    <div class="">First name: ${user.firstName}</div>
    <div class="">Last name: ${user.lastName}</div>

<form action="create-deal">
    <input type="submit" class="create-deal-button col-sm-2 btn btn-success" value="Create deal">
</form>
</div>
</body>
</html>
