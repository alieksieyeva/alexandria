<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>

<!--  dentro test va un boolean che condiziona l'esecuzione di righe 14-17 -->
	<c:if test="${errormessage!=null}">
		<div class="alert alert-danger" role="alert">
		 ${errormessage}
		</div>
		<br/> <br/>
	</c:if>
	<form action="login" method="post" modelAttribute="tempusr">
	  <div class="form-group">
	    <input type="text" class="form-control" name= "username" placeholder="Enter username">
	  </div>
	  <div class="form-group">
	    <input type="text" class="form-control" name="password" placeholder="Enter password">
	  </div>
	  <button type="submit" class="btn btn-primary">Login</button>
	  <br/>
	  <a href="/guestlogin" class="btn btn-secondary"> Continua come ospite </a>
	</form>
	
	
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>