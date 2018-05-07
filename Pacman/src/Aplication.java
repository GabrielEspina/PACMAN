import ar.edu.ub.pacman.consola.Consola;
import ar.edu.ub.pacman.data.*;

public class Aplication {

	public static void main(String[] args) {
		
		Consola 		console = 	new Consola();
		Pacman			pacman 	=	new Pacman();
		Laberinto 		tablero = 	new Laberinto(7,20); //PASAR AL CONSTRUCTOR LAS DIMENSIONES DEL TABLERO
		
		String dato;
		
		console.limpiarPantalla();
		console.mostrarDirecciones();
		console.esperarUsuario();
	
		tablero.getCelda()[pacman.getFila()][pacman.getColumna()].ocuparCelda(pacman.getDireccion());
		
		
		do {
			
			console.limpiarPantalla();
			console.mostrarTablero(tablero);
			dato = console.pedirDato();
			tablero.ponerEnTablero(pacman,dato);
			
		}while(!dato.equals("Q"));
	}
}