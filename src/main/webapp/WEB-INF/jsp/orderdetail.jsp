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
	<h3>Il tuo ordine: <br/> ID ${order.getId()} &emsp;  Spedizione: ${order.getOrderDate()} &emsp; Consegna prevista: ${order.getDeliveryDate()} </h3> <br/>
	
	<c:forEach var="book" items="${books}" > 
		${ book.getTitle()} by ${ book.getAuthor().getName ()}  ${ book.getSurname().getName ()}, prezzo: ${ book.getPrice ()} &euro;
	</c:forEach>
</body>
</html>