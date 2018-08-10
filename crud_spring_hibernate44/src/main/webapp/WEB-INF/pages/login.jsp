<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>LOGIN</h1>
<form action="login/role" method="post">
	<table>
		<tr>
			<td><label>UserId : </label></td>
			<td><input type="text" placeholder="enter your username"
				name="username" required></td>
		</tr>
		<tr>
			<td>Pass</td>
			<td><input type="text" placeholder="enter your pass"
				name="pass" required></td>
		</tr>

		<tr>
			<td><input type="submit" value="Login"></td>
		</tr>
	</table>	
</form>
<br>
<br>
<br>
<br>
<br>

<a href="testjoin">click</a>
</body>
</html>