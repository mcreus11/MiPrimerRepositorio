package com.mx.Almacen.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.Almacen.Entity.Transaccion;
@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion, Long>{

}
