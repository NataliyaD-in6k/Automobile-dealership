<html>
<head>
    <title>Automobile Dealership</title>
</head>
<body>
<%@ include file="header.jsp" %>

<form action="/process-form" method="post" role="form" class="sign-in form-horizontal warning">
    <h1 class="text-center sign-in">Sign in</h1>
    <p class="col-sm-offset-5 error-email-message">Please, log in</p>
    <div class="form-group">
        <label for="mail" class="col-sm-5 control-label lead">Email</label>
        <div class="col-sm-2">
            <input type="text" name="email" id="mail" class="form-control" placeholder="Your email" autofocus>
        </div>
        <div class="col-sm-1">
            <input type="submit" value="Sign in" class="btn btn-success form-control">
        </div>
    </div>
</form>
</body>
</html>