<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h1>Bienvenido</h1>
	<form action="ServletOperaciones" method="post">
		<label>Input a number:</label>
		<input type="text" name="txtNumber1">
		<label>Input another number:</label>
		<input type="text" name="txtNumber2">
		<input type="submit" value="Accept">
		<br>
	</form>
	<table>
		<thead><th>Usuarios</th><th>Password</th></thead>
	<tbody>
	<%	
		for(int i=1; i<10; i++)
		{
			out.println("<tr><td>admin"+i+"</td><td>admin"+i+"</td></tr>");
		}
	%>
	</tbody>
	</table>
</body>
</html>