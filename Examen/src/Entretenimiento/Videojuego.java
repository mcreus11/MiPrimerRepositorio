package Entretenimiento;

public class Videojuego {
	private String titulo;
	private int horasEstimadas =10;
	private boolean entregado = false;
	private String genero;
	private String compania;
	
	
	
	public Videojuego() {
		
	}

	public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
       
    }

	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "\n]";
	}

	
	public void entregar() {
        this.entregado = true;

	}


	public void devolver() {
		 this.entregado = true;
		
	}

	
	public boolean isEntregado() {
		 return this.entregado;
	}

	
	public int compareTo(Object a) {
		if (a instanceof Videojuego) {
            Videojuego horas = (Videojuego) a;
            return Integer.compare(this.horasEstimadas, horas.horasEstimadas);
        }
        return 0;
	}

	
	
	 
	
	
}
