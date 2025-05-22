package ClaseAbstracta;

public abstract class Persona {
	protected int id;
	protected String nombre;
	protected int edad;
	
	//metodo concreto
	
	public void info(String persona, int clave){
		System.out.println("Me presento soy: " + nombre + " \nCon la edad de: " + edad);
	}
	//metodo abstracto
	public abstract void mostrarInformacion();
	
	public Persona() {
		
	}
	public Persona(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "\n]";
	}
	
	

}
