package com.mx.TRABAJADOR.Entidades;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Pago {

	 private int idPago;
	 private LocalDate fecha;
	 private double monto;
	 private String metodo;
	 private int trabajadorId;
}
