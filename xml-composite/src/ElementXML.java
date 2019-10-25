
public abstract class ElementXML {


	private String tag;	

	// Attribut permettant de stocker 
	// le niveau de profondeur de l'element
	private int niveau;

	public ElementXML() {
		this.tag = "";
		this.niveau = 0;
	}

	public ElementXML(String tag) {
		this.tag = tag;
		this.niveau = 0;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}


	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
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

	public void afficher() {
		System.out.println(this.toString());
	}

}
