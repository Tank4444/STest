<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>All Test</title>
    <link href="css/style.css" rel="stylesheet">
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="d-flex flex-column min-vh-100">
<header>
    <nav class="navbar navbar-expand-md navbar-light bg-light mb-4">
        <a class="navbar-brand">Simple Tester</a>
        <div class="collapse navbar-collapse">
            <sec:authorize access="!isAuthenticated()">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item px-1">
                        <a class="btn btn-outline-primary" href="<c:url value="/login" />" role="button">Войти</a>
                    </li>
                    <li class="nav-item px-1">
                        <a class="btn btn-outline-primary" href="<c:url value="/registration" />" role="button">Регистрация</a>
                    </li>
                </ul>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
                <ul class="nav navbar-nav ml-auto row">
                    <li class="col">
                        <p class="nav-item">Ваш логин: <sec:authentication property="principal.username" /></p>
                    </li>
                    <li class="col">
                        <a class="nav-item btn btn-outline-primary" href="<c:url value="/logout" />" role="button">Выйти</a>
                    </li>
                </ul>
            </sec:authorize>
        </div>

    </nav>
</header>
<ul>
    <c:forEach items="${tests}" var="test">
        <li>
            <p>${test.id}</p>
            <a href="/test/${test.id}">
                <p>${test.name}</p>
            </a>
        </li>
    </c:forEach>
</ul>

<footer class="footer mt-auto py-3 bg-light">
    <div class="container text-center">
            <span class="text-center">
                    © Simple Tester - <%= Calendar.getInstance().get(Calendar.YEAR)%>
            </span>
    </div>
</footer>
<script src="bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>
