package com.example.Vehiculo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Vehiculo.Dominio.Vehiculo;
import com.example.Vehiculo.Service.IVehiculoService;





@RestController 
@RequestMapping(path = "api/Vehiculo")
@CrossOrigin
public class VehiculoWS {
	@Autowired
    private IVehiculoService service;

	//listar  http://localhost:8000/api/Vehiculo/listar
    @GetMapping("/listar")
    public List<Vehiculo> listar() {
        return service.listar();
    }
    
//buscar  http://localhost:8000/api/Vehiculo/buscar
	
    @PostMapping(value = "buscar")
    public Vehiculo buscar(@RequestBody Vehiculo vehiculo) {
        return service.buscar(vehiculo);
    }
    
  //guardar  http://localhost:8000/api/Empleado/guardar
  	@PostMapping(value = "guardar")
  	public void guardar(@RequestBody Vehiculo vehiculo) {
  		service.guardar(vehiculo);
  	}
  	
  //editar  http://localhost:8000/api/Empleado/editar
  	@PutMapping(value = "editar")
  	public void editar(@RequestBody Vehiculo vehiculo) {
  	    service.editar(vehiculo);
  	}
  	
  //eliminar  http://localhost:8000/api/Empleado/eliminar
  	@DeleteMapping(value = "eliminar")
  	public void eliminar(@RequestBody Vehiculo vehiculo) {
  		service.eliminar(vehiculo);
  	}
    
}
