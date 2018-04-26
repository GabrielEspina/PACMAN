package ar.edu.ub.pacman.consola;

import java.util.Scanner;

import ar.edu.ub.pacman.data.Laberinto;

public class Consola {
	//METODOS PARA INTERACTUAR CON EL USUARIO
	Scanner read = new Scanner(System.in);
	
	public void mostrarDirecciones() {
		this.explicarReglas();
		this.separador();
		System.out.println("\tW\n"
							+"\tv\n"
							+"A>\t\t<D\n"
							+"\t^\n"
							+"\tS");
		
		this.separador();
		
	}
	
	public void mostrarTablero(Laberinto [][] tablero) {
		
		System.out.println("Para salir presione Q");
		for(int i = 0;i<11;i++) {
			System.out.print("--");
		}
		System.out.print("\n|  ");
		for(int fila =0;fila<5;fila++) {
			
			for(int columna =0;columna<5;columna++) {
				System.out.print(tablero[fila][columna].obtenerCelda());
				if (columna != 4) {
					System.out.print("   ");
				}
			}
			
			System.out.println("|  ");
			if(fila != 4)
				System.out.print("|  ");
		}
		
		for(int i = 0;i<11;i++) {
			System.out.print("--");
		}
	}
	
	public void limpiarPantalla() {
		for(int i=0;i<100;i++) {
			System.out.println();
		}
	}
	
	public String pedirDato() {
		System.out.println();
		System.out.println();
		System.out.print("Mover: ");
		return read.next().toUpperCase();
	}
	
	public void separador() {
		System.out.println("-------------------------");
	}
	public void explicarReglas() {
		System.out.println("Presionando las teclas WASD, se mueve PACMAN por el laberinto:");
		System.out.println("Luego presionar la tecla ENTER para reproducir el movimiento");
		System.out.println("El juego termina si se sale del tablero");
	}
	
	public void esperarUsuario() {
		System.out.println("Ingrese cualquier tecla para comenzar, luego ENTER..");
		read.next();
	}
}
