package EjercicioUF8_02;

import java.util.ArrayList;
import java.util.Scanner;



public class Principal {
	
	public static void main(String[] args) {
	
		
		String entradaTecladoProducto = "";
		String entradaTecladoPrecio = "";
		String entradaTecladoCantidad = "";
		String entradaTecladoConfirmacion = "";
		int i = 0;
		double d = 0.0;

		
		double reca = 0.0; 
		ArrayList <Consumicion> consu = new ArrayList <Consumicion>();
		
		Scanner lector = new Scanner(System.in);
		
		/**
		 * Bucle para selección de opciones.
		 * Sale cuando la opción es NO.
		 */
		reiniciaIteracion: do {
			
			System.out.println("¿Qué consumición desea? ");
			entradaTecladoProducto = lector.nextLine();
			
			try {
				
				System.out.println("Precio");
				entradaTecladoPrecio = lector.nextLine();				
				d=Double.parseDouble(entradaTecladoPrecio);
				
				System.out.println("Cantidad");
				entradaTecladoCantidad = lector.nextLine();
				i=Integer.parseInt(entradaTecladoCantidad);
				
				consu.add(new Consumicion (entradaTecladoProducto,i,d));
			
			}catch(CantidadIncorrectaException | NumberFormatException e) {
				
				System.out.println("Se ha producido una excepción de tipo " + e.getClass().getName());
				System.out.println(e.getMessage());
				System.out.println(e);
				System.out.println("Intente otra vez.");
				
			}
				
			finally {
				
				System.out.println("Si desea otra consumición teclee SI:");
				entradaTecladoConfirmacion = lector.nextLine();
				continue reiniciaIteracion;				
			}
						
		} while (entradaTecladoConfirmacion.equals("SI") || 
				entradaTecladoConfirmacion.equals("SÍ") ||
				entradaTecladoConfirmacion.equals("S") || 
				entradaTecladoConfirmacion.equals("S") ||
				entradaTecladoConfirmacion.equals("s") ||
				entradaTecladoConfirmacion.equals("si") ||
				entradaTecladoConfirmacion.equals("sí"));	
		
		for (Consumicion b : consu) 
		{ 
			System.out.println(b.toString());
			reca = reca + b.getPrecio();
		}
		
		System.out.println("Aquí tiene su comida, que aproveche.\nSon: " + reca);

	}

	
}
