import java.util.Scanner;

public class Exo1 {

	public static void main(String[] args) {

		// Creation d'un tableau de 6 entiers
		int[] tableau = new int[6];

		// Creation d'un objet nommé "entree" de type Scanner qui permet 
		// de recuperer les valeurs saisies au clavier
		Scanner entree = new Scanner(System.in);

		System.out.println("***** Demarrage exercice 1 ********");
		System.out.println("");
		int valeurSaisie;

		for(int i=0; i<tableau.length; i++) {

			System.out.println("Saisir le nombre entier d'indice " + i);

			// Recuperation de la valeur saisie
			valeurSaisie = entree.nextInt();

			// Stockage de la valeur saisie dans le tableau
			tableau[i] = valeurSaisie;
		}

		System.out.println("Affichage du contenu du tableau");

		for(int i=0; i<tableau.length; i++) {
			System.out.println("Valeur d'indice " + i + " : " + tableau[i]);
		}

		System.out.println("");
		System.out.println("****** Fin exercice 1 *******");
	}

}
