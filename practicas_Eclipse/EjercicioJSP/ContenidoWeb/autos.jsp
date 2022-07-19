<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>Formulario autos</title>
	</head>
	<body>
		<h1>Datos del auto</h1>
		<form action="SvAutos" method="POST">
			<p><label>Id: </label><input type="text" name="id"></p>
			<p><label>Patente: </label><input type="text" name="patente"></p>
			<p><label>Marca: </label><input type="text" name="marca"></p>
			<p><label>Modelo: </label><input type="text" name="modelo"></p>
			<p><label>Color: </label><input type="text" name="color"></p>
			<p><label>Tipo de motor: </label><input type="text" name="tipoMotor"></p>
			
			<button type="submit">Enviar</button>			
		</form>
		
		
		<h1>Ver lista de autos</h1>
		<p>Si desea ver todos los autos haga click en el botón Ver Autos</p>
		<form action="SvAutos" method="GET">
			<button type="submit">Ver Autos</button>	
		</form>
	</body>
</html>