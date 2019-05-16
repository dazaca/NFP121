import static java.lang.System.in;
import static java.lang.System.out;
import java.util.List;
import java.util.*;


// Ecrire un programme qui recherche et affiche le plus grand élément du tableau.


public class td2_3 {
	public static void main(String[] args) {

        int a;
        int last;
		int x = 6;
		
		//int m[] = new int[x];
		
		//	for (int i = 0; i < x; i++) {
		//		System.out.print("Inserte valor de [" + (i+1) + "]: ");
		//		Scanner clavier = new Scanner(System.in);
		//		m[i] = clavier.nextInt();
		//	}

		Integer[] m = new Integer[]{12,31,31,4,53,31};		

		System.out.println("Array: " + Arrays.toString(m));
                
        // On transforme l'array dans arraylist pour appliquer la méthode
        // "lastIndexOf()".
				
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(m));
		
		// Pour parcourrir la liste
		//  for (int m2aux : intList) {
		//  	System.out.println(m2aux);
		//  }
		
		System.out.println("\nEl valor asociado al elemento mayor es [" + (Collections.max(intList)) + "]");
		
	
	}
	

}	
   