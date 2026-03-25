package com.mx.Tarea.Service;

import java.util.List;

import com.mx.Tarea.Dominio.Tarea;


public interface ITareaService {
	 List<Tarea> listar();
	    Tarea guardar(Tarea tarea);
	    Tarea buscar(Long id);
	    void eliminar(Long id);
	    Tarea marcarCompletada(Long id);

}
