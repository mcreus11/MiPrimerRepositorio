package com.mx.TRABAJADOR.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.TRABAJADOR.Entity.Trabajador;

@Repository
public interface ITrabajadorDao extends JpaRepository<Trabajador, Integer>{
	
	public List<Trabajador> findByDepartamentoId(int departamentoId);
	public List<Trabajador> findByPagoId(int pagoId);
	public List<Trabajador> findByEmpresaId(int empresaId);
	
	boolean existsByNombreAndApellidoPaternoAndApellidoMaterno(String nombre, String apellidoPaterno, String apellidoMaterno);
}
