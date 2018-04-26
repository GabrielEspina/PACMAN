import ar.edu.ub.pacman.consola.Consola;
import ar.edu.ub.pacman.data.*;


import ar.edu.ub.pacman.procesos.Procesos;

public class Aplication {

	public static void main(String[] args) {
		Consola 		console = 	new Consola();
		Direccion 		dir 	=	new Direccion();
		Pacman			pacman 	=	new Pacman();
		Laberinto[][]	tablero = 	new Laberinto[5][5];
		Procesos 		proc	=	new Procesos();
		
		String dato;
		
		console.limpiarPantalla();
		console.mostrarDirecciones();
		console.esperarUsuario();
		
		proc.generarTablero(tablero);
		
		tablero[pacman.obtenerFila()][pacman.obtenerColumna()].ocuparCelda(pacman.obtenerDireccion());
		
		do {
			
			console.limpiarPantalla();
			console.mostrarTablero(tablero);
			dato = console.pedirDato();
			proc.ponerEnTablero(pacman,dir,dato,tablero);
		}while(!dato.equals("Q"));
	}
}