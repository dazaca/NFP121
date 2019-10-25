import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Exo2 {

	public static void main(String[] args) {

		// Creation d'un tableau de 6 entiers
		int[] tableau = new int[6];

		// Creation d'un objet nommé "entree" de type Scanner qui permet 
		// de recuperer les valeurs saisies au clavier
		Scanner entree = new Scanner(System.in);

		System.out.println("***** Demarrage exercice 2 ********");
		System.out.println("");

		int valeurSaisie;

		for(int i=0; i<tableau.length; i++) {

			System.out.println("Saisir le nombre entier d'indice " + i);

			// Recuperation de la valeur saisie
			valeurSaisie = entree.nextInt();

			// Stockage de la valeur saisie dans le tableau
			tableau[i] = valeurSaisie;
		}

		// Recuperation de la valeur saisie pour faire la recherche
		System.out.println("Saisir le nombre entier à rechercher dans le tableau");

		// Recuperation de la valeur saisie
		valeurSaisie = entree.nextInt();

		int indice = Integer.MAX_VALUE;

		for(int i=0; i<tableau.length; i++) {
			if(tableau[i] == valeurSaisie) {
				indice = i;
			}		
		}

		System.out.println("Resultat de la recherche");

		if(indice ==  Integer.MAX_VALUE) {
			System.out.println("L'entier " + valeurSaisie + " saisie n'appartient pas au tableau");
		}
		else {
			System.out.println("L'entier " + valeurSaisie + " saisie appartient au tableau");
			System.out.println("Son indice est " + indice);
		}
		System.out.println("");
		System.out.println("****** Fin exercice 2 *******");
	}
}
