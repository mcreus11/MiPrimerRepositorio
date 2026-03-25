package com.mx.Empleado.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.Empleado.Dominio.Empleado;

@Repository
public interface IEmpleadoDao extends CrudRepository<Empleado, Integer> {

	
	//metodo personalizado
	public Empleado findByNombre(String nombre);
	
}
