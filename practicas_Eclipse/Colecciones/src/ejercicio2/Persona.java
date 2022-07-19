package ejercicio2;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int celular;
	private int edad;
	
	
	public Persona(String nombre, String apellido, int celular, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.edad = edad;		
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre)  {
		this.nombre = nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	public void setApellido(String apellido)  {
		this.apellido = apellido;
	}

	public int getCelular(){
		return celular;
	}
	public void setNombre(int celular)  {
		this.celular = celular;
	}

	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad)  {
		this.edad = edad;
	}
}
