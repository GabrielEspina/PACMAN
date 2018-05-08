package ar.edu.ub.pacman.data;
public class Pacman {
	private int fila;
	private int columna;
	private Direccion direccion;
	
	
	public Pacman(int fila, int columna) {
		setFila(fila);
		setColumna(columna);
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


}
