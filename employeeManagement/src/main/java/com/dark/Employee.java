package com.dark;
import java.sql.Timestamp;
public class Employee {
	private int id;
	private String name;
	private String email;
	private Timestamp doj;
	
	//parameterized constructor 
	public Employee(int id, String name, String email, Timestamp doj) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.doj = doj;
	}
	// WITHOUT THE ID FEILD
	public Employee(String name, String email, Timestamp doj) {
		super();
		this.name = name;
		this.email = email;
		this.doj = doj;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getDoj() {
		return doj;
	}
	public void setDoj(Timestamp doj) {
		this.doj = doj;
	}
	
	
	
	
	

}
