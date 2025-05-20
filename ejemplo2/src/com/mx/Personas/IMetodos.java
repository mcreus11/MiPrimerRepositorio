package com.mx.Personas;

public interface IMetodos {
	public void guardar(Personas personas);
	public void editar (int indice, Personas personas);
	public void mostrar();

	public void eliminar(int indice);

	public Personas buscar(int indice);
}
