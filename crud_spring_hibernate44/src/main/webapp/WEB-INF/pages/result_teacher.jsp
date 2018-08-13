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
		<table class="table table-striped">
			<thead>
				<tr>
					<th>USERID</th>
					<th>SUBJECT_NAME</th>
					<th>RESULT</th>
					<th>ACTION</th>

				</tr>
			</thead>
			<c:forEach var="result" items="${listresult}">
				<tbody>
					<tr>
						<td>${result.user.userId}</td>
						<td>${result.subject.subjectName}</td>
						<td>${result.result}</td>
						<td><a
							href="editResult?subjectName=${result.subject.subjectName}&userId=${result.user.userId}">edit</a>
						</td>

					</tr>
				</tbody>
			</c:forEach>
		</table>
		<form action="logout" method="get"> <button type="submit" class="btn btn-dark btn-lg">Logout</button> </form> 
	</div>
</body>
</html>