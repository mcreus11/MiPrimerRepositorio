package com.mx.EmpresaTrabajador.Controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.EmpresaTrabajador.Dominio.Empresa;
import com.mx.EmpresaTrabajador.Service.EmpresaServiceImp;

@RestController
@RequestMapping(path = "api/Empresa")
@CrossOrigin
public class EmpresaWS {
	
	@Autowired
	private EmpresaServiceImp service;
	
	//listar http://localhost:8002/api/Empresa/listar
	//ResponseEntity clase que permite cambiar los estados y el cuerpo de la respuesta del metodo http
	@GetMapping( value = "listar")
	public ResponseEntity<?> listar(){
		List<Empresa> empresa = service.listar();
		if(empresa.isEmpty()) {
			return ResponseEntity.ok("NO HAY REGISTROS DISPONIBLES");
		}else {
			return ResponseEntity.ok(empresa);
		}
	}
	//guardar
			@PostMapping(value = "guardar")
			public ResponseEntity<String> guardar(@RequestBody Empresa empresa){
				service.guardar(empresa);
				return ResponseEntity.ok("La empresa: " + empresa.getNombre() + " se guardo correctamente");
			}
			//buscar
			@PostMapping("/buscar")
			public ResponseEntity<Empresa> buscar(@RequestBody Empresa empresa){
				Empresa encontrado = service.buscar(empresa);
				return ResponseEntity.ok(encontrado);
			}
			
			//editar
			@PutMapping (value = "editar")
			public ResponseEntity<String> editar(@RequestBody Empresa empresa){
				service.editar(empresa);
				return ResponseEntity.ok("La empresa: " + empresa.getNombre() + " se edito correctamente");
			}
			
			//eliminar
			@DeleteMapping (value = "eliminar")
			public ResponseEntity<String> eliminar(@RequestBody Empresa empresa){
				service.eliminar(empresa);
				return ResponseEntity.ok("El registro se elimino con exito");
			}
			
			//metodo personalizado
			@GetMapping("/buscarPorNombre")
			public ResponseEntity<?> buscarPorNombre(@RequestParam String nombre){
			    Empresa encontrado = service.buscarPorNombre(nombre);
			    if(encontrado == null) {
			        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("La empresa con nombre: " + nombre + " no fue encontrada");
			    } else {
			        return ResponseEntity.ok(encontrado);
			    }
			}


}
