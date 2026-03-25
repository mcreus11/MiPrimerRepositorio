package com.mx.EmpresaTrabajador.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mx.EmpresaTrabajador.Dominio.Trabajador;


@Repository
public interface ITrabajadorDao extends JpaRepository<Trabajador, Integer> {

	@Query(value = "SELECT * FROM TRABAJADOR T WHERE UPPER(T.PUESTO) = UPPER(:puesto)", nativeQuery = true)
	public List<Trabajador> finByPuesto(String puesto);
}
