package com.mx.Almacen.DTO;

import lombok.Data;

@Data
public class ActualizarEstatusRequest {
    private Long id;
    private String referencia;
    private String estatus;
}
