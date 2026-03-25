package com.mx.Cajero.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.mx.Cajero.Dominio.Denominacion;

public interface ICajeroService {
	List<Denominacion> obtenerDenominaciones();

	 Map<BigDecimal, Integer> retirar(BigDecimal monto);
}
