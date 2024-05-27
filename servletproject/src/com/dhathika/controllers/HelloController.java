package com.dhathika.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloController
 */
//@WebServlet(
//		description = "this is hello world controller", 
//		urlPatterns = { "/hello" }, 
//		initParams = { 
//				@WebInitParam(name = "name", value = "suresh", description = "firstinitparameter")
//		})
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pr = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		pr.println("<html>");
		pr.println("<head>");
		pr.println("<title>" + " Response Page " + "</title>");
		pr.println("</head>");
		pr.println("<body>");
		pr.println("<p>" + "Hello Controller Responded " + "</p>");		
		pr.println("</body>");
		pr.println("</html>");
	}

}
