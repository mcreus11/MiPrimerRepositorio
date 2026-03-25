package com.example.Vehiculo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Vehiculo.Dao.IVehiculoDao;
import com.example.Vehiculo.Dominio.Vehiculo;


@Service
public class VehiculoServiceImp implements IVehiculoService{
	private IVehiculoDao dao;
	public VehiculoServiceImp(IVehiculoDao dao) {
        this.dao = dao;
    }

	@Override
	public void guardar(Vehiculo vehiculo) {
		dao.save(vehiculo);
		
	}

	@Override
	public void editar(Vehiculo vehiculo) {
		dao.save(vehiculo);
		
	}

	@Override
	public void eliminar(Vehiculo vehiculo) {
		dao.delete(vehiculo);
		
	}

	@Override
	public Vehiculo buscar(Vehiculo vehiculo) {
		return dao.findById(vehiculo.getId()).orElse(null);
	}

	@Override
	public List<Vehiculo> listar() {
		return (List<Vehiculo>) dao.findAll();
	}

}
