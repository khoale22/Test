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
	<h1 align="center">Hello ${user.userName}</h1>
	<%-- 	<h1>${user.userName}</h1> --%>
	<%-- 	<h2>${user.getRole().getRoleName()}</h2> --%>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>SUBJECT_NAME</th>
					<th>RESULT</th>
					<th>ACTION</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach var="result" items="${list}">
					<tr>
						<td>${result.subject.subjectName}</td>
						<td>${result.result}</td>

						<c:choose>
							<c:when test="${result.result>=5}">
							<td><a href="register">register </a>
								</td>
							</c:when>
                           <c:when test="${result.result<5}">
                           <td>fail</td>
                           </c:when>
						</c:choose>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<form action="logout_stu" method="get">
			<button type="submit" class="btn btn-dark btn-lg">Logout</button>
		</form>
	</div>

</body>
</html>