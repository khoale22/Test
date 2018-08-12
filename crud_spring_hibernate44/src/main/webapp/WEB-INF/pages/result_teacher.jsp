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
<h1>Hello ${user.userName}</h1>
	<%-- 	<h1>${user.userName}</h1> --%>
	<%-- 	<h2>${user.getRole().getRoleName()}</h2> --%>

	
		<table border="1" width="100px"> 
		<c:forEach var="result" items="${listresult}" >
			<tr>
                <td>${result.user.userId}</td>
				<td>${result.subject.subjectName}</td>
				<td>${result.result}</td>
				<td><a href="editResult?subjectName=${result.subject.subjectName}&userId=${result.user.userId}" >edit</a> </td>
				
			</tr>
			</c:forEach>
		</table>
	
</body>
</html>