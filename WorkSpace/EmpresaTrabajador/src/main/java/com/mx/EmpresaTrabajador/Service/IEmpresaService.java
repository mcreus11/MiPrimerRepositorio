package com.mx.EmpresaTrabajador.Service;

import java.util.List;

import com.mx.EmpresaTrabajador.Dominio.Empresa;


public interface IEmpresaService {
	public void guardar(Empresa empresa);
	public void editar(Empresa empresa);
	public void eliminar(Empresa empresa);
	public Empresa buscar(Empresa empresa);
	public List<Empresa> listar();

}
