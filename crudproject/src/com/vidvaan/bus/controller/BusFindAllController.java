package com.vidvaan.bus.controller;

import java.io.IOException; 
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vidvaan.bus.model.Bus;
import com.vidvaan.bus.services.BusService;
import com.vidvaan.bus.services.BusServicesImpl;

/**
 * Servlet implementation class BusFindAllController
 */
public class BusFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public BusFindAllController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		BusService busService = new BusServicesImpl();
		List<Bus> bus = busService.findAll();
		request.setAttribute("bus", bus);
		RequestDispatcher rd = request.getRequestDispatcher("FindAll.jsp");
		rd.forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}