package com.mx.Personas;

public class Personas {
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	private int peso;
	private double estatura;
	public Personas(String nombre, String apellido, int edad, String genero, int peso, double estatura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.peso = peso;
		this.estatura = estatura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero
				+ ", peso=" + peso + ", estatura=" + estatura + "]\n";
	}
	
	
}
