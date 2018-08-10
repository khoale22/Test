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

<c:forEach var="test" items="listtest">

<table border="1" width="100px"> 
		<c:forEach var="user" items="${listtest}">
			<tr>	
				<td>${userName}</td>
			</tr>
			</c:forEach>
		</table>

</c:forEach>

</body>
</html>