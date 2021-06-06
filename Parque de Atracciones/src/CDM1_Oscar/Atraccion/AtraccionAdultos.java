package CDM1_Oscar.Atraccion;

/**
 * @author: Oscar Barragan Mateos
 * @version: 6/06/2021
 */

public class AtraccionAdultos extends Atraccion{
	
	/**
     * Constructor para la clase AtraccionAdultos
     * @param  super el parametro super devuelve el los valores de las clase principal, 
     */
	
	public AtraccionAdultos(String nombre, int numeroAsientos, int limiteAltura, int limiteEdad, boolean estaEstropeada, boolean estallena) {
		
		super(nombre, numeroAsientos, limiteAltura, limiteEdad, estaEstropeada, estallena);
		
	}
	

}
