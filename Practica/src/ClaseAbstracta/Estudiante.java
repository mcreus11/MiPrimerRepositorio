package ClaseAbstracta;

public class Estudiante extends Persona{
	private String carrera;
	
	public void mostrarInformacion() {
		System.out.println("Carrera: " + carrera);
		
		
		
	}
	public Estudiante() {
		
	}

	public Estudiante(int id, String nombre, int edad, String carrera) {
		super(id, nombre, edad);
		this.carrera = carrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + "\n]";
	}
	

}
