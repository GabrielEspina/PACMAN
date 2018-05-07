package ar.edu.ub.pacman.data;
public class Celda {
	
	private String celda;
	
	//METODOS PUBLICOS
	public void ocuparCelda(String  direccion) {
		setCelda(direccion);
	}
	
	public void desocuparCelda() {
		setCelda("-");
	}
	
	public String obtenerCelda() {
		return getCelda();
	}
	
	//METODOS PRIVADOS
	private String getCelda() {
		return celda;
	}

	private void setCelda(String celda) {
		this.celda = celda;
	}
	
	
}
