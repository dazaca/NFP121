import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {  
		
		// Crear un objeto Alumno, a�adirle 6 calificaciones.
		String n = "Pablo";
		int m = 12345;
		int media = 0;
		
		ArrayList<Calificacion> calif = new ArrayList <Calificacion>(6);
		
		calif.add(new Calificacion ("Matem�ticas", 50));
		calif.add(new Calificacion ("Lengua", 60));
		calif.add(new Calificacion ("Ingl�s", 80));
		calif.add(new Calificacion ("Biolog�a", 70));
		calif.add(new Calificacion ("F�sica", 40));
		calif.add(new Calificacion ("Tecnolog�a", 90));
				
		
		Alumno alum = new Alumno(n, m, calif);
		
		System.out.println(alum.toString());
		
		for (Calificacion c : calif) 
		{ 
			System.out.println(c.toString());
			media = media + c.getNota();
		}
		
		System.out.println("NOTA MEDIA : " + media/6);
		
		
	}

}
