<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scriplet demo</title>
</head>
<body>
<h2>Student information</h2>
<table border="1" style="width:100%; border-collapse:collapse">

<tr>
<th>student</th>
<th>Marks</th>





</tr>
<%
String names[]={"kunal","siddhi","kartik","ksuhi"};
double marks[]={99.99,23.56,78.89};

for(int i=0;i<3;i++){
	out.println("<tr>");
	out.println("<td>"+names[i]+"</td>");
	out.println("<td>"+marks[i]+"</td>");
}


%>

</table>

</body>
</html>