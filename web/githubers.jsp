<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <jsp:include page="head.jsp" />
</head>
<body>
    <jsp:include page="header.jsp" />

    <table class="table">
        <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col">Login</th>
            <th scope="col">Avatar</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${requestScope.githubers}" var="githuber">
            <tr>
                <td>${githuber.name}</td>
                <td>${githuber.email}</td>
                <td><a href="https://github.com/${githuber.login}" target="_blank">${githuber.login}</a></td>
                <td><img width="60" src="${githuber.avatarUrl}" alt="${githuber.id}" /></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <jsp:include page="footer.jsp" />
</body>