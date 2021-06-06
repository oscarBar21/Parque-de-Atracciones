package CDM1_Oscar.Atraccion;

/**
 * Esta clase es la clase principal de la que heredan las clases de AtraccionAdultos,AtracccionNiños,AtraccionTodoPublico
 * @author: Oscar Barragan Mateos
 * @version: 6/06/2021
 */

public class Atraccion {
	
	private String nombre;
	private int numeroAsientos;
	private int limiteAltura;
	private int limiteEdad;
	private boolean estaEstropeada;
	private boolean estallena;
	
	 /**
     * Constructor para la clase principal Atraccion
     * @param  nombre el parametro nombre devuelve el nombre de la atraccion, 
     * @param  numeroAsientos el parametro numeroAsientos devuelve el numero de asientos de la atraccion, 
     * @param  limiteAltura el parametro limiteAltura devuelve el limite de altura de la persona para subirse a la atraccion, 
     * @param  limiteEdad el parametro limiteEdad devuelve el limite de edad de la persona para subirse a la atraccion
     * @param  estaEstropeada el parametro estaEstropeada devuelve si la atraccion esta estropeada o no, 
     * @param  estaLlena el parametro estaLlena devuelve si la atraccion esta llena o no 
     */
	
	public Atraccion(String nombre, int numeroAsientos, int limiteAltura, int limiteEdad, boolean estaEstropeada, boolean estallena) {
		this.numeroAsientos = numeroAsientos;
		this.limiteAltura = limiteAltura;
		this.limiteEdad = limiteEdad;
		this.estaEstropeada = estaEstropeada;
		this.estallena = estallena;
	}
	
	public String getnombre() {
		return nombre;
	}

	public void setnombre (String nombre) {
		this.nombre = nombre;
	}
	
	public int getnumeroAsientos() {
		return numeroAsientos;
	}

	public void setnumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}
	
	public int getlimiteAltura() {
		return limiteAltura;
	}

	public void setlimiteAltura(int limiteAltura) {
		this.limiteAltura = limiteAltura;
	}

	public int getlimiteEdad() {
		return limiteEdad;
	}

	public void setlimiteEdad(int limiteEdad) {
		this.limiteEdad = limiteEdad;
	}
	
	public boolean getestaEstropeada() {
		return estaEstropeada;
	}

	public void setestaEstropeada(boolean estaEstropeada) {
		this.estaEstropeada = estaEstropeada;
	}
	
	public boolean getestallena() {
		return estallena;
	}

	public void setestllena(boolean estallena) {
		this.estallena = estallena;
	}
	
}
