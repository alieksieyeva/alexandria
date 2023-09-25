<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form new Book</title>
</head>
<body>
<jsp:include page="navbar.jsp"/>
	<form action="newbook" method="post" modelAttribute="newbook" >
	
		<input type="text" name="title" placeholder="Insert title" /> 
		<input type="text" name="synopsis" placeholder="Insert synopsis" /> 
		<input type="number" name="price" placeholder="Insert price" /> 
		<input type="number" name="numberOfPages" placeholder="Insert #Pages" /> 
		<input type="text" name="imgUrl" placeholder="Insert image URL" /> 
		<input type="number" name="authorid" placeholder="Insert the id of the author" /> 
		<input type="submit" value="Salva" />
	</form>
	<!-- POJO Plain Old Java Object         D.T.O. Data Transfer Object -->
	
	<!--  Come DIAVOLO faccio a passare un Book ad una pagina HTML se la pagina non conosce come è fatto Author, 
		che è suo padre, come faccio a recuperare qualcosa.
		Per ogni Classe TIPO creiamo un DTO, una sua versione SEMPLIFICATA
		
	 -->
</body>
</html>