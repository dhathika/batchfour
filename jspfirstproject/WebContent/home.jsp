<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "java.util.List" %>
<%@page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1> Table Printer </h1>
<% 
int  number = Integer.parseInt(request.getParameter("number"));
out.write("Table of " + number);
for(int i = 1 ; i<=10; i++ )
	out.write(i  + " X " + number + " = " + i*number + " ");
List<String> list = new ArrayList<String>();
request.getRequestDispatcher("another.jsp");

%>

</body>
</html>