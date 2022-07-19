package programaYoutuber;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProgramaVideos {

	public static void main(String[] args) {
		
		//Lista que almacenará los videos para dsp imprimirlos
		List <Video> listaVideos = new ArrayList <Video> ();
		
		//Creo la conexión
		//RECORDAR: properties>
		Connection conexion = null;
		
		//Carga controladores
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//Establecer la conexion
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtuber","root","[CONTRASEÑA]");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		//Operacion sobre la BD
		try {
			Statement stmt = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);	
			
			// Va con el if
			//ResultSet rs = stmt.executeQuery("SELECT * FROM videos");
			
			//Inserto null en las fechas de subida de los videos en los que no se chequearon
			stmt.executeUpdate("UPDATE videos SET fecha_subido = null WHERE chequeado = 0");
			ResultSet rs = stmt.executeQuery("SELECT * FROM videos");
			
			//Recorre la tabla 
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				Date fecha = rs.getDate("fecha_subido");
				boolean chequeado = rs.getBoolean("chequeado");

				//elimina las filas que cumplen la condicion booleana
				//Luego agrega a la lista para poder imprimir los que quedaron
				/*if(chequeado == true) {
					rs.deleteRow();
				}else {*/			
				listaVideos.add(new Video(id, nombre, fecha, chequeado));
			}
			} catch (Exception e) {
			e.printStackTrace();
			}
		
		finally {
			try {
			if (conexion != null) {
			// liberar la conexión a la BD
			conexion.close();
			System.out.println("Cerrada la conexión con la BD. \n\n");
			}
			} catch (Exception e) {
			e.printStackTrace();
			}
			}
		
		System.out.println("Lista de videos: \n\nId   Nombre  FechaDeSubida     Chequeado");
		for (int i=0; i<listaVideos.size(); i++) {
				System.out.println(listaVideos.get(i).getId()+" "+ listaVideos.get(i).getNombre()+ " "+listaVideos.get(i).getFecha_subido()+ " "+listaVideos.get(i).isChequeado());				
		}
		
		

	}

}
