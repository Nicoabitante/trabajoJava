package model;

public class Cliente extends Usuario {
	private Carrito carrito= new Carrito();

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
	
	
}
