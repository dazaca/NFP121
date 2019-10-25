package EjercicioUF6_01;

public class Profesor extends Persona {
	

	private String competencias;
		
	@Override
	public String trabajar() {
		return  "El profesor" + super.getNombre() + "va a impartir su clase.";
	}

	public String ponerNotas() {
		return  "El profesor" + super.getNombre() + "va a corregir examenes.";
	}

	@Override
	public String toString() {
		return "Profesor [ Competencias=" + competencias + ", Nif=" + getNif() + ", Direccion="
				+ getDireccion() + ", Telefono=" + getTelefono() + "]";
	}

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}
	
	
	
}
