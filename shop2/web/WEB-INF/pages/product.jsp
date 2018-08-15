<%-- 
    Document   : product
    Created on : Jul 14, 2018, 4:02:22 PM
    Author     : Khoale123
--%>

<%@page import="model.Category"%>
<%@page import="model.Cart"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>product</title>
    </head>
    <body>
       
           <%
          Cart cart = (Cart)session.getAttribute("cart");
         

            
        %>
        <jsp:include page="header.jsp"></jsp:include>
           
           <section>
                <div class="container">
                    <div class="row">

                    <jsp:include page="menu.jsp"></jsp:include>
                        <div class="col-sm-9 padding-right">
                            <div class="features_items"><!--features_items-->
                                <h2 class="title text-center">Features Items</h2>
                                
                            <c:forEach var="item" items="${listProduct}"> 
                                <div class="col-sm-4">
                                    <div class="product-image-wrapper">
                                        
                                   
                                        <div class="single-products">
                                            <div class="productinfo text-center">
                                                <img src="images/shop/product12.jpg" alt="" />
                                                <h2>${item.getProductPrice()}</h2>
                                                <p>${item.getProductName()}</p>
                                                <a href="${pageContext.request.contextPath}/cart/add/plus/${item.getProductID()}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                            </div>
                                            <div class="product-overlay">
                                                <div class="overlay-content">
                                                   <h2>${item.getProductPrice()}</h2>
                                                <p>${item.getProductName()}</p>
                                                    <a href="${pageContext.request.contextPath}/cart/add/plus/${item.getProductID()} " class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                </div>
                                            </div>
                                        </div>   
                                        <div class="choose">
                                            <ul class="nav nav-pills nav-justified">
                                                <li><a href=""><i class="fa fa-plus-square"></i>Add to wishlist</a></li>
                                                <li><a href=""><i class="fa fa-plus-square"></i>Add to compare</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                
                                </c:forEach>
                                
                                
                                <div style="clear: both"> </div> 
                             

                               
                                <ul class="pagination">
                                    <li class="active"><a href="">1</a></li>
                                    <li><a href="">2</a></li>
                                    <li><a href="">3</a></li>
                                    <li><a href="">&raquo;</a></li>
                                </ul>
                            </div><!--features_items-->
                        </div>

                    </div>
                </div>
            </section><!--/slider-->                         


        <jsp:include page="footer.jsp"></jsp:include>

</body>
</html>


