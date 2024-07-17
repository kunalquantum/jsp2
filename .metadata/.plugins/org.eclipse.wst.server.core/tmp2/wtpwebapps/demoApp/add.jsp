

<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customize addition</title>
</head>
<body bgcolor="cyon">
<% 
int i=Integer.parseInt(request.getParameter("num1"));
int j=Integer.parseInt(request.getParameter("num2"));
String operation=request.getParameter("operation");
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

%>
</body>
</html>