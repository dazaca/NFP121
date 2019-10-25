import java.util.ArrayList;
import java.util.List;

public class Dossier extends FileComposite {

	private List<FileComposite> elementsEnfants;

	public Dossier() {
		super();
		this.elementsEnfants = new ArrayList<FileComposite>();
	}

	public Dossier(String nom, List<FileComposite> listElement) {
		super(nom);
		this.elementsEnfants = listElement;
	}

	public List<FileComposite> getElementsEnfants() {
		return elementsEnfants;
	}

	public void setElementsEnfants(List<FileComposite> elementsEnfants) {
		this.elementsEnfants = elementsEnfants;
	}

	@Override
	public String toString() {

		// A chaque niveau, on ajoute l'indentation
		String result = this.indentation() + "|-" + super.getNom()  + "\n";

		for(int i=0; i<this.elementsEnfants.size(); i++) {

			this.elementsEnfants.get(i).setNiveau(this.getNiveau()+1);

			result = result + elementsEnfants.get(i).toString();
		}
		return result;
	} 
}
