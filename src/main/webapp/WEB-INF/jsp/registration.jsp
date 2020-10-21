<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Create an account</title>

    <link href="<c:url value="/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="css/signin.css" rel="stylesheet">
</head>

<body class="text-center">

    <form:form method="POST" action="/registration" modelAttribute="user" class="form-signin">
        <h2 class="form-signin-heading">Create your account</h2>
        <spring:bind path="username">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text"
                            path="username"
                            class="form-control"
                            placeholder="Username"
                            autofocus="true"/>

                <form:errors path="username">

                </form:errors>
            </div>
        </spring:bind>

        <spring:bind path="password">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="password"
                            path="password"
                            class="form-control"
                            placeholder="Password"/>
                <form:errors path="password">
                </form:errors>
            </div>
        </spring:bind>

        <spring:bind path="passwordConfirm">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input
                        type="password"
                        path="passwordConfirm"
                        class="form-control"
                        placeholder="Confirm your password"/>

                <form:errors path="passwordConfirm">

                </form:errors>
            </div>
        </spring:bind>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
    </form:form>

<script src="<c:url value="/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>