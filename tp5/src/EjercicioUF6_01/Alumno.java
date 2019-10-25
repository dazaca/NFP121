package EjercicioUF6_01;

public class Alumno extends Persona {
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	private String curso;
	
	
	
	
	@Override
	public String trabajar() {

	return  "El alumno" +  super.getNombre() + "va a estudiar para " + this.curso + "Bachillerato.";
	}
	
	public String hacerExamen() {
		return "El alumno" +  super.getNombre() + "va hacer su examen.";
	}

	@Override
	public String toString() {
		return "Alumno [Curso=" + curso + ", Nif=" + getNif() + ", Nombre=" + getNombre()
				+ ", Direccion=" + getDireccion() + ", Telefono=" + getTelefono() + "]";
	}
	
	

}
