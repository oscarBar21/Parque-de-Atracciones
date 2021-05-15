package cdm1_OscarB;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args){
		
		Tablero tablero = new Tablero();
		Scanner scn = new Scanner(System.in);

		System.out.println("Nombre del jugador 1:");
		String nombre = scn.nextLine();
		Jugadores jugador1 = new Jugadores(nombre,tablero);
		System.out.println("El jugador 1 es " + nombre);
		System.out.println("");
		
		System.out.println("Nombre del jugador 2:");
		nombre = scn.nextLine();
		Jugadores jugador2 = new Jugadores(nombre,tablero);
		System.out.println("El jugador 2 es " + nombre);
		System.out.println("");
		
		
		System.out.println("Vamos a tirar los dados:");
		System.out.println("");
		boolean repetirDado = false;
		Jugadores jugadorPrimero = null;
		Jugadores jugadorSegundo = null;
		
		do {
			
			System.out.print("Tirando dado de " + jugador1.getNombre());
			int dado1 = jugador1.tirarDado();
			System.out.print("\nhas sacado " + dado1);
			System.out.println("");
			System.out.println("");
			
			System.out.print("Tirando dado de " + jugador2.getNombre());
			int dado2 = jugador2.tirarDado();
			System.out.print("\nhas sacado " + dado2);
			System.out.println("");
			System.out.println("");
		
			if (dado1 == dado2) {
				System.out.println("Vuelve a tirar los dados");
				System.out.println();
				repetirDado = true;
			}
			
			if (dado1 > dado2) {
				System.out.println("Empieza " + jugador1.getNombre());
				jugador1.setFicha("X");
				jugador2.setFicha("O");
				repetirDado = false;
				jugadorPrimero = jugador1;
				jugadorSegundo = jugador2;
			}
			
			if (dado1 < dado2) {
				System.out.println("Empieza "+ jugador2.getNombre());
				jugador2.setFicha("X");
				jugador1.setFicha("O");
				repetirDado = false;
				jugadorPrimero = jugador2;
				jugadorSegundo = jugador1;
			}
			
		}while(repetirDado);
		
		System.out.println();
		tablero.mostrarTablero();
		
		do {
			
			String coords = null;
			
			do {
				System.out.println();
				System.out.println(jugadorPrimero.getNombre() + ", introduce las coordenadas en mayusculas");
				coords = scn.nextLine();
			}while(!jugadorPrimero.movimientoFicha(coords));
			
			System.out.println();
			tablero.mostrarTablero();
			
			if (tablero.comprobarPartida() == "N") {
				
				do {
					System.out.println();
					System.out.println(jugadorSegundo.getNombre() + ", introduce las coordenadas en mayusculas");
					coords = scn.nextLine();
				}while(!jugadorSegundo.movimientoFicha(coords));
				
				System.out.println();
				tablero.mostrarTablero();
				
			}
			
		}while (tablero.comprobarPartida() == "N");
		
		
		
		String fin = tablero.comprobarPartida();
		
		switch (fin) {
			case "X" : {
				if (jugador1.getFicha().equals("X")) {
					System.out.println("Ha ganado " + jugador1.getNombre());
				}
				else {
					System.out.println("Ha ganado " + jugador2.getNombre());
				}
				break;
			}
			case "O" : {
				if (jugador1.getFicha().equals("O")) {
					System.out.println("Ha ganado " + jugador1.getNombre());
				}
				else {
					System.out.println("Ha ganado " + jugador2.getNombre());
				}
				break;
			}
			case "T" : {
				System.out.println("La partida a acabado se ha quedado en tablas");
				break;
			}
		}
		
		
		
		
	}

}
