<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Waylesange
  Date: 10.12.16
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
<form:form modelAttribute="add" method="post">
    <spring:bind path="name">
        <form:input path="name"/>
    </spring:bind>
    <spring:bind path="age">
        <form:input path="age"/>
    </spring:bind>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
