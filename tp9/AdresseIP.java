
public class AdresseIP {


	private int[] octet; 

	public AdresseIP(int o1,int o2, int o3, int o4) throws ExceptionAdrIP {
		if (o1 < 0 || o1 > 255) 
			throw new ExceptionAdrIP("valeur incorrecte pour le premier octet");
		if (o2 < 0 || o2 > 255) 
			throw new ExceptionAdrIP("valeur incorrecte pour le deuxieme octet");
		if (o3 < 0 || o3 > 255) 
			throw new ExceptionAdrIP("valeur incorrecte pour le troisieme octet");
		if (o4 < 0 || o4 > 255) 
			throw new ExceptionAdrIP("valeur incorrecte pour le quatrieme octet");
	} 
	public String toString(){
		return octet[0] + "." 
				+ octet[1] + "." 
				+ octet[2] + "."+ octet[3] ; 
	}
}
