<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Page</title>
<style>
body{
background:aqua}
table{
padding:15px;
background: white}
img {
	width:500px;
	height:350px
}
td {
	text-align:center
}
</style>
</head>
<body>
<div align="right">
<form action="login.html">
<input type="submit" value="Log out">
</form>
<spring:form action="/LaptopStore/cart.html" method="get">
<input type="hidden" name="username" value="${param.message}">
<input type="submit" value="Cart">
</spring:form></div>
<div class="content">
<table align="center">
<tr>
<td>Image</td>
<td>Laptop Name</td>
<td>Laptop Price($)</td>
</tr>
<c:forEach items="${laptops}" var="laptop">
<tr>
<td><img src="${laptop.image}" /></td>
<td>${laptop.name}</td>
<td>${laptop.price}</td>
<td>
<spring:form action="/LaptopStore/laptopinfo.html" method="get">
<input type="hidden" name="id" value="${laptop.id}">
<input type="hidden" name="username" value="${param.message}">
<input type="submit" value="See Laptop Info">
</spring:form>
</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>