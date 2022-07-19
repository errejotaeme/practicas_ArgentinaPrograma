package Servlets;

public class Auto {
	private String id;
	private String patente;
	private String marca;
	private String modelo;
	private String color;
	private String tipoMotor;
	
	public Auto(String id, String patente, String marca, String modelo, String color, String tipoMotor) {
		this.id = id;
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipoMotor = tipoMotor;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPatente() {
		return patente;
	}
	
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String getTipoMotor() {
		return tipoMotor;
	}
	
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

}
