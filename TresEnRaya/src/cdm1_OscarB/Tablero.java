package cdm1_OscarB;

public class Tablero {

	private String[][] tablero;
	
	private int filas;
	private int columnas;
	
	public Tablero() {
		tablero = new String[3][3];
		filas = tablero.length;
		columnas = tablero[0].length;
		crearTablero();
	}
	
	private void crearTablero() {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++){
				tablero[i][j] = "| _ |";
			}
		}
	}
	
	public void mostrarTablero() {
		System.out.println("    A     B     C");
		for (int i = 0; i < filas; i++) {
			System.out.print((i + 1) + " ");
			for (int j = 0; j < columnas; j++){
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
	}
	
	public boolean introducirFicha(String ficha, int fila, int columna) {
		boolean poner = false;
		
		if (tablero[fila][columna].equals("| _ |")) {
			tablero[fila][columna] = "| " + ficha + " |";
			poner = true;
		}
		return poner;
	}
	
	public String comprobarPartida() {
		int cont = 0;
		String resul = "N";
		
		
		//Comprobar tablero lleno
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++){
				if (tablero[i][j].equals("| X |") || tablero[i][j].equals("| O |")) {
					cont++;
				}
			}
		}
		if (cont == 9) {
			 resul = "T";
		}
		
		//Comprobar filas
		for (int i = 0; i < filas; i++) {
			int contX = 0, contO = 0;
			for (int j = 0; j < columnas; j++){
				if (tablero[i][j].equals("| X |")) {
					contX++;
				}
				if (tablero[i][j].equals("| O |")) {
					contO++;
				}
			}
			if (contO == 3 || contX == 3) {
				 resul = tablero[i][0].substring(2, 3);
			}
		}
		
		
		//Comprobar Columnas
		for (int i = 0; i < filas; i++) {
			int contX = 0, contO = 0;
			for (int j = 0; j < columnas; j++){
				if (tablero[j][i].equals("| X |")) {
					contX++;
				}
				if (tablero[j][i].equals("| O |")) {
					contO++;
				}
			}
			if (contO == 3 || contX == 3) {
				 resul = tablero[i][0].substring(2, 3);
			}
		}
		
		
		//Comprobar diagonales
		String prueba = "";
		for (int i = 0; i < filas; i++) {
			prueba += tablero[i][i].substring(2, 3);
		}
		if (prueba.equals("XXX") || prueba.equals("OOO")) {
			resul = prueba.substring(0, 1);
		}
		prueba = "";
		int restar = filas;
		for (int i = 0; i < filas; i++) {
			restar--;
			prueba += tablero[i][restar].substring(2, 3);
		}
		if (prueba.equals("XXX") || prueba.equals("OOO")) {
			resul = prueba.substring(0, 1);
		}
		
		
		return resul;
	}
	
}