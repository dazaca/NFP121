package EjercicioUF6_01;

public class Administrativo extends Persona {
	
	private String tareas;
	
	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}

	
	@Override
	public String trabajar() {
		
	return  "El administrativo" +  super.getNombre() + "va a realizar estas tareas:" + this.tareas + ".";
	
	}
	
	public String gestionarMatricula() {
		return  "El administrativo" +  super.getNombre() + "va a gestionar una Matricula."; 
	}

	@Override
	public String toString() {
		return "Administrativo [Tareas=" + tareas + ", Nif=" + getNif() + ", Nombre=" + getNombre()
				+ ", Direccion=" + getDireccion() + ", Telefono=" + getTelefono() + "]";
	}

}
