import java.util.InputMismatchException;
import java.util.Scanner;


public class Exo6 {


	static int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};

	static int division(int indice, int diviseur){
		return tableau[indice]/diviseur;
	}
	public static void main(String[] args){
		int x=-1, y;

		try {
			Scanner entree = new Scanner(System.in);

			System.out.println("***** Demarrage exercice 6 ********");
			System.out.println("");

			System.out.println("Entrez l’indice de l’entier à diviser: ");
			x = entree.nextInt();

			System.out.println("Entrez le diviseur: ");
			y = entree.nextInt();

			System.out.println("Le résultat de la division est: " + division(x,y));
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("L'indice " + x + " doit etre strictement inferieur à " + tableau.length + " et doit etre superier ou egale à 0");
			System.out.println(e);
		}
		catch (InputMismatchException ex) {
			System.out.println("Les valeur saisie doivent etre des entiers");
			System.out.println(ex);
		}
		catch (Exception exception) {
			System.out.println(" ****** Erreur **** ");
			System.out.println(exception);
		}
		System.out.println("");
		System.out.println("****** Fin exercice 6 *******");	
	}


}
