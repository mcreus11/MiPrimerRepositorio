package com.mx.Tarea.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.Tarea.Dominio.Tarea;

@Repository
public interface ITareaDao extends JpaRepository<Tarea, Long> {
	

}
