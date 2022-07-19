package ejercicio1;

public class Mascota {
	
	private String nombre;
	private String especie;
	private String sexo;
	private String color;
	private String pelaje;
	private String raza;
	
	//Constructor
	public Mascota(String nombre, String especie, String sexo, String color, String pelaje, String raza) {
		this.nombre = nombre;
		this.especie = especie;
		this.sexo = sexo;
		this.color = color;
		this.pelaje = pelaje;
		this.raza = raza;
	}

	//Setters y getters
	
	//Nombre	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Especie
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	//Sexo
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//Color
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//Pelaje
	public String getPelaje() {
		return pelaje;
	}
	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}
	
	//Raza
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}


}
