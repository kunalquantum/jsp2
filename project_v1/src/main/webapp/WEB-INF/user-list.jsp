<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Management Application</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" 
 rel="stylesheet" 
 integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" 
 crossorigin="anonymous">
</head>
<body>

<header>
	<nav class="navbar navbar-extended-md navbar-dark" style="backgroud-color: blue">
		<div>
		<a href="#" class="navbar-brand">
		User Admin Application
		</div>
		
		<ul class="navbar-nav">
		<li>
		<a href="<%=request.getContextPath() %>/list" class="nav-link">
		
		User List
		</a>
		</li>
		</ul>
	</nav>
</header>

<br>

<div class="row">
	<div class="container"> 
	<h3 class="text-container">List of Users</h3>
	<hr>
	
	<div
	class="container text-left">
	<a href="<% request.getContextPath();%>/new" class="btn btn-success"> ADD New User></a>
	
	</div>
	
	<br>
	
	<table class="table table-bordered">
		<thead>
	
			<tr> 
				<th>ID</th>
				<th>Name</th>	
				<th>Email</th>	
				<th>Contry</th>
				<th>Action</th>
				
			</tr>
	
		</thead>
		
		<tbody>
		<c:forEach var="user" items="${listUsers}">
		
		<tr>
			<td><c:out value="${user.id}}"/></td>
			<td><c:out value="${user.name}"/></td>
			<td><c:out value="${user.Email}}"/></td>
			<td><c:out value="${user.country}}"/></td>
			<td><a href="edit?id=<c:out value=$'{user.id}' />">Edit</a>
			
			&nbsp;&nbsp;&nbsp;&nbsp;
			<a  href="delete? id=<c:out value=$'{user.id}'/>">DELETE</a>
			
			
			</td>
			
			
			<td></td>
			
		
		</tr>
		
		
		</c:forEach>
		
		
		
		
		
		</tbody>
	
	</table>
	
	
	 </div>

</div>




</body>
</html>