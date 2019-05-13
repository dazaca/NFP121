
// Testing Mascage (ocultación) pour la méthode toString: même nom et signature égale -> OVERRIDING
public class PolygoneRegulier extends Object{

	private int nbCotes;
	private int longCote;
	private Position pos;
	
	PolygoneRegulier(int nCotes, int lngCote){ // Constructeur
	
		this.nbCotes = nCotes;
		this.longCote = lngCote;
		
		pos = new Position(0,0);
		//pos = this.new Position(0,0);
		
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
		
	
	private class Position{		
		private int x,y;		
		Position(int x, int y){
			this.x = x; this.y = y;
		}
	}
	


	
}
