<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="conexionBD.Producto"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de productos</title>
<link rel="stylesheet" type="text/css" href="css/estilos.css"/>

</head>
<body>
	<table>
		<tr>
			<td>Código</td>
			<td>Categoría</td>
			<td>Nombre</td>
			<td>Marca</td>
			<td>Cantidad en stock</td>
			<td>Precio de costo</td>
			<td>Precio de venta</td>
			
		</tr>		

		<% List<Producto> listaProductos = (List) request.getSession().getAttribute("listaProductos");%>

	    <c:forEach items="${listaProductos}" var="producto">
	        <tr>
	            <td><c:out value="${producto.id}"/></td>
	            <td><c:out value="${producto.categoria}"/></td>
	            <td><c:out value="${producto.nombre}"/></td>
	            <td><c:out value="${producto.marca}"/></td>
	            <td><c:out value="${producto.cantidad_stock}"/></td>
	            <td><c:out value="${producto.precio_costo}"/></td>
	            <td><c:out value="${producto.precio_venta}"/></td>  
	        </tr>
	    </c:forEach>
	</table>
	
	<%listaProductos.removeAll(listaProductos); %>
	<a href="formularioProductos.jsp">Volver atrás.</a>

</body>
</html>