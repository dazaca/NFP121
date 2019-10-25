package EjercicioUF8_02;

public class Consumicion {
	
	private String producto;
	private int cantidad;
	private double precio;

	public Consumicion(String pproducto, int pcantidad, double pprecio) throws CantidadIncorrectaException {

		this.producto = pproducto;
		
		if(pcantidad<=0) {
			throw new CantidadIncorrectaException (pcantidad); 
		}
			
		this.cantidad = pcantidad;
		this.precio = pprecio;
	}

	public String getProducto() {
		
		return producto;
	}

	public int getCantidad() {
		
		return cantidad;
	}

	public double getPrecio() {
		
		return precio*cantidad;
	}

	@Override

	public String toString() {
		
		return "Consumición [producto=" + producto + ", cantidad=" + cantidad + ", precio=" + precio + "]";

	}

}