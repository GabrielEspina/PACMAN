package ar.edu.ub.pacman.data;
public class Laberinto {
	
	private String celda;
	
	//METODOS PUBLICOS
	public void ocuparCelda(String direccion) {
		this.setCelda(direccion);
	}
	
	public void desocuparCelda() {
		this.setCelda("-");
	}
	
	public String obtenerCelda() {
		return this.getCelda();
	}
	
	//METODOS PRIVADOS
	private String getCelda() {
		return celda;
	}

	private void setCelda(String celda) {
		this.celda = celda;
	}
	
	
}
