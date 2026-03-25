package com.mx.Tarea.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Tarea.Dominio.Tarea;
import com.mx.Tarea.Service.ITareaService;

@RestController
@RequestMapping("/api/tareas")
@CrossOrigin
public class TareaWS {
	
	 @Autowired
	    private ITareaService service;

	    @GetMapping
	    public List<Tarea> listar() {
	        return service.listar();
	    }

	    @PostMapping
	    public Tarea guardar(@RequestBody Tarea tarea) {
	        return service.guardar(tarea);
	    }

	    @PutMapping("/{id}")
	    public Tarea marcarCompletada(@PathVariable Long id) {
	        return service.marcarCompletada(id);
	    }

	    @DeleteMapping("/{id}")
	    public void eliminar(@PathVariable Long id) {
	        service.eliminar(id);
	    }
}
