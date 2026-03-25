package com.mx.Almacen.DTO;

import lombok.Data;

@Data
public class TransaccionRequest {
	private String operacion;
    private String importe;
    private String cliente;

}
