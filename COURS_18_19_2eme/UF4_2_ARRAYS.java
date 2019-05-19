import java.util.Scanner;

public class UF4_2_ARRAYS {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        Scanner lector = new Scanner(System.in);
        String texto;
        int contadormin =0;
        
        
        
		//1.Debe permitir al usuario introducir un texto por teclado.
		System.out.println("Escribe un texto: ");
		texto = lector.nextLine();
		lector.close();
		
		//2.Se mostrar� en pantalla la longitud del texto (n�mero de caracteres).
		int longitud = texto.length();
		System.out.println("Longitud: " +longitud);
		
		//3.Se mostrar� el texto en may�sculas.
		System.out.println("May�scula: " +texto.toUpperCase() );
		
		//4.Se mostrar� el texto separado por palabras (cada palabra en una l�nea) usando el m�todo split().
		String[] subcadenas= texto.split(" ");
		
		for (int i=0; i<subcadenas.length; i++) 
		{ 
			System.out.println(subcadenas[i]);		
		}

		//5.Se contar� el n�mero de letras min�sculas.
		for (int i=0; i<longitud; i++) 
		{ 
			char caracter = texto.charAt(i); 
			
			if(Character.isLowerCase(caracter))
			{
				contadormin++;
			}			
		}
		
		System.out.println("Hay " + contadormin + " min�sculas");
		
		//6. Se mostrar� un tri�ngulo con el texto introducido.
		System.out.println("EL TRIANGULO");
		
		for(int j=texto.length(); j>=1; j--)        	
        {
         System.out.println(texto.substring(0, j));
        }
		
	}
}

		
		
		
	

