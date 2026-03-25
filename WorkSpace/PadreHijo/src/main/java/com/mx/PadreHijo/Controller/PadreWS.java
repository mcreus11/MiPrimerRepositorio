package com.mx.PadreHijo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.PadreHijo.Dominio.Padre;
import com.mx.PadreHijo.Service.PadreServiceImp;

@RestController
@RequestMapping(path = "api/Padre")
@CrossOrigin
public class PadreWS {
	//url: http://localhost:8001/api/Padre
	
	@Autowired
	private PadreServiceImp service;
	
	//listar http://localhost:8001/api/Padre/listar
	//ResponseEntity clase que permite cambiar los estados y el cuerpo de la respuesta del metodo http
	@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		List<Padre> padre = service.listar();
		if(padre.isEmpty()) {
			return ResponseEntity.ok("NO HAY REGISTROS DISPONIBLES");
		}else {
			return ResponseEntity.ok(padre);
		}
	}
	//guardar
		@PostMapping(value = "guardar")
		public ResponseEntity<String> guardar(@RequestBody Padre padre){
			service.guardar(padre);
			return ResponseEntity.ok("El padre: " + padre.getNombre() + " se guardo correctamente");
		}
		//buscar
		@PostMapping(value = "buscar")
		public ResponseEntity<Padre> buscar(@RequestBody Padre padre){
			Padre encontrado = service.buscar(padre);
			return ResponseEntity.ok(encontrado);
		}
		
		//editar
		@PutMapping (value = "editar")
		public ResponseEntity<String> editar(@RequestBody Padre padre){
			service.editar(padre);
			return ResponseEntity.ok("El padre: " + padre.getNombre() + " se edito correctamente");
		}
		
		//eliminar
		@DeleteMapping (value = "eliminar")
		public ResponseEntity<String> eliminar(@RequestBody Padre padre){
			service.eliminar(padre);
			return ResponseEntity.ok("El registro se elimino con exito");
		}
		
		//metodo personalizado
		
		@GetMapping("/buscarPorNombre")
		public ResponseEntity<?> buscarPorNombre(@RequestBody String nombre){
			Padre encontrado = service.buscarPorNombre(nombre);
			if(encontrado == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("El padre con nombre: " + nombre + "no fue encontrado");
			}else {
				return ResponseEntity.ok("Padre encontrado: " + encontrado);
			}}
		
		
	

}
