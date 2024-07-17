<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>multiline scriplet </title>
</head>
<body>
<h3>Natural  numbers </h3>
<%
//String name[]={"kunal","gaurav","ankit","virat"};

for(int i=1;i<=10;i++){
	out.println("<p>The value of I ="+i+"</p>");
}




%>

<ul style="color:blue">
<%
for(int i=0;i<10;i++){
out.println("<li>"+i+"</li>");}
%>
</ul>
<ol style="color:blue">
<%
for(int i=0;i<10;i++){
out.println("<li>"+i+"</li>");}
%>
</ol>

</body>
</html>