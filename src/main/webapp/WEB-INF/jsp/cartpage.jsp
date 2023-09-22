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
	<c:forEach var="book" items="${cart.getItems().keySet()}" > 
			<p class="text-light bg-dark fs-4" style="padding-left:15px; margin-left:15px">	${book.getTitle()} 
			${book.getPrice()}  &euro;
			${cart.getTotalPrice(book)}  &euro;
			<a href="/addToCart?id=${book.getId()}&copies=-1&src=cartpage" > - </a> 
			<span style="float:right; padding-right:10px"> ${cart.getCopies(book)}</span></p>
			<a href="/addToCart?id=${book.getId()}&copies=1&src=cartpage" > + </a> 
			
	</c:forEach>
	
</body>
</html>