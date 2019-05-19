package e2;

public class Fiesta {

	private String tipo;
	private String fechaHora;
	private String direccion;
	private int bebidas;
	private int bocadillos;
	private int invitados;
	
	// Crea un atributo estático llamado contadorFiestas, cuyo valor se incrementará en una unidad cada vez que se construya un nuevo objeto Fiesta.
	
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
	
	// Se creará un constructor, que recibirá por medio de parámetros el tipo, fechaHora, direccion, bebidas y bocadillos. 
	// A la propiedad invitados se le asignará el valor 0 directamente.	
	public Fiesta ( String ptipo, String  pfechaHora, String pdireccion, int pbebidas, int pbocadillos) {
		
		this.tipo = ptipo;
		this.fechaHora = pfechaHora;
		this.direccion = pdireccion;
		this.bebidas = pbebidas;
		this.bocadillos = pbocadillos;
		this.invitados = 0;
		contadorFiestas ++;
	}
	
	// Se creará otro constructor que no reciba ningún parámetro. Asigna a cada propiedad valores inventados.
	public Fiesta () {
			
			this.tipo = "cumpleaños";
			this.fechaHora = "19/10/2018, 16:30 ";
			this.direccion = " Calle Pirra Nº42 28022 Madrid ";
			this.bebidas = 3;
			this.bocadillos = 4;
			this.invitados = 2;
			contadorFiestas ++;
	}
	
	//El método consultar() retornará una cadena con todos los datos de la fiesta.
	public String consultar () {
		return "El tipo de fiesta será: " + this.tipo + ". La fecha y hora será: " + this.fechaHora 
				+ ". La dirección es : " + this.direccion + ". El número de bebidas es: " 
				+ this.bebidas + ". El número de bocadillos es : " + this.bocadillos + ". El número de invitados es: " + this.invitados;
		
	}
	
	// El método invitar() sumará 1 al contador de invitados.
	
	// (Version 2 del ejercicio) Sobrecarga el método invitar para que el usuario pueda 
	// realizar más de una invitación al mismo tiempo indicando el número de invitados como argumento.
	
	public void invitar (int incrementoInvitados) {
		
		this.invitados = this.invitados + incrementoInvitados ;
		
	}
	// El método cancelarInvitación() restará 1 al contador de invitados.
	public void cancelarInivtacion() {
		
		this.invitados--;
	}
	
	// El método precioFiesta() retornará el precio de la fiesta calculado de la siguiente forma: 
	// 5 euros por cada invitado, 2 euros por cada bebida y 3 euros por cada bocadillo.
	
	public int precioFiesta () {
		
		return  (this.invitados*5) + (this.bebidas*2) + (this.bocadillos*3);
		
		
	}
	


// Crea una clase Principal (con método main) donde crearás varios objetos de la clase Fiesta utilizando varios constructores distintos. 
// Pon en práctica todos los métodos que has creado (invitar, consultar, cancelarInvitación y precioFiesta).

public static void main (String [] args )
{

Fiesta party = new Fiesta ("disfraces", "18/10/2018, 17:30", "Calle Castrillo de Madrigal 5 28037 Madrid", 4, 6);

System.out.println("Contructor con parámetros:\n");
System.out.println(party.consultar());
party.invitar(2);  
System.out.println(party.consultar());
party.cancelarInivtacion();
System.out.println(party.consultar());

System.out.println("\nContructor sin parámetros:\n");
Fiesta party2 = new Fiesta ();
System.out.println(party2.consultar());
party2.invitar(2);  
System.out.println(party2.consultar());
party2.cancelarInivtacion();
System.out.println(party2.consultar());


}


}

