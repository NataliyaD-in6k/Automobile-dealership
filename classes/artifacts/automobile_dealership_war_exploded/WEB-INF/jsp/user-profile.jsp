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
    <h2>Profile:</h2>
    <div>First name: ${user.firstName}</div>
    <div>Last name: ${user.lastName}</div>

<form action="create-deal" method="post">
    <input type="submit" class="create-deal-button col-sm-2 btn btn-success" value="Create deal">
</form>
</div>
</body>
</html>
