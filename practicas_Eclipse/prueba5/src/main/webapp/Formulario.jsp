<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Formulario de Prueba</title>
	</head>
	<body>
		<h1>Datos del cliente</h1>
		<form action="SvPrueba" method="POST">
			<p><label>Dni: </label><input type="text" name="dni"></p>
			<p><label>Nombre: </label><input type="text" name="nombre"></p>
			<p><label>Apellido: </label><input type="text" name="apellido"></p>
			<p><label>Teléfono: </label><input type="text" name="telefono"></p>
			<button type="submit">Enviar</button>			
		</form>
		
		<h1>Ver lista de clientes</h1>
		<p>Si desea ver todos los clientes haga click en el btón mostrar clientes</p>
		<form action="SvPrueba" method="GET">
			<button type="submit" > Mostrar Clientes</button>	
		</form>

	</body>
</html>