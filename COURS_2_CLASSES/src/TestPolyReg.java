// Testing Mascage (ocultación) pour la méthode toString: même nom et signature égale -> OVERRIDING


public class TestPolyReg {

	public static void main(String[] args) {

		PolygoneRegulier p1 = new PolygoneRegulier (4,100);
		PolygoneRegulier p2 = new PolygoneRegulier (5,100);
		PolygoneRegulier p3 = new PolygoneRegulier (4,100);
		
		System.out.println("Poly p1 = " + p1.toString());
		System.out.println("Poly p2 = " + p2); // appel implicite de toString()
		
		Object o = p1;
		
		System.out.println(" o: " + o );

		
	}

}
