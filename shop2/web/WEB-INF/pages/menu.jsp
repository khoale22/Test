<%-- 
    Document   : menu
    Created on : Jul 14, 2018, 3:46:22 PM
    Author     : Khoale123
--%>

<%@page import="org.springframework.ui.ModelMap"%>
<%@page import="model.Category"%>
<%@page import="model.Cart"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>menu</title>
    </head>
    <body>
    
       	<div class="col-sm-3">
            <div class="left-sidebar">
               
               
                <div class="brands_products"><!--brands_products-->
                     <h2>Category</h2>
                     
                    <div class="brands-name">
                        <ul class="nav nav-pills nav-stacked">
                            
                            <c:forEach var="item" items="${listCategory}">
                            <li><a href="${pageContext.request.contextPath}/product/list/${item.getCategoryID()}"> ${item.getCategoryName()}</a></li>
                            
                            </c:forEach>
                          
                          
                            
                        </ul>
                        
                    </div>
                </div><!--/brands_products-->

            </div>
        </div>
    </body>
</html>
