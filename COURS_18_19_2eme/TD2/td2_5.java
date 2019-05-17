import static java.lang.System.in;
import static java.lang.System.out;
import java.util.List;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.*;


// Écrire un programme qui à partir d'une chaîne de caractèress, 
// affiche "vrai" sisest un palindrome, et "faux" sinon. 
// Un mot est un palindrome s’il peut être lu indifféremmentdans 
// les deux sens. Par exemple, "eve" et "laval" sont des palindromes.


public class td2_5 {

	public static void main(String[] args) {

		char[] m = new char[]{'a','b','a'};		
        String m2 = new String();
        m2 = "so  ros";        
        
        System.out.println("Array: " + Arrays.toString(m));
        System.out.println("\nArray 2: " + m2);
        
        // Para recorerlos hay dos formas:

        //  for (char c : m)
        //  {
        //      System.out.println(c);
        //  }
        //  
        
        //  // Otra forma:
        
        //  
        //  for (int i=0; i < m.length; i++)
        //  {
        //      System.out.println(m[i]);
        //  }

        // Al grano:
        // No es palíndromo si longitud es par:
        
        // notar que para m es m.length (sin los paréntesis)
        if (m2.length()%2 == 0)
        {
           System.out.println("Faux car longueur pair.");
        }
        else
        {
            for (int i=0; i <= ((m2.length()-1)/2); i++)
            {
                if (i==((m2.length()-1)/2)){
                    System.out.println("\nVrai!");
                }
                
                // el acceso al elemento de m se haría con m[i] 
                
                if (m2.charAt(i) != m2.charAt((m2.length()-i)-1)){

                    System.out.println("\nFaux");
                    break;
                }
                
            }

        }

        

    }
}	
   