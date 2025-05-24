package Entretenimiento;

public class Serie {
	private String titulo;
	private int temporadas =3;
	private boolean entregado = false;
	private String creador;
	
	public Serie() {
		
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int temporadas, String creador) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", creador="
				+ creador + "\n]";
	}


	public void entregar() {
		this.entregado = true;
		
	}


	public void devolver() {
		this.entregado = true;
		
	}
	

	
	public int compareTo(Object a) {
		if (a instanceof Serie) {
            Serie tempo = (Serie) a;
            return Integer.compare(this.temporadas, tempo.temporadas);
        }
        return 0;
	}

	
	public boolean isEntregado() {
		 return this.entregado;
	}
	
	

}
