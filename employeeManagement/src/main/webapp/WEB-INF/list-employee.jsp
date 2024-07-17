<%@ page import="com.dark.Employee" %>
<%@ page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of employees</title>
</head>
<body>
<table>
<tr>

<th>NAME</th>
<th>EMAIL</th>
<th>JOINING DATE</th>
<%

List<Employee> employee=(List<Employee>)request.getAttribute("allemployees");

for(Employee e:employee){
	
	out.print("<tr><td>"+e.getName()+"</td>");
	out.print("<td>"+e.getEmail()+"</td>");
	out.print("<td>"+e.getDoj()+"</td></tr>");
	
}



%>

</tr>

</table>

</body>
</html>