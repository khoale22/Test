<%-- 
    Document   : about
    Created on : Jul 14, 2018, 3:58:20 PM
    Author     : Khoale123
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>about</title>
    </head>
    <body>
      <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="slider.jsp"></jsp:include>
             <section>
                <div class="container">
                    <div class="row">
                        
                        <jsp:include page="menu.jsp"></jsp:include>
                         <jsp:include page="content.jsp"></jsp:include>

                    </div>
                </div>
            </section><!--/slider-->                         


        <jsp:include page="footer.jsp"></jsp:include>

    </body>
</html>
