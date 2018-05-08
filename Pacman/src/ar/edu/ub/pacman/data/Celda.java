package ar.edu.ub.pacman.data;
public class Celda {
	
	private Direccion celda;
	
	//METODOS PUBLICOS
	public void ocuparCelda(Direccion  direccion) {
		setCelda(direccion);
	}
	
	public void desocuparCelda() {
		setCelda(Direccion.PACMAN_VACIO);
	}
	
	public Direccion obtenerCelda() {
		return getCelda();
	}

	public Direccion getCelda() {
		return celda;
	}

	public void setCelda(Direccion celda) {
		this.celda = celda;
	}
	
	//METODOS PRIVADOS

	
	
}
