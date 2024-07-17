<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="todo.jsp">

Data :
<input type="text" name="todo">
<br><br>
<input type="submit" value="Remember">
<hr>
<p>${param.todo}</p>

</form>
</body>
</html>