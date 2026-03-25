package com.mx.Pago.FeignClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mx.Pago.Entity.Pago;

@FeignClient(name = "Pago", url = "http://localhost:8012", path = "/P")
public interface PagoCliente {
	@GetMapping("/pagos/trabajador/{trabajadorId}")
    List<Pago> obtenerPagosPorTrabajador(@PathVariable int trabajadorId);

}
