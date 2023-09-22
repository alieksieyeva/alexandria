<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
 import="java.util.List,com.generation.alexandria.model.entities.*"
 %>
    
<%
	List<Prova> lista = (List<Prova>)
								request.getAttribute("test");

%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<% for(Prova s:lista )
	{
	%>	<%=s.getId()%> <br/>
	<%
	}
	%>
</body>
</html>