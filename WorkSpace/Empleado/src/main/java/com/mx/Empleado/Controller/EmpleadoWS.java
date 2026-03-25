package com.mx.Empleado.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Empleado.Dominio.Empleado;
import com.mx.Empleado.Service.IEmpleadoService;

@RestController 
@RequestMapping(path = "api/Empleado")
@CrossOrigin
public class EmpleadoWS {
	
	@Autowired
    private IEmpleadoService service;

    @GetMapping("/listar")
    public List<Empleado> listar() {
        return service.listar();
    }
    
	//buscar  http://localhost:8000/api/Empleado/buscar
	
    @PostMapping(value = "buscar")
    public Empleado buscar(@RequestBody Empleado empleado) {
        return service.buscar(empleado);
    }
	
	//guardar  http://localhost:8000/api/Empleado/guardar
	@PostMapping(value = "guardar")
	public void guardar(@RequestBody Empleado empleado) {
		service.guardar(empleado);
	}
	
	//editar http://localhost:8000/api/Empleado/editar
	@PutMapping(value = "editar")
	public void editar(@RequestBody Empleado empleado) {
		service.editar(empleado);
	}
	
	//editar http://localhost:8000/api/Empleado/eliminar
		@DeleteMapping(value = "eliminar")
		public void eliminar(@RequestBody Empleado empleado) {
			service.eliminar(empleado);
		}
	
	
	

}
