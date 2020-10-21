<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Simple Tester</title>
    <link href="css/style.css" rel="stylesheet">
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="d-flex flex-column min-vh-100">
<div id="header">
    <jsp:include page="common/header.jsp"/>
</div>
    <main role="main" class="flex-shrink-0 container">
        <div class="container">
            <h1>Simple Tester</h1>
            <p class="lead">
                Simple Tester - сервис, позволяющий проводить простое тестирование.
            </p>

        </div>
    </main>
<footer class="footer mt-auto py-3 bg-light">
    <jsp:include page="common/footer.jsp"/>
</footer>
<script src="bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>