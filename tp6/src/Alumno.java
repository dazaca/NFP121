
import java.util.ArrayList;

public class Alumno {

  private String nombre;
  private int matricula;
  private ArrayList<Calificacion> calif;
  
  
  public Alumno(String pnombre, int pmatricula, ArrayList <Calificacion> pcalif) {

	// Asignar a las propiedades nombre y matricula
	// los valores de los par�metros.
	  
	  this.nombre = pnombre;
	  this.matricula = pmatricula;
	// Construir objeto ArrayList calificaciones.
	  this.calif = pcalif;
  }

// A�adir m�todos get para las tres propiedades
// que ser�n de solo lectura.
  
	public String getNombre() {
		return nombre;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public ArrayList<Calificacion> getCalif() {
		return calif;
	}
  
   
	public void calificar(String pasignatura, int pnota) {

        // A�adir la nueva calificaci�n
		// a la colecci�n de calificaciones.
		for (Calificacion c : calif) 
		{ 
			if(c.getAsignatura()== pasignatura) 
			{
				c.setNota(pnota);
				break;				
			}
		}		
	}

 

@Override

   public String toString() {

	// Devolver una cadena similar a la de este ejemplo:
	// �Alumno matricula: 31553 - Carmen Torres�
	
	return "Alumno matricula: " + this.matricula + " - " + this.nombre;
   }

} 
