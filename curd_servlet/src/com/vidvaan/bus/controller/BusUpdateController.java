package com.vidvaan.bus.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.bus.model.Bus;
import com.vidvaan.bus.services.BusService;
import com.vidvaan.bus.services.BusServicesImpl;
 

/**
 * Servlet implementation class BusUpdateController
 */
public class BusUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BusUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bid= Integer.parseInt(request.getParameter("bid"));
		BusService busService = new BusServicesImpl();
		Bus bus = busService.findById(bid);
		request.setAttribute("bus", bus);
		RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
		rd.forward(request, response);}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("EmployeeUpdateController Post Method Called");
		response.setContentType("text/html");

		int bid = Integer.parseInt(request.getParameter("bid"));
		String bname = request.getParameter("bname");
		String btype = request.getParameter("btype");
		String broute = request.getParameter("broute");
		String todate = request.getParameter("todate");
		String fromdate = request.getParameter("fromdate");
		int bcapacity = Integer.parseInt(request.getParameter("bcapacity"));
		BusService busService = new BusServicesImpl();
		Bus bus = new Bus(bid, bname, btype, broute, todate, fromdate, bcapacity);
		busService.update(bus);
		request.setAttribute("msg", "Record Updated Successfully");
		RequestDispatcher rd = request.getRequestDispatcher("/BusFindAllController");
		rd.forward(request, response);
	}

}
