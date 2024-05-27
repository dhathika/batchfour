package com.vidvaan.bus.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.bus.model.Bus;
import com.vidvaan.bus.services.BusService;
import com.vidvaan.bus.services.BusServicesImpl;
 
/**
 * Servlet implementation class BusInsertController
 */
public class BusInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BusInsertController() {
		super();
	}

	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("Employee Insert Method Called");
		int bid = Integer.parseInt(request.getParameter("bid"));
		String bname = request.getParameter("bname");
		String btype = request.getParameter("btype");
		String broute = request.getParameter("broute");
		String todate = request.getParameter("todate");
		String fromdate = request.getParameter("fromdate");
		System.out.println(todate);
		System.out.println(fromdate);
		int bcapacity = Integer.parseInt(request.getParameter("bcapacity"));
		BusService busService = new BusServicesImpl();
		Bus bus = new Bus(bid, bname, btype, broute, todate, fromdate, bcapacity);
		busService.insert(bus);
		out.println("succesfully inserted");
		RequestDispatcher rd = request.getRequestDispatcher("Home.html");
		rd.include(request, response);
		// request.setAttribute("message","New Record Inserted Successfully");

	}

}
