<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="pruebaServlet.Cliente"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Clientes</title>
	</head>
	<body>
		<h1>Lista de Clientes</h1>
		
		<%-- utilizo codigo Java para traer y recorrer la lista --%>
		<%
		   
			List<Cliente> listaClientes = (List) request.getSession().getAttribute("listaClientes");
			int cont=1;
			for (Cliente cli : listaClientes) {%>
			<p><b>Cliente N°<%= cont%></b></p>
			<p>Dni: <%out.print(cli.getDni());%></p>
			<p>Nombre: <%out.print(cli.getNombre());%></p>
			<p>Apellido: <%out.print(cli.getApellido());%></p>
			<p>Teléfono: <%out.print(cli.getTelefono());%></p>
		
		<%--Incremento el contadorpara mostrar
		correctamente cada numero de cliente --%>

			<%cont= cont+1;%>
			<%}%>
	</body>
</html>