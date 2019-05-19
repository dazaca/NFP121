import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class UF4_1_ARRAYS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String matrizIngles[][] = { { "bear", "oso" }, { "cat", "gato" }, { "cheetah", "gepardo" }, { "dog", "perro" },
				{ "eagle", "�guila" }, { "fish", "pez" }, { "frog", "rana" }, { "horse", "caballo" },
				{ "lion", "le�n" }, { "lizard", "lagarto" }, { "meerkat", "suricata" }, { "monkey", "mono" },
				{ "orangutan", "orangut�n" }, { "panther", "pantera" }, { "parrot", "loro" }, { "pig", "cerdo" },
				{ "tiger", "tigre" }, { "toad", "sapo" }, { "tortoise", "tortuga" }, { "mare", "yegua" } };
		
                      Scanner lector = new Scanner(System.in);
                      String animal;
                      int aciertos= 0;
                                       
                                             
                      for(int i=0; i<matrizIngles.length; i++) 
                      {
                    	  
                    	//1 _Imprime en pantalla la palabra a traducir.
                    	System.out.println("Traduce "+  matrizIngles[i][0]+" :"); 
                    	
                    	//2 _Recoge por teclado la palabra introducida por el usuario.
                    	animal = lector.nextLine();
                        
                        
                        //3 _Compara la palabra del usuario con la traducci�n de la palabra a traducir.
                        
                        if (animal.equalsIgnoreCase(matrizIngles[i][1])) 
                        {
                        	System.out.println("Bien!");
                        	aciertos++;
                        }
                      
                        else
                        {
                        	System.out.println("No, es " + matrizIngles[i][1]);
                        }                        
                      }
                      
                      lector.close();
                      System.out.println("FIN DEL TEST");
                      System.out.println("Has tenido : " + aciertos + " aciertos");
                      System.out.println("Has tenido : " + (20-aciertos) + " aciertos");

              

	}

}
