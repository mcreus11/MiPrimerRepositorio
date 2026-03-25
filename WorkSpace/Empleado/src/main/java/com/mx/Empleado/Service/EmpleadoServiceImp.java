package com.mx.Empleado.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mx.Empleado.Dao.IEmpleadoDao;
import com.mx.Empleado.Dominio.Empleado;

@Service 
public class EmpleadoServiceImp implements IEmpleadoService{

	
	private IEmpleadoDao dao;
	public EmpleadoServiceImp(IEmpleadoDao dao) {
        this.dao = dao;
    }
	
	
	@Override
	public void guardar(Empleado empleado) {
		dao.save(empleado);
		
	}

	@Override
	public void editar(Empleado empleado) {
		dao.save(empleado);
		
	}

	@Override
	public void eliminar(Empleado empleado) {
		dao.delete(empleado);
		
	}

	@Override
	public Empleado buscar(Empleado empleado) {
		
		return dao.findById(empleado.getIdEmpleado()).orElse(null);
	}

	@Override
	public List<Empleado> listar() {
		
		return (List<Empleado>) dao.findAll();

	}
	

}
