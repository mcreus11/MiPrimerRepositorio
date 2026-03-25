package com.mx.Reserva.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mx.Reserva.Entity.Reserva;
import com.mx.Reserva.Exception.ReservaException;

@Service
public class ReservaService {
    private final Map<Integer, Reserva> reservas = new HashMap<>();
    private final AtomicInteger contador = new AtomicInteger();

    // Simula las salas existentes. Cambia esta implementación si usas BD u otro servicio
    private static final Set<Integer> SALAS_VALIDAS = Set.of(1, 2, 3, 4, 5);

    public Reserva crearReserva(Reserva reserva) {
        validarReserva(reserva);  // Primero validar la reserva
        int id = contador.incrementAndGet();
        reserva.setId(id);
        reservas.put(id, reserva);
        return reserva;
    }

    public void cancelarReserva(int id) {
        if (!reservas.containsKey(id)) {
            throw new ReservaException("Reserva no encontrada.");
        }
        reservas.remove(id);
    }

    public List<Reserva> listarReservasPorSalaYFecha(int salaId, LocalDate fecha) {
        return reservas.values().stream()
                .filter(r -> r.getSalaId() == salaId && r.getFecha().equals(fecha))
                .collect(Collectors.toList());
    }

    private void validarReserva(Reserva nueva) {
        // Validar existencia de sala si tienes lista de salas
        // if (!salasExistentes.contains(nueva.getSalaId())) {
        //     throw new ReservaException("La sala indicada no existe.");
        // }
    	if (!SALAS_VALIDAS.contains(nueva.getSalaId())) {
    	    throw new ReservaException("La sala con ID " + nueva.getSalaId() + " no existe.");
    	}

        if (nueva.getFecha().isBefore(LocalDate.now())) {
            throw new ReservaException("No se pueden hacer reservas para fechas en el pasado.");
        }

        if (nueva.getDuracionHoras() > 4 || nueva.getDuracionHoras() <= 0) {
            throw new ReservaException("La duración máxima de la reserva es de 4 horas y debe ser mayor a 0.");
        }

        LocalTime apertura = LocalTime.of(8, 0);
        LocalTime cierre = LocalTime.of(20, 0);

        LocalTime horaFin = nueva.getHoraInicio().plusHours(nueva.getDuracionHoras());

        // Validar hora de inicio dentro del rango permitido
        if (nueva.getHoraInicio().isBefore(apertura) || nueva.getHoraInicio().isAfter(cierre)) {
            throw new ReservaException("La hora de inicio debe estar entre las 08:00 y las 20:00.");
        }

        // Validar que la hora fin no cruce a otro día ni exceda el horario permitido
        if (horaFin.isBefore(nueva.getHoraInicio()) || horaFin.isAfter(cierre)) {
            throw new ReservaException("La reserva no puede finalizar después de las 20:00.");
        }

        for (Reserva existente : reservas.values()) {
            if (existente.getSalaId() == nueva.getSalaId() &&
                existente.getFecha().equals(nueva.getFecha())) {

                LocalTime iniExistente = existente.getHoraInicio();
                LocalTime finExistente = iniExistente.plusHours(existente.getDuracionHoras());

                boolean solapan = !(horaFin.isBefore(iniExistente) || horaFin.equals(iniExistente)
                                  || nueva.getHoraInicio().isAfter(finExistente) || nueva.getHoraInicio().equals(finExistente));

                if (solapan) {
                    throw new ReservaException("La sala ya está reservada para el horario especificado.");
                }
            }
        }
    }

}