package com.dhathika.packone;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletOne extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		System.out.println("Request Object in ServletOne " + req);
//		System.out.println("Response Object in ServletOne " + resp);
//		
//		System.out.println(req.getParameter("firstname"));
//		System.out.println(req.getParameter("lastname"));
//		System.out.println(req.getParameter("age"));

		String firstName = req.getParameter("firstname");
		String lastName = req.getParameter("lastname");
		String age = req.getParameter("age");
		
		ServletContext context = getServletContext();
		context.setAttribute("fName", firstName);
		context.setAttribute("lName", lastName);
		context.setAttribute("age", age);
       ServletConfig servletConfig =  getServletConfig();
      String servletNameConfiguredInWebDotXML =  servletConfig.getServletName();
      System.out.println(servletNameConfiguredInWebDotXML);
	 
	RequestDispatcher rd = req.getRequestDispatcher("two");
	rd.include(req, resp);
	rd.forward(req, resp);
	
	
	
	}


}
