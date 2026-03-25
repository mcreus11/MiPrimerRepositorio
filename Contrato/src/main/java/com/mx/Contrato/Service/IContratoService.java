package com.mx.Contrato.Service;

import java.util.List;

import com.mx.Contrato.Entity.Contrato;

public interface IContratoService {
	public void guardar(Contrato contrato);
	public List<Contrato> listar();
	public void editar(Contrato contrato);
	public Contrato buscar(int idContrato);
	public void eliminar(int idContrato);

}
