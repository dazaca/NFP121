import static java.lang.System.in;
import static java.lang.System.out;
import java.util.List;
import java.util.*;


// Ecrire un programme qui recherche et affiche le plus grand élément du tableau.


public class td2_4 {

	public static void main(String[] args) {

        int a;
        int last;
		int x = 6;
        Integer sum = 0;
		//int m[] = new int[x];
		
		//	for (int i = 0; i < x; i++) {
		//		System.out.print("Inserte valor de [" + (i+1) + "]: ");
		//		Scanner clavier = new Scanner(System.in);
		//		m[i] = clavier.nextInt();
		//	}

		Integer[] m = new Integer[]{1,2,3,4,5,6};		

		System.out.println("Array: " + Arrays.toString(m));
                
        // On transforme l'array dans arraylist pour appliquer la méthode
        // "lastIndexOf()".
				
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(m));
				
		for (Integer i : intList) {
        
            sum += i;            
		}
		
		System.out.println("\nEl valor medio es [" + sum.doubleValue() / intList.size() + "]");
		
	
	}
	

}	
   