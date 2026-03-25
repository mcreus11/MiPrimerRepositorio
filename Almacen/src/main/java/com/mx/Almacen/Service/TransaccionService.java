package com.mx.Almacen.Service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.mx.Almacen.DTO.ActualizarEstatusRequest;
import com.mx.Almacen.DTO.TransaccionRequest;
import com.mx.Almacen.DTO.TransaccionResponse;
import com.mx.Almacen.Entity.Transaccion;
import com.mx.Almacen.Repository.TransaccionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransaccionService {

    private final TransaccionRepository repo;

    public TransaccionResponse guardar(TransaccionRequest req) {
        String ref = String.format("%06d", new Random().nextInt(1000000));

        Transaccion transaccion = new Transaccion();
        transaccion.setOperacion(req.getOperacion());
        transaccion.setImporte(req.getImporte());
        transaccion.setCliente(req.getCliente());
        transaccion.setReferencia(ref);
        transaccion.setEstatus("Aprobada");

        repo.save(transaccion);

        return new TransaccionResponse(
            transaccion.getId(),
            transaccion.getEstatus(),
            transaccion.getReferencia(),
            transaccion.getOperacion()
        );
    }

    public List<Transaccion> obtenerTodas() {
        return repo.findAll();
    }

    public String actualizarEstatus(ActualizarEstatusRequest req) {
        Transaccion t = repo.findById(req.getId()).orElseThrow(() -> 
        new RuntimeException("Transacción no encontrada"));

        if (!t.getReferencia().equals(req.getReferencia())) {
            return "Referencia inválida";
        }

        if (!"cancelar".equalsIgnoreCase(req.getEstatus())) {
            return "Solo se puede cancelar";
        }

        t.setEstatus("Cancelada");
        repo.save(t);
        return "Transacción cancelada";
    }
}