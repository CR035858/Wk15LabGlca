<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
div
{
	height:200px;
	width:300px;
	border-style: solid;
	border-width: 2px;
}
</style>
</head>
<body bgcolor="aqua">
<h2>Welcome to Customer Care Centre</h2>
<h3>${greetings}</h3>
<center>
<div>
<a href="/cgrievance/repsInfo">Click to View Customer Care Representative Information...</a> <br>
<hr/>
<a href="/cgrievance/getTicketsInfo">Click to View Support Ticket Information...</a>

</div>
</center>
</body>

</html>