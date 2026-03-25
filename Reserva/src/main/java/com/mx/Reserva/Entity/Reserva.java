package com.mx.Reserva.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {
	private int id;
    private int salaId;
    private String usuario;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private int duracionHoras;
}
