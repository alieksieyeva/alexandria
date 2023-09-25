<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Navbar</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light mb-4">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://cdn-icons-png.flaticon.com/512/3145/3145816.png" alt="" width="24" height="24" class="d-inline-block align-text-top">
      Alexandria
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav">
        <a class="nav-link active" aria-current="page" href="/">Home</a>
        <a class="nav-link active" href="#">Autori</a>
        <a class="nav-link active" href="/bookscatalogue">Libri</a>
        <a class="nav-link active" href="/cartpage">Carrello</a>
        <c:if test="${user.getLevel()<=1 }">
        	<a class="nav-link active" href="/orderspage">Orders</a>
        </c:if>
        <c:if test="${user.getLevel()==0 }">
        	<a class="nav-link active" href="/createbook">New_Book</a>
        </c:if>
        <c:if test="${user.getLevel()==0 }">
        	<a class="nav-link active" href="/createauthor">New_Author</a>
        </c:if>
        <a class="nav-link active text-primary" style="margin-left:475%" href="/logout">Logout</a>
      </div>
    </div>
  </div>
</nav>



	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</body>
</html>