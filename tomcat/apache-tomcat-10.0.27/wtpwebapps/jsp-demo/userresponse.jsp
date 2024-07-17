<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response</title>
</head>
<body>
<h1>user is confirmed</h1>

<table>
<tr>
<th>Name</th><th>Surname</th><th>Country</th><th>favourite language</th>
</tr>
<tr>
<th><%=request.getParameter("Name") %></th>
<th><%=request.getParameter("surname")%></th>
<th><%=request.getParameter("nation")%></th>
<th><%=request.getParameter("favlang")%></th>
</tr>
<tr>
<% String []tech=request.getParameterValues("favtech");
if(tech!=null){
	for(String n:tech){
		out.println("<li>"+n+"</li>");
	}
}



%>
</table>
</body>
</html>