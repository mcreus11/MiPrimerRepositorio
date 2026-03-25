package com.mx.Departamento.Entidades;

import lombok.Data;

@Data
public class Trabajador {
	private int idTrabajador;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String puesto;
	private int departamentoId;
	private int pagoId;
	private int empresaId;
	

}
