<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">HELLO ADMIN</h1>
	<div class="container">	
	<input class="form-control" id="myInput" type="text" placeholder="Search..">
		<table class="table table-striped">	
			<thead>
				<tr>
					<th>USERID</th>
					<th>NAME</th>
					<th>TELEPHONE</th>
					<th>ADDRESS</th>
					<th>PASS</th>
					<th>ACTION</th>
					<th>ACTION</th>

				</tr>
			</thead>
			<c:forEach var="user" items="${listStudent}">
			<tbody id="myTable">
				<tr>
					<td>${user.userId}</td>
					<td>${user.userName}</td>
					<td>${user.userTelephone}</td>
					<td>${user.userAddress}</td>
					<td>${user.userPass}</td>
					<td><a href="showInfo?userId=${user.userId}"> showInfo</a></td>
					<td><a href="deleteStudent?userId=${user.userId}"> delete</a></td>
				</tr>
			</tbody>
			</c:forEach>
		</table>
	</div>
<script>
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>
</body>
</html>