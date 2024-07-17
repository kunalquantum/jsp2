
package com.mvc.servlet;
import java.util.ArrayList;
//this is  the data Access object class which is also called as the util  class 
public class employeeutil {
	
	
	public ArrayList<Employee> getallemployee(){
		
		ArrayList<Employee> allemployees =new ArrayList<>();
		
		allemployees.add(new Employee(1,"yogesh",2500.55));
		allemployees.add(new Employee(2,"Mangesh",4567.55));
		allemployees.add(new Employee(1,"Tanush",7800.55));
		allemployees.add(new Employee(1,"Mogesh",1200.55));
		
		
		
		return allemployees;
	}

}
