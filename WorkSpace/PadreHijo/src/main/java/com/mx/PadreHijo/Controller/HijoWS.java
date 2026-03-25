package com.mx.PadreHijo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.PadreHijo.Dominio.Hijo;
import com.mx.PadreHijo.Service.HijoServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "api/Hijo")
@CrossOrigin
public class HijoWS {

	
	@Autowired
	private HijoServiceImp service;
	@GetMapping("/listar")
	public ResponseEntity<?> listar() {
		List<Hijo> hijo = service.listar();
		return ResponseEntity.ok(hijo);
	}
	//buscar 
	@PostMapping(value = "buscar")
	public ResponseEntity<?> buscar(@RequestBody Hijo hijo) {
	    Hijo encontrado = service.buscar(hijo);
	    if (encontrado == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok(encontrado);
	}

	
	//guardar
	@PostMapping
	public ResponseEntity<?> guardar(@RequestBody Hijo hijo) {
		 service.guardar(hijo);
		return ResponseEntity.ok("EL HIJO: "+ hijo.getNombre() + "se guardo correctamente");
	}
	
	//editar
	@PutMapping(value = "editar")
	public ResponseEntity<?> editar(@RequestBody Hijo hijo) {
		service.editar(hijo);
		return ResponseEntity.ok("EL HIJO: "+ hijo.getNombre() + "se edito correctamente");
	}
	
	//eliminar
	@DeleteMapping(value = "eliminar")
	public ResponseEntity<?> eliminar(@RequestBody Hijo hijo) {
		 service.eliminar(hijo);
		return ResponseEntity.ok("EL registro se elimino correctamente");
	}
	
	//buscarporhobbie
	@GetMapping(value = "/buscarPorHobbie/{hobbie}")
	public ResponseEntity<?> buscarPorHobbie(@PathVariable("hobbie") String hobbie){
		List<Hijo> hijos = service.buscarPorHobbie(hobbie);
		if(hijos.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existen registros");
		}else {
			return ResponseEntity.ok(hijos);
		}
		
	}
	
	
	
	
	
}
