package ar.edu.ub.pacman.data;
public class Pacman {
	private int fila;
	private int columna;
	private String direccion;
	
	
	public Pacman() {
		setFila(2);
		setColumna(2);
		setDireccion(Direccion.PACMAN_ARRIBA);
	}

	//Metodos privados
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public  int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	public  String getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion.toString();
	}

}
