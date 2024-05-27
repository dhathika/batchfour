<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String username = request.getParameter("username");
String password = request.getParameter("password");
if(username.equals("java") && password.equals("java")){
	RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
	rd.forward(request, response);
}
else{
	RequestDispatcher rd= request.getRequestDispatcher("/failure.jsp");
	rd.forward(request, response);
	
}
%>

</body>
</html>