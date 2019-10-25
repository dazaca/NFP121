package EjercicioUF6_01;

public class Principal {

	public static void main(String[] args) {
		
		Profesor profe = new Profesor();
		Alumno alumn = new Alumno();
		Administrativo admin = new Administrativo();

		
		
		// pensar en pasar AQUI.los nombres de los objetos con los setters:
		
		profe.setNombre(" Carlos ");
		alumn.setNombre(" Alicia ");
		admin.setNombre(" Rosa Torres ");

		alumn.setCurso(" 1º ");
		
		admin.setTareas(" Hacer matriculas, controlar asistencia ");
		
		profe.setCompetencias("Matemáticas y Lengua");
		
		profe.setNif(" 76419088-r ");
		alumn.setNif("75684255-m");
		admin.setNif("79429300-f");

		profe.setDireccion("Calle Carlos Paz 5 18198 Granada");
		admin.setDireccion("Calle Nervion Nº29 18198 Huetor Vega");
		alumn.setDireccion("Calle Castillo de Madrigal 28037 Madrid");
		
		profe.setTelefono("651504021");
		alumn.setTelefono("623824621");
		admin.setTelefono("684269756");
		
		
		
	
		// ...
	
		
		System.out.println(profe.toString()); 
		System.out.println(profe.trabajar() + "\n");   

		
		
		System.out.println(alumn.toString());
		System.out.println(alumn.trabajar() + "\n");

		
		
		System.out.println(admin.toString()); 
		System.out.println(admin.trabajar() + "\n");
		
		System.out.println(alumn.llamar(profe));
		
		System.out.println(profe.ponerNotas());
		
		System.out.println(alumn.hacerExamen());
		
		System.out.println(admin.gestionarMatricula());
		

		
		
		
		}


	

}
