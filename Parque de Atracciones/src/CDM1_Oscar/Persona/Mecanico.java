package CDM1_Oscar.Persona;

/**
 * @author: Oscar Barragan Mateos
 * @version: 6/06/2021
 */

public class Mecanico extends Persona{
	private int salario;
	private boolean estaOcupado;
	
	 /**
     * Constructor para la clase Mecanico
     * @param  super el parametro super devuelve el los valores de las clase principal, 
     * @param  salario el parametro salario devuelve el salario de la persona
     * @param  estaOcupado el parametro estaOcupado devuelve si el mecanico esta ocupado o no
     */
	
	public Mecanico(String nombre, String apellidos, String dni, int edad, int salario, boolean estaOcupado) {
		
		super(nombre, apellidos, dni, edad);
		this.salario = salario;
		this.estaOcupado = estaOcupado;
	}
	public int getsalario() {
		return salario;
	}

	public void setsalario (int salario) {
		this.salario = salario;
	}
	
	public boolean getestaOcupado() {
		return estaOcupado;
	}
	
	public void setestaOcupado (boolean estaOcupado) {
		this.estaOcupado = estaOcupado;
	}
}
