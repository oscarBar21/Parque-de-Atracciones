package CDM1_Oscar.Persona;

/**
 * Esta clase es la clase principal de la que heredan las clases de Directos,Jefe,Mecanico,Cliente
 * @author: Oscar Barragan Mateos
 * @version: 6/06/2021
 */

public class Persona{

	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	
	 /**
     * Constructor para la clase principal persona
     * @param  nombre el parametro nombre devuelve el nombre de la persona, 
     * @param  apellidos el parametro apellidos devuelve los apellidos de la persona, 
     * @param  dni el parametro dni devuelve el dni de la persona, 
     * @param  edad el parametro edad devuelve la edad de la persona
     */
	
	public Persona(String nombre, String apellidos, String dni, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
