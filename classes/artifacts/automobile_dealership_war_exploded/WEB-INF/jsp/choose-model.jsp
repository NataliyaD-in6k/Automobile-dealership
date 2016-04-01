<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: employee
  Date: 4/1/16
  Time: 9:14 AM
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
        <h2 class="col-md-12">Deal creation</h2>
        <h3 class="step">Step 2</h3>
    <form action="/price" method="post" class="form-inline creation-deal">
        <div class="form-group">
            <label for="model" class="form-control-label">Choose model:</label>
            <select name="model_id" id="model" class="form-control">
                <c:forEach items="${models}" var="model">
                    <option value="${model.id}">${model.name}</option>
                </c:forEach>
            </select>
            <input type="submit" value="next" class="form-control btn btn-success">
        </div>
    </form>
</div>
</body>
</html>
