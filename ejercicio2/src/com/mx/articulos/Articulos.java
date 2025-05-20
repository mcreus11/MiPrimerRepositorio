package com.mx.articulos;

public class Articulos {
	private String nombre;
	private String marca;
	private int codigo;
	private String color;
	private double precio;
	
	public Articulos(String nombre, String marca, int codigo, String color, double precio) {
		this.nombre=nombre;
		this.marca=marca;
		this.codigo=codigo;
		this.color=color;
		this.precio=precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	
	public String toString() {
		return "Articulos[" + "nombre= " + nombre + "marca= " +marca + "codigo= " + codigo +
				 "color= " + color + "precio= " + precio + "]\n";
	}
	public void setnombre(String nombre2) {
		// TODO Auto-generated method stub
		
	}
}
