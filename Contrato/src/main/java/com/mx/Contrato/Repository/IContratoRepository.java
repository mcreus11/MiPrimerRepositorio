package com.mx.Contrato.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Contrato.Entity.Contrato;

@Repository
public interface IContratoRepository extends JpaRepository<Contrato, Integer> {
	
	public List<Contrato> findByTrabajadorId(int trabajadorId);

}
