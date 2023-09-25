<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Author</title>
</head>
<body>
	<jsp:include page="navbar.jsp"/>
	<div class="container" >
		<div class="row">
			<div class="col-3">
			<img src="${author.getImgUrl()}" height="350" width="230"/>
			</div>
			<div class="col-9">
				<div class="row">
					<h2>${author.getName()} ${author.getSurname()} </h2><br/>
					<h4>Nato il ${author.getDob()}</h4>
				
				</div>
				<div class="row mb-4">
				
				</div>
				<div class="row">
					<h3> Libri</h3>
					<c:forEach var="book" items="${author.getLibriScritti()}" > 
						<p class="fs-4 pt-3" 
						style="padding-left:15px; margin-left:15px"
						>	
						${book.getTitle()}
						<span 
						style="float:right; padding-right:10px"
						> 
						${book.getPrice()} &euro; 
						</span>
						</p>
						<span style="float:right"
						>
							<a 
								href="addToCart?id=${book.getId()}&copies=1" 
								class="btn btn-primary btn-sm " 
								onclick="alert('Libro aggiunto');"
								>Aggiungi al carrello 
							</a>&emsp;
							<a 
								href="#?id=${book.getId()}" 
								class="btn btn-secondary btn-sm"
							>
								Più informazioni 
							</a>
						</span>
						
					</c:forEach>
				
				</div>
			</div>
		</div>	
	</div>
	
	
</body>
</html>