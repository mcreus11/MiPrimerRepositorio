package ClaseAbstracta;

public class Administrador extends Persona{
	private String departamento;
	
	
	public void mostrarInformacion() {
		System.out.println("Me encuentro en el departamento: " + departamento);
		
		
		
	}
	public Administrador() {
		
	}


	public Administrador(int id, String nombre, int edad, String departamento) {
		super(id, nombre, edad);
		this.departamento = departamento;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	@Override
	public String toString() {
		return "Administrador [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", departamento=" + departamento
				+ "\n]";
	}
	
	

}
