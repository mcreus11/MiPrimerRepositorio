package com.mx.Empresa.Entidades;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
public class Pago {
	 	private int idPago;
		@CreationTimestamp
	    private LocalDate fecha;
	    private double monto;

	    private String metodo;

	    private int trabajadorId;
	

}
