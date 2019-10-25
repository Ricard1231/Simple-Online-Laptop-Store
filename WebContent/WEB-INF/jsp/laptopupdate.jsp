<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Laptop Update Page</title>
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
					<td><input name="id" type="text" value="${laptop.id}" disabled></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input name="name" type="text" value="${laptop.name}"></td>
				</tr>
				<tr>
					<td>Brand</td>
					<td><input name="brand" type="text" value="${laptop.brand}"></td>
				</tr>
				<tr>
					<td>OS</td>
					<td><input name="os" type="text" value="${laptop.os}"></td>
				</tr>
				<tr>
					<td>Processor</td>
					<td><input name="processor" type="text" value="${laptop.processor}"></td>
				</tr>
				<tr>
					<td>Graphics</td>
					<td><input name="graphics" type="text" value="${laptop.graphics}"></td>
				</tr>
				<tr>
					<td>RAM</td>
					<td><input name="ram" type="text" value="${laptop.ram}"></td>
				</tr>
				<tr>
					<td>Screen</td>
					<td><input name="screen" type="text" value="${laptop.screen}"></td>
				</tr>
				<tr>
					<td>Resolution</td>
					<td><input name="resolution" type="text" value="${laptop.resolution}"></td>
				</tr>
				<tr>
					<td>Storage</td>
					<td><input name="storage" type="text" value="${laptop.storage}"></td>
				</tr>
				<tr>
					<td>Image</td>
					<td><select name="image">
							<c:forEach items="${imagelist}" var="list">
								<option value="${list.path}">${list.name}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>Price($)</td>
					<td><input name="price" type="text" value="${laptop.price}"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="Submit" value="Update">
					</td>
				</tr>
			</table>
		</div>
	</spring:form>
</body>
</html>