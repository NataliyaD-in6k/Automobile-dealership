<%--
  Created by IntelliJ IDEA.
  User: employee
  Date: 4/1/16
  Time: 9:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Automobile Dealership</title>
</head>
<body>
<%@ include file="header.jsp" %>
<%@ include file="navigation.jsp" %>
<div class="creation col-md-12 text-center">
        <h2>Deal creation</h2>
        <h3 class="step">Step 3</h3>
    <form action="/user-deals" method="post" class="form-inline creation-deal">
        <div class="form-group" style="padding: 0">
            <label class="price" class="form-control-label">Price: $ ${model.price}</label>
            <input class="form-control" type="hidden" name="user_id" value="${user.id}">
            <input class="form-control" type="hidden" name="model_id" value="${model.id}">
            <button type="submit" class="form-control btn btn-success">Register deal</button>
        </div>
    </form>
</div>
</body>
</html>
