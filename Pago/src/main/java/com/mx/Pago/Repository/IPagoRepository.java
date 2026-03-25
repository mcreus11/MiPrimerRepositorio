package com.mx.Pago.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Pago.Entity.Pago;

@Repository
public interface IPagoRepository extends JpaRepository<Pago, Integer> {
    List<Pago> findByTrabajadorId(int trabajadorId);
    
}
