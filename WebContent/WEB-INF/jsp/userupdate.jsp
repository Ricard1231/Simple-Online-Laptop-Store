<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Update Page</title>
</head>
<body>
<div align="right">
<form action="login.html">
<input type="submit" value="Log out">
</form>
</div>
<spring:form method="post">
<div align="center">
<table>
<tr>
<td>ID</td>
<td><input name="id" type="text" value="${user.id}" disabled></td>
</tr>
<tr>
<td>Username</td>
<td><input name="username" type="text" value="${user.username}"></td>
</tr>
<tr>
<td>Password</td>
<td><input name="password" type="text" value="${user.password}"></td>
</tr>
<tr>
<td>Card Number</td>
<td><input name="cardnum" type="text" value="${user.cardnum}"></td>
</tr>
<tr>
<td>Card Password</td>
<td><input name="cardpw" type="text" value="${user.cardpw}"></td>
</tr>
<tr>
<td colspan="2">
<input type="Submit" value="Update">
</td>
</tr>
</table>
</div>
</spring:form>
</body>
</html>