<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Servlets.Auto"%>
<%@ page import="java.util.*"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Autos</title>
</head>
<body>
	<h1>Lista de autos</h1>
	
	<%
	List<Auto> listaDeAutos = (List) request.getSession().getAttribute("listaDeAutos");
	for (int i=0; i<listaDeAutos.size(); i++){%>
	
		<p><b>Id: <%out.print(listaDeAutos.get(i).getId());%></b></p>
		<p>Patente: <%out.print(listaDeAutos.get(i).getPatente());%></p>
		<p>Marca: <%out.print(listaDeAutos.get(i).getMarca());%></p>
		<p>Modelo: <%out.print(listaDeAutos.get(i).getModelo());%></p>
		<p>Color: <%out.print(listaDeAutos.get(i).getColor());%></p>		
		<p>Tipo de motor: <%out.print(listaDeAutos.get(i).getTipoMotor());%></p>
		
	<%}%>

</body>
</html>