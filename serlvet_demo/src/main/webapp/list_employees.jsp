<%@ page import= "com.mvc.servlet.Employee"  %>
<%@ page import= "java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of all employees</title>
</head>
<body>

<h1>The List of Employees </h1>

<table border="1" style="color: white; background-color: grey;">>

<tr style="color: Blue; background-color: black;">

<th>Employee Id</th>
<th>Employee Name</th>
<th>Employee Salary</th>

</tr> 

<%
ArrayList<Employee> allEmployees=(ArrayList<Employee>)request.getAttribute("allemps");

for(Employee  temp:allEmployees){
	out.print("<tr><td> "+temp.getEmp_id()+" </td>");
	out.print("<td> "+temp.getEmp_name()+" </td>");
	out.print("<td> "+temp.getSalary()+" </td></tr>");
}
%>

</table>

</body>
</html>