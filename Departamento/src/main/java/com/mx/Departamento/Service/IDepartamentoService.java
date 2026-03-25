package com.mx.Departamento.Service;

import java.util.List;

import com.mx.Departamento.Entity.Departamento;

public interface IDepartamentoService {
	public List<Departamento> listar();
	public void guardar(Departamento departamento);
	public void editar(Departamento departamento);
	public Departamento buscar(int idDepartamento);
	public void eliminar(int idDepartamento);

}
