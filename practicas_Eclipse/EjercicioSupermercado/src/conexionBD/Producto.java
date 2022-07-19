package conexionBD;

public class Producto {
	private int id;
	private String categoria;
	private String nombre;
	private String marca;
	private float precio_costo;
	private float precio_venta;
	private int cantidad_stock;
	
	public Producto(
			int id,
			String categoria,
			String nombre,
			String marca,
			float precio_costo,
			float precio_venta,
			int cantidad_stock) {
		
		this.id = id;
		this.categoria = categoria;
		this.nombre = nombre;
		this.marca = marca;
		this.precio_costo = precio_costo;
		this.precio_venta = precio_venta;
		this.cantidad_stock = cantidad_stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio_costo() {
		return precio_costo;
	}

	public void setPrecio_costo(float precio_costo) {
		this.precio_costo = precio_costo;
	}

	public float getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(float precio_venta) {
		this.precio_venta = precio_venta;
	}

	public int getCantidad_stock() {
		return cantidad_stock;
	}

	public void setCantidad_stock(int cantidad_stock) {
		this.cantidad_stock = cantidad_stock;
	}

	

}
