package com.demoApp;

import java.io.PrintWriter;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.*;

// basically we have creating the service for the handling thee service and this have the request and response 
// we are using getParameter then as our input is integer type , we need to convert it into the Integer using interger.parseInt()



public class Add_servlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException {
		
		
		
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		String operation=request.getParameter("operation");
		
		PrintWriter out=response.getWriter();
		
		int k=0;
		int l=0;
		switch(operation) {
		
		case "+":
			out.println("You have Choosed To Add ");
			out.println("The Sum of the Numbers are :");
			 k=i+j;
			 out.println(k);
		break;
		case "-":
			out.println("You have Choosed To Substract ");
			out.println("The difference of the Numbers are :");
			 k=i-j;
			 out.println(k);
		break;
			 
		case "*":
			out.println("You have Choosed To Multiply ");
			out.println("The product of the Numbers are :");
			 k=i*j;
			 out.println(k);
		break;
			
		case "/":
			out.println("You have Choosed To Divide ");
			out.println("The Qoutent of the Numbers are :");
			 k=i/j;
			 out.println(k);
		break;
		case "SQR":
			out.println("You have Choosed To Squaring of the number ");
	
			 k=i*i;
			 l=j*j;
			 out.println("The square of first number :"+k);
			 out.println("The square of the second Number :"+l);
			 
			 
		break;
			 
		case "AVR":
			out.println("You have Choosed To Average of the numbers ");
	
			 k=i+j;
			 l=k/2;
			 out.println(l);
		break;
			
		case "%":
			out.println("You have Choosed To Modulo of the numbers ");
	
			 k=i%j;
			 
			 out.println(k);
		break;
		
		default:
			out.println("The input is invalid");
			
		break;
		
		}
		
	
//		
		Cookie c=new Cookie("k",k+"");
		response.addCookie(c);
//		
	
	
		
	
		// this was printing the result on the console 
		//System.out.print("Result :"+k);
		

	
		
//		PrintWriter out=response.getWriter();
//		out.print("the addition of two number are :");
//		out.println("Result is :"+k);
	
		
		//response.sendRedirect("square");
		
		
		

		
	}
	
	


}
