package com.dhathika.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
		
	// two types 1.primitive types 2.referencive type 
	// when it participates in serialization i.e when the object of this 
	// class is going out of jvm/ java context to another program.

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// initializaton.// declations 

		int i = 123;
		//  how to create coocies. 
		String username = req.getParameter("username");
		String password = req.getParameter("password");
//		Cookie cookiePassword = new Cookie("passwordCookie",password);
//		Cookie cookieUserName = new Cookie("usernameCookie", username);
//		cookieUserName.setMaxAge(50);
//		resp.addCookie(cookiePassword);
//		resp.addCookie(cookieUserName);
		// session object will be used for mainitaing the user details 
		// in the process of browsing different web pages. 
		// can be used to pass values to another servlet. 
		// deprecated - will work but no more support on this method from java
		
		
		HttpSession session = req.getSession();
	
        System.out.println(session.getCreationTime());
		System.out.println(session.getId());
		System.out.println(session.getLastAccessedTime());
		
		session.setAttribute("name", "suresh");
	
		// if user is not clicking anylink or not performing any actions on
		// on the page the user session will be automatically invalidate();
		session.invalidate();
		
		// You can read all configuration of this particular servlet . 
		ServletConfig config = getServletConfig();
		
		// You can read all configuration information about all servlets in project 
		
		ServletContext context = getServletContext();
		
		List<String> str = new ArrayList<String>();
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> User Details Page </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action= \"two\" method=\"post\">");
		out.println("Enter school Name <input type=\"text\" name =\"schoolname\"><br>");
		out.println("Enter Collage Name <input type=\"text\" name =\"collagename\"><br>");
		out.println("<input type=\"submit\" value =\"Go\">");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
//		req.getRequestDispatcher("two").include(req, resp);
		// how to set cookies to the response or request. 
		
		
		
	}
}
