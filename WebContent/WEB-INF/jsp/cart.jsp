<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart</title>
</head>
<body>
<div align="right">
<form action="login.html">
<input type="submit" value="Log out">
</form>
<spring:form action="mainpage.html" method="get">
<input type="hidden" name="message" value="${param.username}">
<input type="submit" value="Main Page">
</spring:form></div>
<table border="2" align="center">
<tr style="background:aqua; text-align:center">
<td>Laptop Name</td>
<td>Price($)</td>
<td>Quantity</td>
<td>Total($)</td>
<td>Action</td>
</tr>
<c:set var="totalCost" value="${0}" />
<c:forEach items="${list}" var="list">
<c:set var="totalCost" value="${totalCost + list.total}" />
<tr>
<td>${list.laptopname}</td>
<td>${list.price}</td>
<td>${list.quantity}</td>
<td>${list.total}</td>
<td><spring:form action="/LaptopStore/deletecart.html" method="post">
<input type="hidden" name="id" value="${list.id}">
<input type="hidden" name="username" value="${list.username}">
<input type="submit" value="Delete" style="width:94px">
</spring:form></td>
</tr>
</c:forEach>
<tr>
<td colspan="3" align="center" style="background:aqua">Total Price</td>
<td><input type="text" value="${totalCost}" readonly></td>
<td>
<spring:form action="/LaptopStore/checkout.html" method="get">
<input type="hidden" name="totalcost" value="${totalCost}">
<input type="hidden" name="username" value="${param.username}">
<input type="submit" value="CHECK OUT" style="">
</spring:form></td>
</tr>
</table>
</body>
</html>