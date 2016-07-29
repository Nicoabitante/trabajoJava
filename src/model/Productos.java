package model;

public class Productos {
	private int precio;
	private String nombre;
	private String material;
	private Categoria categorias;
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMaterial() {
		return material;
	}
	public Categoria getCategorias() {
		return categorias;
	}
	public void setCategorias(Categoria categorias) {
		this.categorias = categorias;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}
