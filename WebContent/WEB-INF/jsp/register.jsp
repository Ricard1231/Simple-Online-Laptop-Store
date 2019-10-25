<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<h1 align="center">Welcome to Online Laptop Store</h1>
<h2 align="center">Register</h2>
<div align="center">
<spring:form name="registerform" method="post">
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
<td>Confirm Password</td>
<td><input name="cpw" type="password"></td>
</tr>
<tr>
<td>Card Number</td>
<td><input name="cardnum" type="text"></td>
</tr>
<tr>
<td>Card Password</td>
<td><input name="cardpw" type="password"></td>
</tr>
<tr>
<td>Confirm Card Password</td>
<td><input name="confirmcardpw" type="password"></td>
</tr>
<tr>
<td colspan="2">
<input type="Submit" value="Register">
</td>
</tr>
</table>
<div style="color:red">${message}</div>
</spring:form>
<a href="login.html">Click here to login</a>
</div>
</body>
</html>