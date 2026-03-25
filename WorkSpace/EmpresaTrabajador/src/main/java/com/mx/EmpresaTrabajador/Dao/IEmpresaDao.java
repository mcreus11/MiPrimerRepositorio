package com.mx.EmpresaTrabajador.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.EmpresaTrabajador.Dominio.Empresa;

@Repository
public interface IEmpresaDao extends JpaRepository<Empresa, Integer>{
	
	public Empresa findByNombreIgnoreCaseContaining(String nombre);

}
