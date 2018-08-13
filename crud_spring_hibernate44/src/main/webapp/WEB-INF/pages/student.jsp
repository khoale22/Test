<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">INFOMATION</h1>
<!-- 	<table border="1"> -->
<!-- 		<tr> -->
<!-- 			<td>Name</td> -->
<%-- 			<td>${user.userName}</td> --%>
<!-- 		</tr> -->
<!-- 		<tr> -->
<!-- 			<td>Telephone</td> -->
<%-- 			<td>${user.userTelephone}</td> --%>
<!-- 		</tr> -->
<!-- 		<tr> -->
<!-- 			<td>Address</td> -->
<%-- 			<td>${user.userAddress}</td> --%>
<!-- 		</tr> -->
<!-- 		<tr> -->
<!-- 			<td>Pass</td> -->
<%-- 			<td>${user.userPass}</td> --%>
<!-- 		</tr> -->

<!-- 	</table> -->
<!-- 	<a href="abc">dfsfdhj</a> -->



	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>NAME</th>
					<th>TELEPHONE</th>
					<th>ADDRESS</th>
					<th>PASS</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${user.userName}</td>
					<td>${user.userTelephone}</td>
					<td>${user.userAddress}</td>
					<td>${user.userPass}</td>

				</tr>
			</tbody>

		</table>
	</div>
	<div align="center"><a href="abc">INFOMATION_RESULT</a></div>
	
</body>
</html>