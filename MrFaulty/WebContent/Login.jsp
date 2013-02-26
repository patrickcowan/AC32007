
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="Css/style.css"> 
	<head>
		<title>Mr Faulty</title>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	</head>
<body>
<center>
	
	
	

	
	<table border="0">
	<tr>
	
	<td><img src="repair.png" alt="repair" height="80" width="100"/></td>
	<td><h1>Mr Faulty</h1></td>
	<td><img src="repair2.png" alt="repair" height="80" width="100"/></td>
	</tr>
	
	</table>
	
	<label>Please login below:</label><br /><br />
<form  action = "Login" method="post" >	
<table border="0">
		<tr>
			<td><label>Username: </label></td>
			<td><input type="text" name="user" /></td>
		</tr>
	<tr>
		<td><label>Password: </label></td>
		<td><input type="password" name="pass" /></td>
	</tr>
</table>

	<input type="submit" value="  Login  "/>
	 
</form>

<a href="Register.jsp"><button class = "button-link">Register</button></a>

<div align="center" ID ="reminder">
	Forgotten Password?
</div>
	
</center>
</body>
</html>