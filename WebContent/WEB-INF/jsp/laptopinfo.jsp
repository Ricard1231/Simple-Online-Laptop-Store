<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Laptop Info</title>
<style>
img{
	width:500px;
	height:350px
}
td{
	text-align:center
}
</style>
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
<table align="center">
<tr>
<td colspan="2"><img src="${laptop.image}" /></td>
<tr>
<td>Name</td>
<td>${laptop.name}</td>
</tr>
<tr>
<td>Brand</td>
<td>${laptop.brand}</td>
</tr>
<tr>
<td>OS</td>
<td>${laptop.os}</td>
</tr>
<tr>
<td>Processor</td>
<td>${laptop.processor}</td>
</tr>
<tr>
<td>Graphics</td>
<td>${laptop.graphics}</td>
</tr>
<tr>
<td>RAM</td>
<td>${laptop.ram}</td>
</tr>
<tr>
<td>Screen</td>
<td>${laptop.screen}</td>
</tr>
<tr>
<td>Resolution</td>
<td>${laptop.resolution}</td>
</tr>
<tr>
<td>Storage</td>
<td>${laptop.storage}</td>
</tr>
<tr>
<td>Price($)</td>
<td>${laptop.price}</td>
</tr>
<tr>
<td>Quantity</td>
<td><spring:form action="/LaptopStore/addtocart.html" method="post">
<input type="hidden" name="username" value="${param.username}">
<input type="hidden" name="laptopname" value="${laptop.name}" >
<input type="hidden" name="price" value="${laptop.price}">
<input type="text" name="quantity" value="1" style="text-align:center">
<input type="submit" value="Add To Cart" >
</spring:form></td>
</tr>
</table>
<div align="center">
</div>
</body>
</html>