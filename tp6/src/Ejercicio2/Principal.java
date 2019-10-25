
package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		
		String opcionMenu = "";
		char c = '6';
		float reca = 0F; 
		
		ArrayList <Bebida> bebida = new ArrayList <Bebida>();
	
		Scanner lector = new Scanner(System.in);
	
		/**
		 * Bucle para selecci�n de opciones.
		 * Sale cuando la opci�n es 5.
		 */
		while((opcionMenu.compareTo("5"))!= 0 ) 
		{
			System.out.println("MAQUINA DE BEBIDAS");
			System.out.println("----------------------------------");
			System.out.println("1. Coca Cola ------- 1,30 �");
			System.out.println("2. Fanta Naranja --- 1,20 �");
			System.out.println("3. Fanta Lim�n ----- 1,20 �");
			System.out.println("4. Agua ------------ 1,00 �");
			System.out.println("5. Apagar m�quina");
			System.out.println("----------------------------------");
			System.out.println("�Qu� opci�n elige?");
	
			
			opcionMenu = lector.nextLine();
			c = opcionMenu.charAt(0);
			switch (c) {
			
			case '1':
				System.out.println("Su Coca Cola, gracias.");
				bebida.add(new Bebida("Coca Cola", 1.30F));
				
				break;
			case '2':
				System.out.println("Su Fanta de Naranja, gracias.");
				bebida.add(new Bebida("Fanta de Naranja", 1.20F));
				break;
			case '3':
				System.out.println("Su Fanta de Lim�n, gracias.");
				bebida.add(new Bebida("Fanta de Lim�n",1.20F));
				break;
			case '4':
				System.out.println("Su Agua, gracias.");
				bebida.add(new Bebida("Agua", 1.00F));
				break;
			case '5':
				System.out.println("HASTA PRONTO");
				System.out.println("INFORME DE VENTAS");
				for (Bebida b : bebida) 
				{ 
					System.out.println(b.toString());
					reca = reca + b.getPrecio();
				}
				
				System.out.println("RECAUDACION : " + reca);
				
				break;

			
			default:
				
				System.out.println("OPCION INCORRECTA");
		
			}
			
		}

	}

}
