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
		<h1>INFOMATION</h1>
		<table border="1" >
			<tr>
				<td>Name</td>
				<td>${user.userName}</td> 
			</tr>
			<tr>
				<td>Telephone</td>
				<td>${user.userTelephone}</td>
			</tr>
			<tr>
				<td>Adress</td>
				<td>${user.userAddress}</td>
			</tr>
			<tr>
				<td>Pass</td>
				<td>${user.userPass}</td>
			</tr>
			</tr>
			<tr>
				<td>Pass</td>
				<td>${user.role.roleName}</td>
			</tr>
		</table>
		
		
		<a href="abc">dfsfdhj</a>
</body>
</html>