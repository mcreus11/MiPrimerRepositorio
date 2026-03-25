package com.mx.EmpresaTrabajador.Service;

import java.util.List;

import com.mx.EmpresaTrabajador.Dominio.Trabajador;


public interface ITrabajadorService {
	public void guardar(Trabajador trabajador);
	public void editar(Trabajador trabajador);
	public void eliminar(Trabajador trabajador);
	public Trabajador buscar(Trabajador trabajador);
	public List<Trabajador> listar();

}
