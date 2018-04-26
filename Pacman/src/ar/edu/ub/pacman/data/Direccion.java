package ar.edu.ub.pacman.data;


public class Direccion {
	private String arriba;
	private String abajo;
	private String derecha;
	private String izquierda;
	
	
	public Direccion() {
		this.setArriba("v");
		this.setAbajo("^");
		this.setDerecha("<");
		this.setIzquierda(">");
	}

	//METODOS PUBLICOS 
	public String arriba() {
		return this.getArriba();
	}
	
	public String abajo() {
		return this.getAbajo();
	}
	
	public String derecha() {
		return this.getDerecha();
	}
	
	public String izquierda() {
		return this.getIzquierda();
	}
	
	//METODOS PRIVADOS
	private String getArriba() {
		return arriba;
	}


	private void setArriba(String arriba) {
		this.arriba = arriba;
	}


	private String getAbajo() {
		return abajo;
	}


	private void setAbajo(String abajo) {
		this.abajo = abajo;
	}


	private String getDerecha() {
		return derecha;
	}


	private void setDerecha(String derecha) {
		this.derecha = derecha;
	}


	private String getIzquierda() {
		return izquierda;
	}


	private void setIzquierda(String izquierda) {
		this.izquierda = izquierda;
	}
	
}
