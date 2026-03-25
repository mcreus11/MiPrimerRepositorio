package com.mx.Cajero.Controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Cajero.Dominio.Denominacion;
import com.mx.Cajero.Service.ICajeroService;

@RestController
@RequestMapping("/api/cajero")
@CrossOrigin

public class CajeroWS {

	@Autowired
    ICajeroService service;
	
	@GetMapping("/denominaciones")
	public ResponseEntity<List<Denominacion>> obtenerDenominaciones() {
	    List<Denominacion> lista = service.obtenerDenominaciones();
	    return ResponseEntity.ok(lista);
	}
	@PostMapping("/retirar")
	public ResponseEntity<?> retirar(@RequestParam BigDecimal monto) {
	    System.out.println("Monto recibido: " + monto); 

	    Map<BigDecimal, Integer> resultado = service.retirar(monto);

	    if (resultado == null || resultado.isEmpty()) {
	        return ResponseEntity.badRequest().body("No se puede completar el retiro con las denominaciones disponibles.");
	    }

	    return ResponseEntity.ok(resultado);
	}
}
