<%@page import="java.util.List"%>
<%@page import="com.vidvaan.bus.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h3>All Buses</h3>
		<a href="insert.html" class="btn btn-primary">New Buses</a>
		<hr>
		<%
			if (request != null && request.getAttribute("msg") != null) {
		%>
		<span class="success"><%=request.getAttribute("msg")%></span>
		<%
			}
		%>
		<table class="table">
			<tr>
				<th>BID</th>
				<th>BNAME</th>
				<th>BTYPE</th>
				<th>BROUTE</th>
				<th>TODATE</th>
				<th>FROMDATE</th>
				<th>BCAPACITY</th>
				<th>EDIT</th>
				<th>DELETE</th>
			</tr>
			<%
				//List<Bus> bus = (List<bus>) request.getAttribute("bus");
				/* List<Bus> bus = (List<Bus>) request.getAttribute("bus");
					for (Bus bus : Bus) { */
				List<Bus> bus1 = (List<Bus>) request.getAttribute("bus");
				for (Bus bus : bus1) {
			%>
			<tr>
				<td><%=bus.getBid()%></td>
				<td><%=bus.getBname()%></td>
				<td><%=bus.getBtype()%></td>
				<td><%=bus.getRoute()%></td>
				<td><%=bus.getTodate()%></td>
				<td><%=bus.getFromdate()%></td>
				<td><%=bus.getBcapacity()%></td>
				<td><a href="./BusUpdateController?bid=<%=bus.getBid()%>">Edit</a></td>
				<td><a href="./BusDeleteController?bid=<%=bus.getBid()%>">Delete</a></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>