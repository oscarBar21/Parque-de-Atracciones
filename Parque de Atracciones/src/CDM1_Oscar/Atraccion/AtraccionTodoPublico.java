package CDM1_Oscar.Atraccion;

/**
 * @author: Oscar Barragan Mateos
 * @version: 6/06/2021
 */

public class AtraccionTodoPublico extends Atraccion{

	/**
     * Constructor para la clase AtraccionTodoPublico
     * @param  super el parametro super devuelve el los valores de las clase principal, 
     */
	
	public AtraccionTodoPublico(String nombre, int numeroAsientos, int limiteAltura, int limiteEdad, boolean estaEstropeada, boolean estallena) {
		
		super(nombre, numeroAsientos, limiteAltura, limiteEdad, estaEstropeada, estallena);
		
	}



}
