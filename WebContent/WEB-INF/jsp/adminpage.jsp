<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Main Page</title>
<style>
img{
	width:100px;
	height:70px
}
td{
	text-align:center;
}
</style>
</head>
<body>
<div align="right">
<form action="/LaptopStore/registerlaptop.html">
<input type="submit" value="Register Laptop">
</form>
<br />
<form action="/LaptopStore/login.html">
<input type="submit" value="Log out">
</form>
</div>
<h3 align="center">${message}</h3>
<table border="2">
<tr>
<td>User ID</td>
<td>Username</td>
<td>Password</td>
<td>Card Number</td>
<td>Card Password</td>
<td>Delete</td>
<td>Update</td>
</tr>
<c:forEach items="${listuser}" var="user">
<tr>
<td>${user.id}</td>
<td>${user.username}</td>
<td>${user.password}</td>
<td>${user.cardnum}</td>
<td>${user.cardpw}</td>
<td>
<spring:form action="deleteuser.html" method="get">
<input type="hidden" name="id" value="${user.id}">
<input type="submit" value="Delete">
</spring:form>
</td>
<td>
<spring:form action="updateuser.html" method="get">
<input type="hidden" name="id" value="${user.id}">
<input type="submit" value="Update">
</spring:form>
</td>
</tr>
</c:forEach>
</table>
<br />
<table border="2">
<tr>
<td>Image</td>
<td>Laptop ID</td>
<td>Name</td>
<td>Brand</td>
<td>OS</td>
<td>Processor</td>
<td>Graphics</td>
<td>RAM</td>
<td>Screen</td>
<td>Resolution</td>
<td>Storage</td>
<td>Price($)</td>
<td>Delete</td>
<td>Update</td>
</tr>
<c:forEach items="${listlaptop}" var="laptop">
<tr>
<td><img src="${laptop.image}"></td>
<td>${laptop.id}</td>
<td>${laptop.name}</td>
<td>${laptop.brand}</td>
<td>${laptop.os}</td>
<td>${laptop.processor}</td>
<td>${laptop.graphics}</td>
<td>${laptop.ram}</td>
<td>${laptop.screen}</td>
<td>${laptop.resolution}</td>
<td>${laptop.storage}</td>
<td>${laptop.price}</td>
<td>
<spring:form action="deletelaptop.html" method="get">
<input type="hidden" name="id" value="${laptop.id}">
<input type="submit" value="Delete">
</spring:form>
</td>
<td>
<spring:form action="updatelaptop.html" method="get">
<input type="hidden" name="id" value="${laptop.id}">
<input type="submit" value="Update">
</spring:form>
</td>
</tr>
</c:forEach>
</table>
<br />
<table border="2">
<tr>
<td>Order ID</td>
<td>Username</td>
<td>Total($)</td>
<td>Time</td>
<td>Delete</td>
</tr>
<c:forEach items="${listorder}" var="order">
<tr>
<td>${order.orderid}</td>
<td>${order.username}</td>
<td>${order.total}</td>
<td>${order.time}</td>
<td>
<spring:form action="deleteorder.html" method="get">
<input type="hidden" name="orderid" value="${order.orderid}">
<input type="submit" value="Delete">
</spring:form>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>