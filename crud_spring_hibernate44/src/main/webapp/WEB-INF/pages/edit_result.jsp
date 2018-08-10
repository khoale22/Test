<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="listresultedit" method="POST">

		<table border="1">
			<c:forEach var="item" items="${listresultedit} " varStatus="loop">
				<tr>
					<td><form:input path="listresultedit[${loop.index}].subject.subjectName" /></td>
				</tr>
			</c:forEach>
		</table>


	</form:form>

</body>
</html>