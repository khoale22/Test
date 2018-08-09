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

	<table border="1">
		<c:forEach var="user" items="${listStudent}">
			<tr>
				<td>${user.userId}</td>
				<td>${user.userName}</td>
				<td>${user.userTelephone}</td>
				<td>${user.userAddress}</td>
				<td>${user.userPass}</td>
				<td><a href="showInfo?userId=${user.userId}"> showInfo</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>