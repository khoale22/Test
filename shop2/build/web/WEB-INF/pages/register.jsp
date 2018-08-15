<%-- 
    Document   : register.jsp
    Created on : Jul 16, 2018, 12:14:50 PM
    Author     : Khoale123
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>register</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>

<h2>Đăng ký tài khoản</h2>
<form:form action="${pageContext.request.contextPath}/Doit" commandName="userABC" method="post">
     <form:errors path="userName" cssClass="error"/>
     <form:password path="userName" size="30" placeholder="Full Name"/>
     <form:errors path="userEmail" cssClass="error"/>
     <form:input path="userEmail" size="30" placeholder="Email Address"/>
     <form:errors path="userPass" cssClass="error"/>
     <form:password path="userPass" size="30" placeholder="Password"/>
     <input type="submit" class="btn btn-default" value="Signup" />
</form:form>
              
            
            
            
    <jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
