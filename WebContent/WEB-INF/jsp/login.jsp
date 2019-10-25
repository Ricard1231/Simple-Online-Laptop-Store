<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1 align="center">Welcome to Online Laptop Store</h1>
<h2 align="center">Login</h2>
<div align="center">
<spring:form name="loginform" method="post">
<table>
<tr>
<td>Username</td>
<td><input name="username" type="text"></td>
</tr>
<tr>
<td>Password</td>
<td><input name="password" type="password"></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="Login">
</td>
</tr>
</table>
<div style="color:red">${message}</div>
</spring:form>
<a href="register.html">Click here to register</a>
</div>
</body>
</html>