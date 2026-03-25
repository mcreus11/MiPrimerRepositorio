package com.mx.TRABAJADOR.Entidades;

import java.util.List;

import com.mx.TRABAJADOR.Entity.Trabajador;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrabajadorConContratos {
	private int idTrabajador;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String puesto;
    private int departamentoId;
    private int pagoId;
    private int empresaId;
    
    private List<Contrato> contratos;
}
