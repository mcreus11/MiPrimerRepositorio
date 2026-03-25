package com.mx.Cajero.Dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Cajero.Dominio.Denominacion;

public interface IDenominacionDao extends JpaRepository<Denominacion, Long> {
	
	
    List<Denominacion> findAllByOrderByValorDesc();
    
    Denominacion findByValor(BigDecimal valor);
}
