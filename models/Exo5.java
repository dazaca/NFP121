import java.util.Scanner;

public class Exo5 {

	public static void main(String[] args) {


		// Creation d'un objet nommé "entree" de type Scanner qui permet 
		// de recuperer les valeurs saisies au clavier
		Scanner entree = new Scanner(System.in);

		System.out.println("***** Demarrage exercice 5 ********");
		System.out.println("");


		System.out.println("Saisir la chaine de caracteres ");

		// Recuperation de la valeur saisie
		String valeurSaisie = entree.next();

		int taille = valeurSaisie.length();

		boolean estPalyndrome = true;

		// On compare le premier caractere au dernier caractere, ainsi de suite jusqu'au milieu du mot
		for(int i=0; i<taille/2; i++) {

			if(valeurSaisie.charAt(i) != valeurSaisie.charAt(taille-1-i)) {
				System.out.println("FAUX");
				System.out.println("Le mot saisie " + valeurSaisie + " n'est pas un palyndrome");
				estPalyndrome = false;
				break;
			}
		}
		if(estPalyndrome) {
			System.out.println("VRAI");
			System.out.println("Le mot saisie " + valeurSaisie + " est un palyndrome");
		}

		System.out.println("");
		System.out.println("****** Fin exercice 5 *******");
	}
}
