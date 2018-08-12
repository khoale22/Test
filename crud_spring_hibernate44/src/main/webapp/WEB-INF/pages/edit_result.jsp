<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="update" modelAttribute="result" method="post">
		<form:hidden path="id.subjectId" /> 
		<form:hidden path="id.userId" /> 
		<form:input path="result" />
		<input type="submit" value="submit">
	</form:form>

</body>
</html>