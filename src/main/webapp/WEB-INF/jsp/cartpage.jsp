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
			<p 
				class="text-light bg-dark fs-4" 
				style="padding-left:15px;margin-left:15px"
			>	
				${book.getTitle()} 
				&emsp;&emsp;
				${book.getPrice()}  &euro;&emsp;&emsp;
				${cart.getTotalPrice(book)}  &euro;
				<span style="float:right; padding-right:10px"> 
					<a 
						href="/addToCart?id=${book.getId()}&copies=-1&src=cartpage" 
						class="btn btn-outline-warning btn-sm border-0"
						style="margin-bottom:10%;height:0.8rem !important;padding-bottom:30%"
					>
						<b >- </b>
					</a> 
					
						${cart.getCopies(book)}
					
					<a
						href="/addToCart?id=${book.getId()}&copies=1&src=cartpage"
						class="btn btn-outline-warning btn-sm border-0" 
						style="margin-bottom:10%;height:0.8rem !important;padding-bottom:30%"
					>
						<b>+</b> 
					</a> 
				</span>
			</p>
	</c:forEach>
	
</body>
</html>