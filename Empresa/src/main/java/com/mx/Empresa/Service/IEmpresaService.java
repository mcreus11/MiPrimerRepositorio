package com.mx.Empresa.Service;

import java.util.List;
import java.util.Map;

import com.mx.Empresa.Entity.Empresa;

public interface IEmpresaService {

	public void guardar(Empresa empresa);
    public void editar(Empresa empresa);
    public void eliminar(int id);
    public Empresa buscarPorId(int id);
    public List<Empresa> listar();
	Map<String, Object> getModulos(int idEmpresa);
}
