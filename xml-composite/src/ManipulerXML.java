import java.util.ArrayList;
import java.util.List;

public class ManipulerXML {

	public static void main(String[] args) {


		ElementXML elementSimple1 = new ElementXMLSimple("monTag1", "maValeur1");
		ElementXML elementSimple2 = new ElementXMLSimple("monTag2", "maValeur2");
		ElementXML elementSimple3 = new ElementXMLSimple("monTag3", "maValeur3");
		ElementXML elementSimple4 = new ElementXMLSimple("monTag4", "maValeur4");

		List<ElementXML> list1 = new ArrayList<ElementXML>();
		list1.add(elementSimple1);
		list1.add(elementSimple2);

		List<ElementXML> list2 = new ArrayList<ElementXML>();
		list2.add(elementSimple3);
		list2.add(elementSimple4);

		ElementXML elementXMLComposite1 = new ElementXMLComposite("monTagComposite1", list1);
		ElementXML elementXMLComposite2 = new ElementXMLComposite("monTagComposite2", list2);

		List<ElementXML> list3 = new ArrayList<ElementXML>();
		list3.add(elementXMLComposite1);
		list3.add(elementXMLComposite2);

		ElementXML elementXMLCompositeGlobal = new ElementXMLComposite("monTagCompositeGlobal", list3);

		elementXMLCompositeGlobal.afficher();
		
		System.out.println("***************************");
		elementSimple4.afficher();

	}

}
