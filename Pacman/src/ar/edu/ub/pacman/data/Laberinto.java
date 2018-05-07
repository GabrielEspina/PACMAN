package ar.edu.ub.pacman.data;

public class Laberinto {

	private Celda[][]		celda;
	Direccion pac;
	final char ARRIBA 		= 'W';
	final char ABAJO 		= 'S';
	final char DERECHA 		= 'D';
	final char IZQUIERDA 	= 'A';
	
	
	public Laberinto(int f, int c) {
		
		setCelda(new Celda[f][c]);
		
		
		for(int fila =0;fila<getCelda().length;fila++) {
			for(int columna =0;columna<getCelda()[0].length;columna++) {
				getCelda()[fila][columna] = new Celda();
				getCelda()[fila][columna].desocuparCelda();
			}
		}
		
	}

	
	@SuppressWarnings("static-access")
	public void ponerEnTablero(Pacman pacman, String dato) {
		
		switch(dato.charAt(0)) {
		
		case  ARRIBA:
			
			pacman.setDireccion(pac.PACMAN_ARRIBA);
			
			limpiar_celda(pacman.getFila(),pacman.getColumna());
			
			if(pacman.getFila() > 0 ) {
				
				moverPacman( pacman , -1 , 0 );
				
			}else {
				
				moverPacman( pacman , (getCelda().length-1) , 0 );
				
			}
			break;
		case  DERECHA:
			pacman.setDireccion(pac.PACMAN_DERECHA);
			
			limpiar_celda(pacman.getFila(),pacman.getColumna());
			
			if(pacman.getColumna() < (getCelda()[0].length-1)) {
				
				moverPacman( pacman , 0 , 1 );
				
			}else {
				
				moverPacman( pacman , 0 , -(getCelda()[0].length-1));
			}
			
			break;
		case  ABAJO:
			pacman.setDireccion(pac.PACMAN_ABAJO);
			
			limpiar_celda(pacman.getFila(),pacman.getColumna());
			
			if(pacman.getFila() < (getCelda().length-1)) {
				
				moverPacman( pacman , 1 , 0 );
				
			}else {
				
				moverPacman( pacman , -(getCelda().length-1) , 0 );
				
			}
			
			break;
			
		case  IZQUIERDA:
			pacman.setDireccion(pac.PACMAN_IZQUIERDA);
			
			limpiar_celda(pacman.getFila(),pacman.getColumna());
			
			if(pacman.getColumna() > 0) {
				
				moverPacman(pacman,0,-1);
				
			}else {
				
				moverPacman(pacman,0,(getCelda()[0].length-1));
				
			}
			
			break;
		}
		
		
		getCelda()[pacman.getFila()][pacman.getColumna()].ocuparCelda(pacman.getDireccion());
		
	}
	
	

	private void moverPacman(Pacman pacman, Integer fila,Integer columna ) {
		pacman.setFila(pacman.getFila() + fila);
		pacman.setColumna(pacman.getColumna() + columna);
	}

	public void limpiar_celda(int fila,int columna) {
		getCelda()[fila][columna].desocuparCelda();
	}


	public Celda[][] getCelda() {
		return celda;
	}

	public void setCelda(Celda[][] celda) {
		this.celda = celda;
	}
	
}
