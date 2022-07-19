package programaYoutuber;

import java.util.Date;

public class Video {
	
	private int id;
	private String nombre;
	private Date fecha_subido;
	private boolean chequeado;
	
	public Video(int id, String nombre, Date fecha_subido, boolean chequeado) {
		this.id= id;
		this.nombre = nombre;
		this.fecha_subido = fecha_subido;
		this.chequeado = chequeado;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Date getFecha_subido() {
		return fecha_subido;
	}
	public void setFecha_subido(Date fecha_subido) {
		this.fecha_subido = fecha_subido;
	}

	public boolean isChequeado() {
		return chequeado;
	}

	public void setChequeado(boolean chequeado) {
		this.chequeado = chequeado;
	}
	
	

}
