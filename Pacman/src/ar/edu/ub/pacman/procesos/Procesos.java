package ar.edu.ub.pacman.procesos;

import ar.edu.ub.pacman.data.*;

public class Procesos {
	
	final char ARRIBA 		= 'W';
	final char ABAJO 		= 'S';
	final char DERECHA 		= 'D';
	final char IZQUIERDA 	= 'A';
	
	public void generarTablero(Laberinto[][] tablero) {
		for(int fila =0;fila<5;fila++) {
			for(int columna =0;columna<5;columna++) {
				tablero[fila][columna] = new Laberinto();
				tablero[fila][columna].desocuparCelda();
			}
		}
	}
	
	
	public void ponerEnTablero(Pacman pacman,Direccion dir, String dato, Laberinto[][] tablero) {
		
		switch(dato.charAt(0)) {
		
		case  ARRIBA:
			
			pacman.indicarDireccion(dir.arriba());
			
			limpiar_celda(tablero,pacman.obtenerFila(),pacman.obtenerColumna());
			
			if(pacman.obtenerFila() > 0 ) {
				
				moverPacman( pacman , -1 , 0 );
				
			}else {
				
				moverPacman( pacman , 4 , 0 );
				
			}
			break;
		case  DERECHA:
			pacman.indicarDireccion(dir.derecha());
			
			limpiar_celda(tablero,pacman.obtenerFila(),pacman.obtenerColumna());
			
			if(pacman.obtenerColumna() < 4) {
				
				moverPacman( pacman , 0 , 1 );
				
				//pacman.indicarColumna(pacman.obtenerColumna()+1);
				
			}else {
				
				moverPacman( pacman , 0 , -4 );
			}
			
			break;
		case  ABAJO:
			pacman.indicarDireccion(dir.abajo());
			
			limpiar_celda(tablero,pacman.obtenerFila(),pacman.obtenerColumna());
			
			if(pacman.obtenerFila() < 4) {
				
				moverPacman( pacman , 1 , 0 );
				//pacman.indicarFila(pacman.obtenerFila()+1);
				
			}else {
				
				moverPacman( pacman , -4 , 0 );
				
			}
			
			break;
			
		case  IZQUIERDA:
			pacman.indicarDireccion(dir.izquierda());
			
			limpiar_celda(tablero,pacman.obtenerFila(),pacman.obtenerColumna());
			
			if(pacman.obtenerColumna() > 0) {
				
				moverPacman(pacman,0,-1);
				
				//pacman.indicarColumna(pacman.obtenerColumna()-1);
			}else {
				
				moverPacman(pacman,0,4);
				
			}
			
			break;
		}
		
		
		tablero[pacman.obtenerFila()][pacman.obtenerColumna()].ocuparCelda(pacman.obtenerDireccion());
		
	}
	
	
	private void moverPacman(Pacman pacman, Integer fila,Integer columna ) {
		pacman.indicarFila(pacman.obtenerFila() + fila);
		pacman.indicarColumna(pacman.obtenerColumna() + columna);
	}
	
	public void limpiar_celda(Laberinto[][] tablero, int fila,int columna) {
		tablero[fila][columna].desocuparCelda();
	}
}













