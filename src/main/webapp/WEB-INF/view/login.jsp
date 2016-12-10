<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%--
  Created by IntelliJ IDEA.
  User: Waylesange
  Date: 10.12.16
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form method="post">
    <table>
        <tr>
            <td><input type="text" name="username" placeholder="Username"></td>
        </tr>
        <tr>
            <td><input type="password" name="password" placeholder="Password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Login"></td>
        </tr>
    </table>
</form>
</body>
</html>
