<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Check Out</title>
</head>
<body>
<div align="right">
<form action="login.html">
<input type="submit" value="Log out">
</form>
<spring:form action="mainpage.html" method="get">
<input type="hidden" name="message" value="${param.username}">
<input type="submit" value="Main Page">
</spring:form>
</div>
<div align="center">
<h2>TOTAL</h2>
<spring:form action="checkout.html" method="post">
<table>
<tr>
<td colspan="2" align="center">
$<input type="text" name="totalcost" value="${param.totalcost}" readonly>
</td>
<tr>
<td>Card Number</td>
<td><input type="text" name="cardnum"></td>
</tr>
<tr>
<td>Card Password</td>
<td><input type="password" name="cardpw"></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="Pay">
</td>
</tr>
</table>
</spring:form>
</div>
</body>
</html>