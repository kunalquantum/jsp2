package com.demoApp;
import java.io.PrintWriter;
import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class squareSerlvet extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
//		
		int k=0;
		Cookie cookie[]=request.getCookies();
		
		for(Cookie c:cookie) {
			if(c.getName().equals("k")) {
				k=Integer.parseInt(c.getValue());
			}
			
		}
		PrintWriter out=response.getWriter();
		int res=k*k;
			
		out.println("The Addition of the number is "+k);
		out.println("Square of "+k+" :"+res);
	
		
		System.out.println("Yes successfull");
		
		
	}

	
	
}
