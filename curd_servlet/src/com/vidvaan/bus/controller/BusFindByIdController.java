package com.vidvaan.bus.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.bus.model.Bus;
import com.vidvaan.bus.services.BusService;
import com.vidvaan.bus.services.BusServicesImpl;
 

/**
 * Servlet implementation class BusFindByIdController
 */
public class BusFindByIdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BusFindByIdController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int bid = Integer.parseInt(request.getParameter("bid"));
		BusService busService = new BusServicesImpl();
		Bus bus = busService.findById(bid);
		if (bus != null) {
			out.println("<h2>Employee Details Are </h2>");
			out.println("----------------------------- ");
			out.println("<br>EID : " + bus.getBid());
			out.println("<br>ENAME : " + bus.getBname());
			out.println("<br>ESAL : " + bus.getBtype());
			out.println("<br>ESAL : " + bus.getRoute());
			out.println("<br>ESAL : " + bus.getTodate());
			out.println("<br>ESAL : " + bus.getFromdate());
			out.println("<br>ESAL : " + bus.getBcapacity());
			out.println("<br>-----------------------------");
		} else {
			out.println("<h2>No Records found</h2>");
		}
		out.println("<br><a href='Home.html'>Go to Home </a>");

	}


}
