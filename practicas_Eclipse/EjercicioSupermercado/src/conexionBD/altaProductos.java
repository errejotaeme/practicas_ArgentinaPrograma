package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class altaProductos {	

	private static List <Producto> listaProductos = new ArrayList <Producto> ();
	
    public static void agregarProducto(
    		int id, 
    		String categoria, 
    		String nombre, 
    		String marca, 
    		float precio_costo, 
    		float precio_venta, 
    		int cantidad_stock) throws Exception{
    	
    	
		Connection conexion = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermercado","root","[CONTRASEÑA]");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		try {
			Statement stmt = conexion.createStatement();
			stmt.executeUpdate("INSERT INTO `supermercado`.`productos` (`id`, `categoria`,`nombre`, `marca`, `cantidad_stock`, `precio_costo`, `precio_venta`) VALUES ('"+id+"', '"+categoria+"','"+nombre+"', '"+marca+"','"+cantidad_stock+"', '"+precio_costo+"', '"+precio_venta+"')");
			} catch (Exception e) {
			e.printStackTrace();
			}
		
		finally {
			try {
			if (conexion != null) {
			conexion.close();
			System.out.println("Cerrada la conexión con la BD. \n\n");
			}
			} catch (Exception e) {
			e.printStackTrace();
			}
			}	
    }
    
    public static List<Producto> traerProductos() {    	
    	
    	Connection conexion = null;
    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermercado","root","[CONTRASEÑA]");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		try {
			Statement stmt = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);	
			ResultSet rs = stmt.executeQuery("SELECT * FROM supermercado.productos");

			while (rs.next()) {
				int id = rs.getInt("id");
				String categoria = rs.getString("categoria");
				String nombre = rs.getString("nombre");
				String marca = rs.getString("marca");
				int cantidad_stock = rs.getInt("cantidad_stock");
				float precio_costo = rs.getInt("precio_costo");
				float precio_venta = rs.getInt("precio_venta");
				
				listaProductos.add(new Producto(id, categoria, nombre, marca, precio_costo, precio_venta, cantidad_stock));
			}
			
			
			} catch (Exception e) {
			e.printStackTrace();
			}
		
		finally {
			try {
			if (conexion != null) {
			conexion.close();
			System.out.println("Cerrada la conexión con la BD. \n\n");
			}
			} catch (Exception e) {
			e.printStackTrace();
			}
			}
		
		return listaProductos;
    	
    	
    }
}
