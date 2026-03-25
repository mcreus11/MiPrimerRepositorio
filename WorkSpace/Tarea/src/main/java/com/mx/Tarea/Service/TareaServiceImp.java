package com.mx.Tarea.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Tarea.Dao.ITareaDao;
import com.mx.Tarea.Dominio.Tarea;

@Service 
public class TareaServiceImp implements ITareaService{

	@Autowired
    private ITareaDao dao;
	@Override
	public List<Tarea> listar() {
		 return dao.findAll();
	}
	@Override
	public Tarea guardar(Tarea tarea) {
		return dao.save(tarea);
	}
	@Override
	public Tarea buscar(Long id) {
		return dao.findById(id).orElse(null);
	}
	@Override
	public void eliminar(Long id) {
		dao.deleteById(id);
		
	}
	@Override
	public Tarea marcarCompletada(Long id) {
		 Tarea tarea = buscar(id);
	        if (tarea != null) {
	            tarea.setCompletada(true);
	            return dao.save(tarea);
	        }
	        return null;
	}
	
	

}
