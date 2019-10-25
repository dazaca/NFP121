import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {

		// Creation d'un tableau de 6 entiers
		int[] tableau = new int[6];

		// Creation d'un objet nommé "entree" de type Scanner qui permet 
		// de recuperer les valeurs saisies au clavier
		Scanner entree = new Scanner(System.in);

		System.out.println("***** Demarrage exercice 3 ********");
		System.out.println("");

		int valeurSaisie;

		for(int i=0; i<tableau.length; i++) {

			System.out.println("Saisir le nombre entier d'indice " + i);

			// Recuperation de la valeur saisie
			valeurSaisie = entree.nextInt();

			// Stockage de la valeur saisie dans le tableau
			tableau[i] = valeurSaisie;
		}

		System.out.println(" **** Affichage du plus grand element du tableau ***");

		int plusGrand = Integer.MIN_VALUE;

		for(int i=0; i<tableau.length; i++) {

			if(plusGrand < tableau[i]) {

				plusGrand = tableau[i];
			}
		}
		System.out.println("");
		System.out.println("Le plus grand element est : " + plusGrand);
		System.out.println("");
		System.out.println("****** Fin exercice 3 *******");
	}
}
