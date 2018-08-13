<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<style type="text/css">
.account-wall {
	margin-top: 20px;
	padding: 40px 0px 20px 0px;
	background-color: #f7f7f7;
	/*     /// HIEU UNG BONG DO */
	-moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	-webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
}

.profile-img {
	width: 96px;
	height: 96px;
	margin: 0 auto 10px;
	display: block;
	-moz-border-radius: 50%;
	-webkit-border-radius: 50%;
	border-radius: 50%;
}

.size {
	margin-left: 100px;
	margin-right: 100px;
	/* 	padding-left: 20px; */
	/* 	padding-right: 20px; */ 
}
</style>
</head>
<body>
	<!-- 	<div class="container"> -->
	<!-- 		<div class="row"> -->
	<!-- 			<div class="col-sm-6 col-md-4 "></div> -->
	<!-- 			<div class="col-sm-6 col-md-4 "> -->
	<div style="width: 25%; margin: 0 auto;">

		<div class="account-wall">
			<div align="center">
				<img class="img-thumbnail" src="images/images2.jpeg">
			</div>
			<form>
				<input type="text" class="form-control" placeholder="Email" required
					autofocus> <input type="password" class="form-control"
					placeholder="Password" required>
				<button class="btn btn-success btn-block" type="submit">Login</button>
				<div class="form-check">
					<label class="form-check-label" for="check1"> <input
						type="checkbox" class="form-check-input" id="check1"
						name="option1" value="something" checked>Remember me
					</label>
				</div>
			</form>
		</div>
	</div>
	<!-- 			</div> -->
	<!-- 		</div> -->
	<!-- 	</div> -->
</body>
</html>