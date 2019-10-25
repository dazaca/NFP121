
public class ElementXMLSimple extends ElementXML {

	private String valeur;
	
	public ElementXMLSimple() {
		super();
		this.valeur = "";
	}
	
	public ElementXMLSimple(String tag, String valeur) {
		super(tag);
		this.valeur = valeur;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return this.indentation() + "<" + super.getTag() + ">" + this.valeur + "</" + super.getTag() + ">" + "\n";
	} 
}
