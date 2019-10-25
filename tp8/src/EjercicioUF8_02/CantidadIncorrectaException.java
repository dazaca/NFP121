package EjercicioUF8_02;

public class CantidadIncorrectaException extends  RuntimeException {

	// Variable
	
	private int cantidad = 0;
	
	// Constructor
	public CantidadIncorrectaException (int pcantidad) {
		super ("Cantidad negativa.");
		this.cantidad = pcantidad;
	}
	
	// Sobrecarga del método ToString()

	@Override
	public String toString() {
		return "CantidadIncorrectaException [cantidad=" + cantidad + "]";
	}


}
