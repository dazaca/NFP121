package Ejercicio2;

public class Bebida {

	// Asignar a las propiedades tipo de bebida "bebida" y
	// precio "precio".
    private String bebida;
    private float precio;

    // Constructor
    public Bebida(String pbebida, float pprecio) {

      this.bebida = pbebida;
      this.precio = pprecio;
    }

    // Getters y setters
    public float getPrecio() {

    	return this.precio;
    }

    public String getBebida() {

    	return this.bebida;
    }

    // Sobreescribimos el método "toString()".
    @Override    
    public String toString() {

          return "Servicio [bebida=" + bebida + ", precio=" + precio + "]";

    }

}