package com.mvc.servlet;
import java.util.ArrayList;
import com.mvc.servlet.employeeutil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class employeeController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		employeeutil e=new employeeutil();
		ArrayList<Employee> myAllemployees=e.getallemployee();
		
		
		request.setAttribute("allemps", myAllemployees);
		
		RequestDispatcher rd=request.getRequestDispatcher("list_employees.jsp");
		
		rd.forward(request, response);
		
	}



}
