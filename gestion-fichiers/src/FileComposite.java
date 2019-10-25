
public abstract class FileComposite {


	private String nom;	

	// Attribut permettant de stocker 
	// le niveau de profondeur de l'element
	private int niveau;

	public FileComposite() {
		this.nom = "";
		this.niveau = 0;
	}

	public FileComposite(String nom) {
		this.nom = nom;
		this.niveau = 0;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public void afficher() {
		System.out.println(this.toString());
	}

	// Methode permettant de gerer l'indentation 
	// en fonction du nieau de profondeur
	protected String indentation() {

		String resultat = "";

		for(int i=0; i<this.getNiveau(); i++) {

			// On ajoute deux espaces pour chaque niveau
			resultat += "  ";
		}
		return resultat;
	}

}
