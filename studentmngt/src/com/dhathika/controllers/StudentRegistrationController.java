package com.dhathika.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dhathika.dto.Student;
import com.dhathika.service.StudentService;
import com.dhathika.service.StudentServiceImpl;


public class StudentRegistrationController extends HttpServlet {

	StudentService studentService = new StudentServiceImpl();
	
	@Override
	public void init() throws ServletException {
	System.out.println(" I am inti() always executes once before service method");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println(req);
	System.out.println(resp);
	
	
	// retrive data from the http request. 
	String stdName = req.getParameter("stdName");
	int stdId = Integer.parseInt(req.getParameter("stdId"));
	String stdClass = req.getParameter("stdClass");
	double stdPercentage = Double.parseDouble(req.getParameter("stdPercentage"));
	String stdSchoolName = req.getParameter("stdSchoolName");
	Student std = new Student();
	std.setStdId(stdId);
	std.setStdName(stdName);
	std.setStdPercentage(stdPercentage);
	std.setStdClass(stdClass);
	std.setStdSchool(stdSchoolName);
	studentService.registerStudentService(std);
	
	PrintWriter pr  = resp.getWriter();
	pr.println(stdName + " registered successfully");
	
	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Student> studentList = studentService.selectAllStudentService();
		PrintWriter pr = resp.getWriter();
		resp.setContentType("text/html;charset=UTF-8");
		pr.println("<html>");
		pr.println("<head>");
		pr.println("<title>" + " All Students " + "</title>");
		pr.println("</head>");
		pr.println("<body>");
		pr.println("<table>");
		pr.println("<tr>");
		pr.println("<th>" + "Student Id" +"</th>");
		pr.println("<th>" + "Student Name" +"</th>");
		pr.println("<th>" + "Student Class" +"</th>");
		pr.println("<th>" + "Student Percentage" +"</th>");
		pr.println("<th>" + "Student School" +"</th>");
		pr.println("</tr>");
		
		 for(Student std : studentList) {
			 pr.println("<tr>");
			 pr.println("<td>" + std.getStdId() + "</td>" );
			 pr.println("<td>" + std.getStdName() + "</td>" );
			 pr.println("<td>" + std.getStdClass() + "</td>" );
			 pr.println("<td>" + std.getStdPercentage() + "</td>" );
			 pr.println("<td>" + std.getStdSchool() + "</td>" );
				pr.println("</tr>");
		  }
		
	
		pr.println("</table>");
		pr.println("</body>");
		pr.println("</html>");
	 
	}

	
}
