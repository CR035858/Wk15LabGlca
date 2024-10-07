<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<center><h3>Welcome to Support Tickets Page...</h3>
<table border="2">
<thead>

<tr>
	<th>Ticket Title</th>
	<th>Description</th>
	<th>Raised Date</th>
	<th>Category</th>
	<th>Assigned CCRep</th>
</tr>
</thead>
<tbody>
<c:forEach items="${supportTickets}" var="sTicket">
	<tr>
		<td><c:out value="${sTicket.ticketTitle}" /></td>
		<td><c:out value="${sTicket.ticketDescription}" /></td>
		<td><c:out value="${sTicket.category}" /></td>
		<td><c:out value="${sTicket.ticketRaisedDate}" /></td>
		<td><c:out value="${sTicket.assignedCCRep}" /></td>
	</tr>
</c:forEach>
</tbody>


</table>
<h3><a href="/cgrievance/welcome">Go Back To Welcome Page...</a></h3>
</center>
</body>
</html>