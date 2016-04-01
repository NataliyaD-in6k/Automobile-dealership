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
    <h1 class="text-center sign-in">Sign in</h1>
    <p class="col-sm-offset-5 error-email-message">Please, enter correct e-mail:</p>
    <div class="form-group">
        <label for="mail" class="col-sm-5 control-label lead">Email</label>
        <div class="col-sm-2">
            <input type="email" name="email" id="mail" class="form-control" placeholder="Your email" autofocus required>
        </div>
        <div class="col-sm-1">
            <input type="submit" value="Sign in" class="btn btn-success form-control">
        </div>
    </div>
</form>
</body>
</html>
