package CDM1_Oscar.Persona;

/**
 * @author: Oscar Barragan Mateos
 * @version: 6/06/2021
 */

public class Cliente extends Persona {

	private boolean tieneEntrada;
	private double altura;
	
	 /**
     * Constructor para la clase Cliente
     * @param  super el parametro super devuelve el los valores de las clase principal, 
     * @param  altuta o el parametro altura devuelve la altura de la persona
     * @param  tieneEntrada el parametro tieneEntrada devuelve si el cliente tiene entrada o no
     */
	
	public Cliente(String nombre, String apellidos, String dni, int edad, boolean tieneEntrada) {

		super(nombre, apellidos, dni, edad);
		this.tieneEntrada = tieneEntrada;
		this.altura = altura;

	}

	public boolean gettieneEntrada() {
		return tieneEntrada;
	}

	public void settieneEntrada(boolean tieneEntrada) {
		this.tieneEntrada = tieneEntrada;
	}
	
}
