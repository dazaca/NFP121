
public class Calificacion {

	private String asignatura;
	private int nota; // Valor de 0 a 100

	// Constructor que reciba argumentos para las dos propiedades
	public Calificacion (String pasignatura, int pnota){
		this.asignatura = pasignatura;
		this.nota = pnota;
	}
	
	
	// Métodos get/set
	public String getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}


	public int getNota() {
		return nota;
	}


	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	@Override

	public String toString() {
	// Devolver una cadena de tipo: “Lengua: 55”
		return this.asignatura + ": " + this.nota ;

	}


	
}