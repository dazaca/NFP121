import static java.lang.System.in;
import static java.lang.System.out;

import java.util.*;

/// Ecrire un programme qui saisit 6 entiers et les stocke dans un 
/// tableau, puis affiche le
/// contenu de ce tableau une fois qu’il est rempli.
///

public class td2_1 {

	public static void main(String[] args) {

		int a, b, res;
		int x = 6;
		int m[] = new int[x];
		int sum = 0;

		for (int i = 0; i < x; i++) {
			System.out.print("Inserte valor de [" + (i+1) + "]: ");
			Scanner clavier = new Scanner(System.in);
			m[i] = clavier.nextInt();
		}

		System.out.println("Bonjour. Voici votre tableau: " + Arrays.toString(m));
		
	}
	

}	
   