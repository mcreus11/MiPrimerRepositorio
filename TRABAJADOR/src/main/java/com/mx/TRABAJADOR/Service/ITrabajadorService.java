package com.mx.TRABAJADOR.Service;

import java.util.List;

import com.mx.TRABAJADOR.Entity.Trabajador;

public interface ITrabajadorService {

	public List<Trabajador>listar();
	public void guardar(Trabajador trabajador);
	public void eliminar(int idTrabajador);
	public void editar(Trabajador trabajador);
	public Trabajador buscar(int idTrabajador);
	List<Trabajador> obtenerPorDepartamento(int departamentoId);
}
