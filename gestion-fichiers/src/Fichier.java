
public class Fichier extends FileComposite {


	private int taille;

	public Fichier() {
		super();
		this.taille = 0;
	}

	public Fichier(String nom, int taille) {
		super(nom);
		this.taille = taille;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	@Override
	public String toString() {
		// A chaque niveau, on ajoute l'indentation
		return this.indentation() + "|>" + super.getNom() + " (" + this.getTaille() + " bytes)\n" ;
	} 



}
