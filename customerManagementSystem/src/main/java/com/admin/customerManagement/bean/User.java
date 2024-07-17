package com.admin.customerManagement.bean;

public class User {
	private int id;
	private String name;
	private String Email;
	private String Country;
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
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public User(int id, String name, String email, String country) {
		super();
		this.id = id;
		this.name = name;
		Email = email;
		Country = country;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public User(String name, String email, String country) {
		super();
		this.name = name;
		Email = email;
		Country = country;
	}
	
	

	
}
