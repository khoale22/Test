<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<link href="styles/product.css" rel="stylesheet" type="text/css"
	media="all">

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

	<h2>Slide in Overlay from the Top</h2>
	<p>Hover over the image to see the effect.</p>
	
	<div class="row">
		<div class="col-sm-3">
			<div class="container">
				<img src="images/images3.png" alt="Avatar" class="image">
				<div class="overlay">
					<div class="text">
						<span> Name : <strong>abc </strong></span> <span> Price : <strong>5000$
						</strong></span>
						<button type="submit" style="background-color: red;">AddToCart</button>
					</div>
				</div>
			</div>
		</div>
	</div>


	<div class="container" >
		<ul class="pagination">
			<li><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">5</a></li>
		</ul>
	</div>

</body>
</html>