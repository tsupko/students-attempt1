<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%--
  Created by IntelliJ IDEA.
  User: Waylesange
  Date: 10.12.16
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<c:if test="${not empty list}">
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Student ID</th>
            <th>Name</th>
            <th>Age</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="student" items="${list}">
            <tr class='clickable-row' data-href='view_result/${student.id}'>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.age}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>
</body>
</html>
