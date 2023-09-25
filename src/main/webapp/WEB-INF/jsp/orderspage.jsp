<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Orders</title>
</head>
<body>
	<jsp:include page="navbar.jsp"/>
	<div class="container text-center fs-1">
		Lista ordini
	 	</div>
	 	<div class="row">
			&nbsp; 
	 	</div>
		<div class="row" id= "colonna"> 
	  
		<div class="col-9 p-t"> 
			<c:forEach var="order" items="${orders}" > 
			<p 
				class="text-light bg-dark fs-4" 
				style="padding-left:15px; margin-left:15px"
			>	ID ${order.getId()} &emsp;  Spedizione: ${order.getOrderDate()} &emsp; Consegna prevista: ${order.getDeliveryDate()} 
			</p>
			
			</c:forEach>
		</div>
		<div class="col-3">
		<c:forEach var="order" items="${orders}" > 
					<p><a href="orderdetail?id=${order.getId()}" class="btn btn-primary">Più informazioni</a></p>
			
		</c:forEach>
		</div>
	</div>
</body>
</html>