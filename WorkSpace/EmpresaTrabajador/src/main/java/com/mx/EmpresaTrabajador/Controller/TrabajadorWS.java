package com.mx.EmpresaTrabajador.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.EmpresaTrabajador.Dominio.Trabajador;
import com.mx.EmpresaTrabajador.Service.TrabajadorServiceImp;




@RestController
@RequestMapping(path = "api/Trabajador")
@CrossOrigin
public class TrabajadorWS {

	@Autowired
	private TrabajadorServiceImp service;
	@GetMapping
	public ResponseEntity<?> listar() {
		List<Trabajador> trabajador = service.listar();
		return ResponseEntity.ok(trabajador);
	}
	//buscar 
		@GetMapping(value = "buscar")
		public ResponseEntity<?> buscar(@RequestBody Trabajador trabajador) {
			Trabajador encontrado = service.buscar(trabajador);
			return ResponseEntity.ok(encontrado);
		}
		
		//guardar
		@PostMapping
		public ResponseEntity<?> guardar(@RequestBody Trabajador trabajador) {
		    service.guardar(trabajador);
		    return ResponseEntity.ok("El trabajador: " + trabajador.getNombre() + " se guardó correctamente");
		}

		
		//editar
		@PutMapping
		public ResponseEntity<?> editar(@RequestBody Trabajador trabajador) {
			service.editar(trabajador);
			return ResponseEntity.ok("EL trabajador: "+ trabajador.getNombre() + "se edito correctamente");
		}
		
		//eliminar
		@DeleteMapping
		public ResponseEntity<?> eliminar(@RequestBody Trabajador trabajador) {
			 service.eliminar(trabajador);
			return ResponseEntity.ok("EL registro se elimino correctamente");
		}
		
		//buscarporPUESTO
		@GetMapping(value = "/buscarPorPuesto/{puesto}")
		public ResponseEntity<?> buscarPorPuesto(@PathVariable("puesto") String puesto){
			List<Trabajador> trabajadores = service.buscarPorPuesto(puesto);
			if(trabajadores.isEmpty()) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existen registros");
			}else {
				return ResponseEntity.ok(trabajadores);
			}
			
		}
	
	
}
