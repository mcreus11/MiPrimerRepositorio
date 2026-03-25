package com.mx.TRABAJADOR.Entidades;

import java.util.List;

import lombok.Data;

@Data
public class TrabajadorConPagosDTO {
	private int idTrabajador;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String puesto;
    private int departamentoId;
    private int pagoId;
    private int empresaId;
    private List<Pago> pagos;
}
