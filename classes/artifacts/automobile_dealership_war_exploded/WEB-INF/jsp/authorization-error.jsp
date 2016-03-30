<%--
  Created by IntelliJ IDEA.
  User: employee
  Date: 3/30/16
  Time: 9:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Automobile Dealership</title>
</head>
<body>
<%@ include file="header.jsp" %>

<form action="/process-form" method="post" role="form" class="sign-in form-horizontal error">
    <h1 class="text-center">Sign in</h1>
    <p class="text-center">Entered e-mail is incorrect!</p>
    <div class="form-group">
        <label for="mail" class="col-sm-4 control-label lead">Email</label>
        <div class="col-sm-4">
            <input type="text" name="email" id="mail" class="form-control" placeholder="Your email" autofocus>
        </div>
        <div class="col-sm-1">
            <input type="submit" value="Sign in" class="btn btn-success form-control">
        </div>
    </div>
</form>
</body>
</html>
