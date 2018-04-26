package ar.edu.ub.pacman.data;
public class Pacman {
	private int fila;
	private int columna;
	private String direccion;
	
	
	public Pacman() {
		this.indicarFila(2);
		this.indicarColumna(2);
		this.indicarDireccion("^");
	}
	//Metodos publicos
	public int obtenerFila(){
		return this.getFila();
	}
	
	public int obtenerColumna(){
		return this.getColumna();
	}
	
	public String obtenerDireccion() {
		return this.getDireccion();
	}
	
	//--------------------------------
	public void indicarFila(int fila) {
		this.setFila(fila);
	}
	
	public void indicarColumna(int columna) {
		this.setColumna(columna);
	}
	
	public void indicarDireccion(String direccion) {
		this.setDireccion(direccion);
	}
	
	
	//Metodos privados
	private int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		this.fila = fila;
	}
	private int getColumna() {
		return columna;
	}
	private void setColumna(int columna) {
		this.columna = columna;
	}
	private String getDireccion() {
		return direccion;
	}
	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
