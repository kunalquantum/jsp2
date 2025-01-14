package com.dark;
import com.dark.Employee;

import java.sql.*;
import java.util.*;
import javax.sql.DataSource;


public class Employeeutil {

	private DataSource datasource;

	public Employeeutil(DataSource datasource) {
		super();
		
		this.datasource=datasource;
	}
	
	public List<Employee> GetAllEmployees() throws Exception{
		List<Employee> employees=null;
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		Employee emp=null;
		int id;
		String name,email;
		Timestamp doj; 
		
		try {
			
			String sql1="select * from employees";
			con=datasource.getConnection();
			st=con.createStatement();
			
			rs=st.executeQuery(sql1);
			
			
			if(rs.next()) {
				
				employees=new ArrayList<>();
				
				while(rs.next()) {
					
					id=rs.getInt("id");
					name=rs.getString("name");
					email=rs.getString("email");
					doj=rs.getTimestamp("DOJ");
				emp= new  Employee(id, name, email,doj);
				employees.add(emp);
				
				
				}
				
			}
			
		}
		finally {
			
			closeAll(con,st,rs);
			
		}
		return employees;
		
	}
	
	
	public void closeAll(Connection con,Statement st, ResultSet rs )throws Exception {
		con.close();
		st.close();
		rs.close();
	}
	
}
