<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="header.jsp" %>
<%@ include file="navigation.jsp" %>
<div class="container">
    <div class="profile col-sm-offset-4">
        ${username}

        <%--<c:set var="admin" scope="session" value="${user.admin}"/>--%>
        <%--<c:if test="${!admin}">--%>
        <%--<h2>Profile:</h2>--%>
        <%--<div>First name: ${user.firstName}</div>--%>
        <%--<div>Last name: ${user.lastName}</div>--%>
        <%--</c:if>--%>
        <%--<c:if test="${admin}">--%>
        <%--<c:redirect url="/all-deals"/>--%>
        <%--</c:if>--%>
        <div>
            <a href="choose-brand" class="btn btn-lg btn-success" style="width: 140px;">Create deal</a>
        </div>
    </div>
</div>
<%@ include file="footer.jsp" %>