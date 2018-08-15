<%-- 
    Document   : cart
    Created on : Jul 14, 2018, 4:08:55 PM
    Author     : Khoale123
--%>

<%@page import="model.Item"%>
<%@page import="java.util.Map"%>
<%@page import="model.Cart"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>cart</title>
    </head>
    <body>
           <%
          Cart cart = (Cart)session.getAttribute("cart");
         
            
     
        %>
        
        <jsp:include page="header.jsp"></jsp:include>
     
	<section id="cart_items">
		<div class="container">
			<div class="breadcrumbs">
				<ol class="breadcrumb">
				  <li><a href="#">Home</a></li>
				  <li class="active">Shopping Cart</li>
				</ol>
			</div>
			<div class="table-responsive cart_info">
				<table class="table table-condensed">
					<thead>
						<tr class="cart_menu">
							<td class="image">Item</td>
							<td class="description"></td>
							<td class="price">Price</td>
							<td class="quantity">Quantity</td>
							<td class="total">Total</td>
							<td></td>
						</tr>
					</thead>
					<tbody>
                                      <%for(Map.Entry<Long , Item > list :cart.getCartitems().entrySet()) { %>
						<tr>
							<td class="cart_product">
								<a href=""><img src="images/cart/one.png" alt=""></a>
							</td>
							<td class="cart_description">
                                                            <h4><a href=""><%=list.getValue().getProduct().getProductName() %></a></h4>
								<p>ID: <%=list.getValue().getProduct().getProductID() %></p>
							</td>
							<td class="cart_price">
								<p><%=list.getValue().getProduct().getProductPrice() %></p>
							</td>
							<td >
								
                                                                    <p>	<%=list.getValue().getQuanlity()%> </p>
                                                                       
						
							</td>
							<td class="cart_total">
								<p class="cart_total_price"> <%=list.getValue().getQuanlity()* list.getValue().getProduct().getProductPrice()%> </p>
							</td>
							<td class="cart_delete">
                                                            <a class="cart_quantity_delete" href=""> <i class="fa fa-times"></i></a>
							</td>
						</tr>
                                            <% } %>
						<td class="total"><%=cart.totalCart()%></td>
                                                <td class="total">${cart.totalCart()}></td>
					</tbody>
				</table>
			</div>
		</div>
	</section> <!--/#cart_items-->
      
           <form action="${pageContext.request.contextPath}/CheckOut/DoIt" method="POST">
                        <div>
                            <span>Address *</span>
                            <input type="text" name="address">
                        </div> 	
                        <div>
                            <span>Payment *</span>
                            <select name="payment"> 
                                <option value="Bank transfer"> Bank transfer </option>
                                <option value="Live"> Live </option>

                            </select>
                        </div> 	
                         <input type="submit" value="Checkout"> 
                    
           </form>

        <jsp:include page="footer.jsp"></jsp:include>

       
    </body>
</html>
