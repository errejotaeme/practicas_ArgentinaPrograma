package ejercicio3;

public class Auto {
	
	private int num_patente;
	private int modelo;
	private String color;
	private int chasis;
	
	public Auto(int num_patente, int modelo, String color, int chasis) {
		this.num_patente = num_patente;
		this.modelo = modelo;
		this.color = color;
		this.chasis = chasis;
		
	}
	
	public int getNum_patente() {
		return num_patente;
	}
	public void setNum_patente(int num_patente) {
		this.num_patente = num_patente;
	}
	
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getChasis() {
		return chasis;
	}
	public void setChasis(int chasis) {
		this.chasis = chasis;
	}

}
