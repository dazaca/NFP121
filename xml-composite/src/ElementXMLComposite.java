import java.util.ArrayList;
import java.util.List;

public class ElementXMLComposite extends ElementXML {


	private List<ElementXML> elementsEnfants;


	public ElementXMLComposite() {
		super();
		this.elementsEnfants = new ArrayList<ElementXML>();
	}

	public ElementXMLComposite(String tag, List<ElementXML> listElement) {
		super(tag);
		this.elementsEnfants = listElement;
	}


	public List<ElementXML> getElementsEnfants() {
		return elementsEnfants;
	}

	public void setElementsEnfants(List<ElementXML> elementsEnfants) {
		this.elementsEnfants = elementsEnfants;
	}

	@Override
	public String toString() {

		// A chaque niveau, on ajoute l'indentation avant d'ouvrir la balise
		String result = this.indentation() + "<" + this.getTag() + ">" + "\n";

		for(ElementXML el : this.elementsEnfants) {
			el.setNiveau(this.getNiveau()+1);
			result += el.toString();
		}

		// A chaque niveau, on ajoute l'indentation avant de fermer la balise
		result += this.indentation() + "</" + this.getTag() + ">" + "\n";

		return result;
	} 



}
