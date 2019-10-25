package EjercicioUF8_01;

import java.util.Scanner;
public class Principal {

	public static void main(String args[])  throws NumerosRojosException {

		Scanner lector = new Scanner(System.in);
		System.out.println("Vamos a crear una cuenta y realizar el primer ingreso de 100 euros");
		CuentaBancaria miCuenta = new CuentaBancaria (38143, "Amelia González");
		
		try { //Aquí comienza el bloque de Try para el control de la excepcion asociada al método "agregarMovimiento"
			
			miCuenta.agregarMovimiento("Ingreso inicial", 100);		
			System.out.println("Cuánto dinero deseas retirar: ");		
			int dinero;		
			dinero = Integer.parseInt(lector.nextLine());		
			miCuenta.agregarMovimiento("Retirada de fondos", -dinero);
			
		} catch (NumerosRojosException e) {
		
			System.out.println(e.getMessage());
			System.out.println(e.toString());			
		}
		
		lector.close();

		System.out.println(miCuenta);
		System.out.println(miCuenta.listarMovimientos());

	}

}


