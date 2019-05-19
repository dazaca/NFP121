package e2;

public class Fiesta {

	private String tipo;
	private String fechaHora;
	private String direccion;
	private int bebidas;
	private int bocadillos;
	private int invitados;
	
	// Crea un atributo est�tico llamado contadorFiestas, cuyo valor se incrementar� en una unidad cada vez que se construya un nuevo objeto Fiesta.
	
	public static int contadorFiestas = 0;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getBebidas() {
		return bebidas;
	}
	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}
	public int getBocadillos() {
		return bocadillos;
	}
	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}
	public int getInvitados() {
		return invitados;
	}
	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}
	
	// Se crear� un constructor, que recibir� por medio de par�metros el tipo, fechaHora, direccion, bebidas y bocadillos. 
	// A la propiedad invitados se le asignar� el valor 0 directamente.	
	public Fiesta ( String ptipo, String  pfechaHora, String pdireccion, int pbebidas, int pbocadillos) {
		
		this.tipo = ptipo;
		this.fechaHora = pfechaHora;
		this.direccion = pdireccion;
		this.bebidas = pbebidas;
		this.bocadillos = pbocadillos;
		this.invitados = 0;
		contadorFiestas ++;
	}
	
	// Se crear� otro constructor que no reciba ning�n par�metro. Asigna a cada propiedad valores inventados.
	public Fiesta () {
			
			this.tipo = "cumplea�os";
			this.fechaHora = "19/10/2018, 16:30 ";
			this.direccion = " Calle Pirra N�42 28022 Madrid ";
			this.bebidas = 3;
			this.bocadillos = 4;
			this.invitados = 2;
			contadorFiestas ++;
	}
	
	//El m�todo consultar() retornar� una cadena con todos los datos de la fiesta.
	public String consultar () {
		return "El tipo de fiesta ser�: " + this.tipo + ". La fecha y hora ser�: " + this.fechaHora 
				+ ". La direcci�n es : " + this.direccion + ". El n�mero de bebidas es: " 
				+ this.bebidas + ". El n�mero de bocadillos es : " + this.bocadillos + ". El n�mero de invitados es: " + this.invitados;
		
	}
	
	// El m�todo invitar() sumar� 1 al contador de invitados.
	
	// (Version 2 del ejercicio) Sobrecarga el m�todo invitar para que el usuario pueda 
	// realizar m�s de una invitaci�n al mismo tiempo indicando el n�mero de invitados como argumento.
	
	public void invitar (int incrementoInvitados) {
		
		this.invitados = this.invitados + incrementoInvitados ;
		
	}
	// El m�todo cancelarInvitaci�n() restar� 1 al contador de invitados.
	public void cancelarInivtacion() {
		
		this.invitados--;
	}
	
	// El m�todo precioFiesta() retornar� el precio de la fiesta calculado de la siguiente forma: 
	// 5 euros por cada invitado, 2 euros por cada bebida y 3 euros por cada bocadillo.
	
	public int precioFiesta () {
		
		return  (this.invitados*5) + (this.bebidas*2) + (this.bocadillos*3);
		
		
	}
	


// Crea una clase Principal (con m�todo main) donde crear�s varios objetos de la clase Fiesta utilizando varios constructores distintos. 
// Pon en pr�ctica todos los m�todos que has creado (invitar, consultar, cancelarInvitaci�n y precioFiesta).

public static void main (String [] args )
{

Fiesta party = new Fiesta ("disfraces", "18/10/2018, 17:30", "Calle Castrillo de Madrigal 5 28037 Madrid", 4, 6);

System.out.println("Contructor con par�metros:\n");
System.out.println(party.consultar());
party.invitar(2);  
System.out.println(party.consultar());
party.cancelarInivtacion();
System.out.println(party.consultar());

System.out.println("\nContructor sin par�metros:\n");
Fiesta party2 = new Fiesta ();
System.out.println(party2.consultar());
party2.invitar(2);  
System.out.println(party2.consultar());
party2.cancelarInivtacion();
System.out.println(party2.consultar());


}


}

