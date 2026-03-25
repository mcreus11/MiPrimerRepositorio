package com.mx.Reserva.Controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Reserva.Entity.Reserva;
import com.mx.Reserva.Exception.ReservaException;
import com.mx.Reserva.Service.ReservaService;

@RestController
@RequestMapping("/R/api")
@CrossOrigin
public class ReservaWS {
	
	@Autowired
	private ReservaService reservaService;

    

    @PostMapping("/reserva")
    public ResponseEntity<?> crearReserva(@RequestBody Reserva reserva) {
        try {
            Reserva creada = reservaService.crearReserva(reserva);
            return ResponseEntity.ok(creada);
        } catch (ReservaException ex) {
            return ResponseEntity.badRequest().body(Map.of("mensaje", ex.getMessage()));
        }
    }

    @DeleteMapping("/reservas/{id}")
    public ResponseEntity<?> cancelarReserva(@PathVariable int id) {
        try {
            reservaService.cancelarReserva(id);
            return ResponseEntity.ok(Map.of("mensaje", "Reserva cancelada exitosamente."));
        } catch (ReservaException ex) {
            return ResponseEntity.badRequest().body(Map.of("mensaje", ex.getMessage()));
        }
    }

    @GetMapping("/salas/{id}/reservas")
    public ResponseEntity<?> listarReservas(@PathVariable("id") int salaId,  @RequestParam String fecha) {
        LocalDate fechaReserva = LocalDate.parse(fecha);
        List<Reserva> reservas = reservaService.listarReservasPorSalaYFecha(salaId, fechaReserva);
        return ResponseEntity.ok(reservas);
    }

}
