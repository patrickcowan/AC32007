
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="Css/style.css"> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
	<h1>Add a New Fault</h1>
</div>

<form action = "AddFault" method="post" >
	<div align="center" ID = "Fault">
		Reporter Name: <input type="text" name="reporter" /><br />
		Severity:       <input type="text" name="severity" /><br />
		Short Description: <input type="text" name="short_descript" /><br />
		Long Description: <input type="text" name="long_descript" /><br />
		<button type="submit" name="AddFault">Add Fault</button><br />
		
	</div>
</form>


<div align="center" >

<a href="Index.jsp"> <button> Home </button> </a>

</div>

</body>

</html>