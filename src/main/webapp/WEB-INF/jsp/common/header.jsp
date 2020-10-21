<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
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