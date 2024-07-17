package com.dark;
import com.dark.Employeeutil;

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import javax.sql.DataSource;

public class EmployeeController extends HttpServlet {
	private Employeeutil employeeutil;
       
	@Resource(name="dark")
	private DataSource datasource;
	
	@Override
	public void init() throws ServletException {
		
		employeeutil =new Employeeutil(datasource);
		
	}
	
    public EmployeeController() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			List<Employee> employee=employeeutil.GetAllEmployees();
			request.setAttribute("allemployees", employee);
			RequestDispatcher rd=request.getRequestDispatcher("list-employee.jsp");
			rd.forward(request, response);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		
		doGet(request, response);
	}

}
