package CDM1_Oscar.Persona;

/**
 * @author: Oscar Barragan Mateos
 * @version: 6/06/2021
 */

public class JefeDeZona extends Persona {
	
	private int salario;
	
	 /**
     * Constructor para la clase JefeDeZona
     * @param  super el parametro super devuelve el los valores de las clase principal, 
     * @param  salario el parametro salario devuelve el salario de la persona
     */
	
	public JefeDeZona(String nombre, String apellidos, String dni, int edad, String Zona, int salario) {
		super(nombre, apellidos, dni, edad);
		this.salario = salario;
	}
	
	public int getsalario() {
		return salario;
	}

	public void setsalario (int salario) {
		this.salario = salario;
	}

}
