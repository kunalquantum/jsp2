<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="userresponse.jsp" method="post">
<h3>Name    :</h3> <input type="text" name="Name">
<br>
<h3>Surname :</h3> <input type="text" name="surname">
<br>
<br>
<h2>Select your Counrty of work</h2>
Country :
<select name="nation">
<option value="Bharat">India </option>
<option value="United states of america">USA </option>
<option value="repuublic of china">China </option>
<option >FRance </option>

</select>
<br>
<h2>Select Your Favourite Language</h2>
<input type="radio" name="favlang" value="java">Java
<input type="radio" name="favlang" value="javascript">Javascript
<input type="radio" name="favlang" value="Python">Python
<input type="radio" name="favlang" value="Rubi">Rubi
<input type="radio" name="favlang" value="C++">C++
<br>
<br>
<h2>Select Your Favourite Techhnologye</h2>
<input type="checkbox" name="favtech" value="Spring boot">Spring Boot
<input type="checkbox" name="favtech" value="Django">Django
<input type="checkbox" name="favtech" value="Mysql">Python
<input type="checkbox" name="favtech" value="React">React
<input type="checkbox" name="favtech" value="Tableu">Tableu
<br>
<input type="submit" value="Submit">
</form>
</body>
</html>