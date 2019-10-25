import java.util.ArrayList;
import java.util.List;

public class ManipulerFichiers {

	public static void main(String[] args) {

		Fichier file1 = new Fichier("file1", 26);
		Fichier file2 = new Fichier("file2", 6);
		
		Dossier	sdB = new Dossier("Sous-Dossier B", new ArrayList<FileComposite>());
		Dossier	sdA = new Dossier("Sous-Dossier A", new ArrayList<FileComposite>());

		List<FileComposite> dossier1List = new ArrayList<FileComposite>();
		dossier1List.add(file1); 
		dossier1List.add(sdB); 
		dossier1List.add(sdA);
		Dossier	dossier1 = new Dossier("Dossier 1", dossier1List);


		List<FileComposite> sdClist = new ArrayList<FileComposite>();
		sdClist.add(file2); 
		Dossier	sdC = new Dossier("Sous-Dossier C", sdClist);

		List<FileComposite> dossier2List = new ArrayList<FileComposite>();
		dossier2List.add(sdC); 
		Dossier	dossier2 = new Dossier("Dossier 2", dossier2List);

		List<FileComposite> testList = new ArrayList<FileComposite>();
		testList.add(dossier1);
		testList.add(dossier2); 
		Dossier	test = new Dossier("test", testList);

		test.afficher();

	}

}
