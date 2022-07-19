package ejercioProductos;


import java.util.Scanner;
import java.sql.*;

public class programaAlmacen {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);
		
		
		int codigo = 0;
		String nombre = "";
		String marca = "";
		int precio = 0;
		int cantidad_stock = 0;
		
		System.out.println("Ingresar número de código del producto:");
		int tecla1 = teclado.nextInt();
		codigo = tecla1;			

		System.out.println("Ingresar nombre del producto:");
		String tecla2 = teclado.nextLine();
		while(tecla2.isEmpty()) {
			tecla2 = teclado.nextLine();			
		}
		nombre = tecla2;	
		
		
		System.out.println("Ingresar la marca del producto:");
		String tecla3 = teclado.nextLine();
		while(tecla3.isEmpty()) {
			tecla3 = teclado.nextLine();
		}
		marca = tecla3;
			
		System.out.println("Ingresar el precio del producto:");
		int tecla4 = teclado.nextInt();
		precio = tecla4;
		
		System.out.println("Ingresar la cantidad en stock del producto:");
		int tecla5 = teclado.nextInt();
		cantidad_stock = tecla5;
		
		
		Connection conexion = null;
		
		//Carga controladores
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//Establecer la conexion
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/almacen","root","[CONTRASEÑA]");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		try {
			//Creo objeto statement para peticionar a la BD
			Statement stmt = conexion.createStatement();
			stmt.executeUpdate("INSERT INTO `almacen`.`productos` (`codigo`, `nombre`, `marca`, `precio`, `cantidad_stock`) VALUES ('"+codigo+"', '"+nombre+"', '"+marca+"', '"+precio+"', '"+cantidad_stock+"')");
		
		
			//Devuelve e imprime los valores de columnas de tabla 			
			ResultSet rs = stmt.executeQuery("SELECT * FROM productos");
			while (rs.next()) {
				int co = rs.getInt("codigo");
				String no = rs.getString("nombre");
				String ma = rs.getString("marca");
				int pre = rs.getInt("precio");
				int can = rs.getInt("cantidad_stock");
				System.out.println(co+" "+no+" "+ma+" "+pre+" "+can);
			}
			
			} catch (Exception e) {
			e.printStackTrace();
			}
		
		//Cerrar la conexion (Liberar recursos)
		finally {
			try {
			if (conexion != null) {
			// liberar la conexión a la BD
			conexion.close();
			}
			} catch (Exception e) {
			e.printStackTrace();
			}
			}
		
		
		
	}

}
