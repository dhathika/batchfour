package com.dhathika.packone;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BalajiServlet extends HttpServlet {
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pr = resp.getWriter();
//		System.out.println("Request Object in ServletTwo " + req);
//		System.out.println("Response Object in ServletTwo " + resp);
//		System.out.println("i am from second servlet");
//		
//		System.out.println(req.getParameter("firstname"));
//		System.out.println(req.getParameter("lastname"));
//		System.out.println(req.getParameter("age"));
	   RequestDispatcher rd = req.getRequestDispatcher("three.html");
//	   req.setAttribute("fname",req.getParameter("firstname") );
//	   req.setAttribute("lname",req.getParameter("lastname") );
//	   req.setAttribute("cage",req.getParameter("age") );
	   
	   ServletConfig servletConfig =  getServletConfig();
//	      String servletNameConfiguredInWebDotXML =  servletConfig.getServletName();
//	      System.out.println(servletNameConfiguredInWebDotXML);
//	      
//	     String nameInitParameterGivenInWebDotXML =  servletConfig.getInitParameter("name");
//	     String addressInitParameterGivenInWebDotXML =  servletConfig.getInitParameter("address");
//	      
//	     System.out.println(nameInitParameterGivenInWebDotXML);
//	     System.out.println(addressInitParameterGivenInWebDotXML);
	     
//	   Enumeration<String> e =  servletConfig.getInitParameterNames();
//	
//	   while(e.hasMoreElements()) {
//		   System.out.println(servletConfig.getInitParameter(e.nextElement()));
//	   }
	   
	  ServletContext context =  getServletContext();
	  String fistName = (String) context.getAttribute("lName");
	  String lastName = (String) context.getAttribute("fName");
	  
	  String serverName = context.getVirtualServerName();
	  System.out.println(serverName);
	  
	  
	 String configParam =  servletConfig.getInitParameter("name");
	String contextParam =  context.getInitParameter("cname");
	
	System.out.println(configParam);
	System.out.println(contextParam);
	   
	   rd.include(req, resp);
// coockies
	   // session 
	   // urlredirect 
	   // hidden form data 
	}

}
