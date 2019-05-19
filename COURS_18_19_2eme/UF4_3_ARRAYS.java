import java.util.Scanner;
import java.util.StringTokenizer;

public class UF4_3_ARRAYS {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		String texto;
		String guardarCadenas [];
		guardarCadenas = new String [100];
		StringBuilder builder = new StringBuilder("");
		String builderCopy = "";
		int c=0;
		
	
		// Bucle que permite: 1. Introducir cadenas 2. Cuenta la longitud de las cadenas 3. Pone las cadenas en may�scula 4. Separa por puntos y coma.
		do  
		{
			System.out.println("Escribe un texto : ");
			texto=lector.nextLine();
			guardarCadenas[c] = texto;		
			
			if(!texto.equals("FIN"))
			{
				System.out.println("Longitud: " + texto.length());
				builder.append(texto.toUpperCase());
				builder.append(";");			
			}	
			
			c++;		
		
		} while(!texto.equals("FIN"));	

		builderCopy = builder.toString();
		StringTokenizer tokens = new StringTokenizer (builderCopy, ";");
		System.out.println(builder.toString( ));
		
		
		// Bucle para separaci�n e impresi�n de tokens.
		while (tokens.hasMoreTokens()) 
		{
			
			String subcadena = tokens.nextToken();
			System.out.println(subcadena);
		}
		
		lector.close();
	}


}