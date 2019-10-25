import com.itt.libreria.*;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autor filosofo = new Autor("Descartes", "bio1");
		Libro volumen1 = new Libro("Discurso", "Filosofia", filosofo);
		
		// Invoca al m�todo toString() del nuevo objeto Libro.
		System.out.println(volumen1.toString()+"\n");
		
		//Modifica la biograf�a del autor a trav�s del objeto Libro que has creado.
		
		filosofo.setBiografia("miBiografia");
		
		//Invoca al m�todo toString() del objeto Autor que has creado de dos formas distintas: 
		//a partir de la referencia al objeto Libro y a partir de la referencia al objeto Autor que creaste.
		
		filosofo.toString();
		volumen1.toString();
		
		//Modifica el valor de la propiedad genero y vuelve a invocar al m�todo toString() para ver los cambios.
		volumen1.setGenero("Terror");
		System.out.println(volumen1.toString());	

	}

}
