package com.example.Vehiculo.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Vehiculo.Dominio.Vehiculo;

@Repository
public interface IVehiculoDao extends CrudRepository<Vehiculo, Integer> {

	
	//metodo personalizado
	public Vehiculo findByMarca(String marca);
	
}