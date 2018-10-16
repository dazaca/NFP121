
// Testing Mascage (ocultación) pour la méthode toString: même nom et signature égale -> OVERRIDING
public class PolygoneRegulier extends Object{

	private int nbCotes;
	private int longCote;
	
	PolygoneRegulier(int nCotes, int lngCote){ // Constructeur
	
		this.nbCotes = nCotes;
		this.longCote = lngCote;
	}
		
	public String toString(){
		
		return "<" + this.nbCotes + "," + this.longCote + ">";
	}
	
	/*public boolean equals(PolygoneRegulier poly) {
		return poly.nbCotes== this.nbCotes &&
		 poly.longCote == this.longCote;
		 }*/

	@Override
	public boolean equals( Object obj ) {
	if( ! ( obj instanceof PolygoneRegulier ) ) return false;
	PolygoneRegulier poly = ( PolygoneRegulier ) obj;
	return
	 poly.nbCotes == this.nbCotes &&
	poly.longCote == longCote;
	}

	
}
