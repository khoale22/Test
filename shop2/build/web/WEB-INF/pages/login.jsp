<%-- 
    Document   : login
    Created on : Jul 17, 2018, 10:45:11 AM
    Author     : Khoale123
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    
        <jsp:include page="header.jsp"></jsp:include>



            <h2>Đăng nhập hệ thống</h2>
           <form action="${pageContext.request.contextPath}/login/DoIt" method="post">
            <input type="text" name="email"placeholder="Email Address" />
            <input type="number" name="pass" placeholder="Password" />
                <span><a href="x">Quên mật khẩu?</a></span>
                <input type="submit" class="btn btn-default" value="Login" />
            </form>

     


        <jsp:include page="footer.jsp"></jsp:include>
    
</html>
