<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="Css/style.css" />
<head>
	<title>Delete Fault</title> 
</head>
<body>
</body>
<div align="center">
	<h1>Delete A Fault</h1>
</div>

<form  action = "DeleteFault" method="post" >
	<div align="center" ID = "Delete Fault">
		<button type="submit" name="DeleteID" >Press to delete:</button> :  <input type="text" name="fault" /><br />
	</div>
</form>

<FORM>
	<div align="center">
		<INPUT TYPE="BUTTON" VALUE="HomePage" 
		ONCLICK="window.location.href='Index.jsp'">
	</div>
</FORM>
</html>
	