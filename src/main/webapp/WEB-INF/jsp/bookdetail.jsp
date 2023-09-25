<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>${book.getTitle()}</title>
</head>
<body>
	<jsp:include page="navbar.jsp"/>
	<div class="container" >
		<div class="row">
			<div class="col-3">
			<img src="${book.getImgUrl()}" height="350" width="230"/>
			
			</div>
			<div class="col-6" >
				<p> <h1> ${book.getTitle()} </h1></p>
				<p> &emsp;&emsp;By ${book.getAuthor().getName()} ${book.getAuthor().getSurname()}</p> <br/>
				<p style="font-size:small">  ${book.getSynopsis()} </p>
			</div>
			<div class="col-3">
				&emsp; Aggiungi al carrello
				<a 
					href="addToCart?id=${book.getId()}&copies=1" 
					class="btn btn-primary" onclick="alert('Libro aggiunto');"
				>
					<img 
					 height="350" width="230" 
					 src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSPfiyEyUu7m0sMGNsojpruW5LpicC2UEkWQ&usqp=CAU"/>
				</a>
			</div>
		</div>
	
	
	</div>
</body>
</html>