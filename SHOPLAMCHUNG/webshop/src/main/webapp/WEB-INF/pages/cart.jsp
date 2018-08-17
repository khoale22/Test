<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
 <jsp:include page="header.jsp"></jsp:include> 
	<div class="container">
		<h2>Striped Rows</h2>
		<p>The .table-striped class adds zebra-stripes to a table:</p>
		<table class="table table-striped">
			<thead style="background-color: green;">
				<tr>
				    <td>Image</td>
					<th>Product_Name</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Total</th>
				</tr>
			</thead>
			<tbody>
				<tr>
				    <td><img src="images/images3.png" alt="Avatar" class="image" width="50px" height="50px"></td>
					<td>Iphone</td>
					<td>23</td>
					<th>2</th>
					<td>46</td>
				</tr>
			</tbody>
			<tbody>
				<tr>
				    <td><img src="images/images3.png" alt="Avatar" class="image" width="50px" height="50px"></td>
					<td>Iphone</td>
					<td>23</td>
					<th>2</th>
					<td>46</td>
				</tr>
			</tbody>
		</table>
		<span style=" font-size: 50px;" > Sum is : <strong> 50$</strong> </span>
	</div>
<%-- <jsp:include page="footer.jsp"></jsp:include> --%>

</body>
</html>