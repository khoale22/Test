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
	<h1>Xin chao ${user.userName}</h1>
	<%-- 	<h1>${user.userName}</h1> --%>
	<%-- 	<h2>${user.getRole().getRoleName()}</h2> --%>

	<c:forEach var="result" items="${list}">
		<table border="1" width="100px"> 
			<tr>
				<td>${result.subject.subjectName}</td>
				<td>${result.result}</td>
			</tr>
		</table>
	</c:forEach>

</body>
</html>