package EjercicioUF8_01;

// Se ha creado la clase de tipo de excepci�n comprobada para el control de saldos en negativo.

public class NumerosRojosException extends Exception{

	private double controlSaldo;
	
	public NumerosRojosException (double pcontrolSaldo) {
		
		super("Tu cuenta se encuentra en descubierto (N�meros Rojos)");
		this.controlSaldo = pcontrolSaldo;
	}

	@Override
	public String toString() {
		return "NumerosRojosException [controlSaldo=" + controlSaldo + "]";
	}

}
