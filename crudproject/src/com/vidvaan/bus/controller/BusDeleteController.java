package com.vidvaan.bus.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.bus.services.BusService;
import com.vidvaan.bus.services.BusServicesImpl;

/** 
 * Servlet implementation class BusDeleteController
 */
public class BusDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BusDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bid = Integer.parseInt(request.getParameter("bid"));
		BusService busService = new BusServicesImpl();
		busService.delete(bid);
		request.setAttribute("msg", "Record Deleted Successfully");
		RequestDispatcher rd = request.getRequestDispatcher("/BusFindAllController");
		rd.forward(request, response);
	}

	

}
