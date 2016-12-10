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
<form style="border: 0px solid; padding: 0; margin: 0;" id="loginForm" action="${contextPath}/j_spring_security_check"
      method="post"  enctype="text/plain">
    <input id="action" type="hidden" name="action" value="j_spring_security_check">
    <table>
        <tr>
            <td>Login:</td>
            <td><input id="j_username" type="text" name="j_username" size="15"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input id="j_password" type="text" name="j_password" size="15"><br/></td>
        </tr>
        <tr>
            <td></td>
            <td><input id="submit" type="submit" value="Sign in"></td>
        </tr>
    </table>
</form>
</body>
</html>
