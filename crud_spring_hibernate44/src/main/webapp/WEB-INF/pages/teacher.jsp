<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>teacher</h1>
	<c:forEach var="user" items="${listStudent}">
	</c:forEach>
	<table border="1">
		<tr>
			<td>UserId</td>
			<td>${user.userId}</td>
		</tr>
		<tr>
			<td>UserName</td>
			<td>${user.userName}</td>
		</tr>
		<tr>
			<td>userTelephone</td>
			<td>${user.userTelephone}</td>
		</tr>
		<tr>
			<td>userAddress</td>
			<td>${user.userAddress}</td>
		</tr>
		<tr>
			<td>userPass</td>
			<td>${user.userPass}</td>
		</tr>
		<tr>
			<td>Action</td>
			<td><a href="#"> ShowInfo</a> </td>
		</tr>
		
	</table>
</body>
</html>