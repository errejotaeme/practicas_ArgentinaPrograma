<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>INGRESO DE PRODUCTOS</title>
<link rel="stylesheet" type="text/css" href="css/estilos.css"/>
</head>
<body>

	<div class="contenedor">
		<h1>Alta nuevo producto</h1>
		<form action="SvProductos" method="POST">
			<p><label>1. Id: </label><input type="number" name="id" pattern="[0-9]+" required></p>
			<p><label>2. Categoría: </label> 
				<input type="radio" name="categoria" value="perecedero" required> Perecedero<br>
				<input type="radio" name="categoria" value="no_perecedero"> No perecedero<br>
				<input type="radio" name="categoria" value="otros"> Otras categorías</p>
				
			<p><label>3. Nombre del producto: </label><input type="text" name="nombre" required></p>
			<p><label>4. Marca: </label><input type="text" name="marca" required></p>
			<p><label>5. Precio de costo: $</label><input type="number" name="precio_costo" step=".01" required></p>
			<p><label>6. Precio de venta: $</label><input type="number" name="precio_venta" step=".01" required></p>
			<p><label>7. Cantidad en stock: </label><input type="number" name="cantidad_stock" pattern="[0-9]+" required></p>
			
			<button type="submit">Dar de alta</button>			
		</form>
		
				<h1>Ver lista de Productos</h1>
		<p>Si desea ver todos los prodcutos haga click en el botón Ver Productos</p>
		<form action="SvProductos" method="GET">
			<button type="submit">Ver Productos</button>	
		</form>
		
		</div>

</body>
</html>