package com.dhathika.packone;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("Request Object in Servlet Three " + req);
//		System.out.println("Response Object in Servlet Three  " + resp);
//		
//		System.out.println(req.getParameter("fname"));
//		System.out.println(req.getParameter("lname"));
//		System.out.println(req.getParameter("cage"));
//		System.out.println(req.getParameter("sscpercentage"));
//		System.out.println(req.getParameter("plustwopercentage"));
		
	ServletContext context = 	getServletContext();
	context.getAttribute("firstName");
		ServletConfig servletConfig =  getServletConfig();
	      String servletNameConfiguredInWebDotXML =  servletConfig.getServletName();
	      System.out.println(servletNameConfiguredInWebDotXML);
	}
}
