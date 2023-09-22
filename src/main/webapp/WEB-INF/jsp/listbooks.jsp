<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="navbar.jsp"/>
		<div class="container text-center fs-1">
		Catalogo Libri 
	 	</div>
	 	<div class="row">
			&nbsp; 
	 	</div>
		<div class="row" id= "colonna"> 
	  
		<div class="col-6 p-t"> 
			<c:forEach var="book" items="${books}" > 
			<p class="text-light bg-dark fs-4" style="padding-left:15px; margin-left:15px">	${book.getTitle()} <span style="float:right; padding-right:10px"> ${book.getPrice()} &euro; </span></p>
			</c:forEach>
		</div>
		<div class="col-6">
		<c:forEach var="book" items="${books}" > 
					<a href="#?id=${book.getId()}" class="btn btn-secondary">Più informazioni </a>
					<a href="addToCart?id=${book.getId()}&copies=1" class="btn btn-primary" onclick="alert('Libro aggiunto');">Aggiungi al carrello </a>
			
		</c:forEach>
		</div>
	</div>
</body>
</html>