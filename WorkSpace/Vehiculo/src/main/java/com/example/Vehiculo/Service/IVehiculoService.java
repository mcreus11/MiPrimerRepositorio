package com.example.Vehiculo.Service;

import java.util.List;

import com.example.Vehiculo.Dominio.Vehiculo;

public interface IVehiculoService {
	public void guardar(Vehiculo vehiculo);
	public void editar(Vehiculo vehiculo);
	public void eliminar(Vehiculo vehiculo);
	public Vehiculo buscar(Vehiculo vehiculo);
	public List<Vehiculo> listar();

}
