package ar.edu.ub.pacman.consola;

import java.util.Scanner;

import ar.edu.ub.pacman.data.Laberinto;
import ar.edu.ub.pacman.data.Direccion;

public class Consola {
	//METODOS PARA INTERACTUAR CON EL USUARIO
	Scanner read = new Scanner(System.in);
	
	public void mostrarDirecciones() {
		explicarReglas();
		separador();
		System.out.println("\t"+Direccion.TECLADO_ARRIBA+"\n"
							+"\t"+Direccion.PACMAN_ARRIBA+"\n"
							+Direccion.TECLADO_IZQUIERDA + Direccion.PACMAN_IZQUIERDA +"\t\t"+Direccion.PACMAN_DERECHA+Direccion.TECLADO_DERECHA+"\n"
							+"\t"+Direccion.PACMAN_ABAJO+"\n"
							+"\t"+Direccion.TECLADO_ABAJO);
		
		separador();
		
	}
	
	public void mostrarTablero(Laberinto tablero) {
		
		System.out.println("Para salir presione Q");
		for(int i = 0;i<2*(tablero.getCelda()[0].length);i++) {
			System.out.print("--");
		}
		System.out.print("\n|  ");
		for(int fila =0;fila<tablero.getCelda().length;fila++) {
			
			for(int columna =0;columna<tablero.getCelda()[0].length;columna++) {
				System.out.print(tablero.getCelda()[fila][columna].obtenerCelda());
				if (columna != tablero.getCelda()[0].length-1) {
					System.out.print("   ");
				}
			}
			
			System.out.println("|  ");
			if(fila != tablero.getCelda().length-1)
				System.out.print("|  ");
		}
		
		for(int i = 0;i<2*(tablero.getCelda()[0].length);i++) {
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
