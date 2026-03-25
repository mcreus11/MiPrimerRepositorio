package com.mx.TRABAJADOR.FeingClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mx.TRABAJADOR.Entidades.Pago;

@FeignClient(name = "Pago", url = "http://localhost:9000", path = "/P")

public interface PagoClient {
	@GetMapping("/pagos/por-trabajador/{idTrabajador}")
    List<Pago> obtenerPagosPorTrabajador(@PathVariable("idTrabajador") int idTrabajador);


}
