package ar.edu.ub.pacman.data;


public enum Direccion {
	
	PACMAN_ARRIBA		{ 
		public String toString() {
			return "v";
		}
	},
	
	PACMAN_ABAJO		{ 
		public String toString() {
			return "^";
		}
	},

	PACMAN_DERECHA		{
		public String toString() {
			return "<";
		}
	},
	
	PACMAN_IZQUIERDA{
		public String toString() {
			return ">";
		}
	},
	PACMAN_VACIO{
		public String toString() {
			return "-";
		}
	}
	,
	TECLADO_ARRIBA{
		public String toString() {
			return "W";
		}
	},
	
	TECLADO_ABAJO{
		public String toString() {
			return "S";
		}
	},
	
	TECLADO_DERECHA{
		public String toString() {
			return "D";
		}
	},
	
	TECLADO_IZQUIERDA{
		public String toString() {
			return "A";
		}
	},
	
	;

		
}
