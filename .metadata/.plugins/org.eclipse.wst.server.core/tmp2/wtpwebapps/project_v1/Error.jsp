<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
</head>
<body bg-color:"Red">

<center>
<h1>Error occured </h1>
<h2><%=exception.getMessage() %></h2> 

</center>
</body>
</html>