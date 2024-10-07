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
<center><h3>Welcome to Customer Care Representative Details Page...</h3>
<table border="2">
<thead>

<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Address</th>
	<th>Department</th>
	<th>Designation</th>
</tr>
</thead>
<tbody>
<c:forEach items="${ccRepList}" var="ccrep">
	<tr>
		<td><c:out value="${ccrep.firstName}" /></td>
		<td><c:out value="${ccrep.lastName}" /></td>
		<td><c:out value="${ccrep.address}" /></td>
		<td><c:out value="${ccrep.department}" /></td>
		<td><c:out value="${ccrep.designation}" /></td>
	</tr>
</c:forEach>
</tbody>


</table>
<h3><a href="/cgrievance/welcome">Go Back To Welcome Page...</a></h3>
</center>
</body>
</html>