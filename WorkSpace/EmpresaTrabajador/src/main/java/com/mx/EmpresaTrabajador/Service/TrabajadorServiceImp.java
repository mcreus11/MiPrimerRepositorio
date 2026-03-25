package com.mx.EmpresaTrabajador.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.EmpresaTrabajador.Dao.ITrabajadorDao;
import com.mx.EmpresaTrabajador.Dominio.Trabajador;


@Service
public class TrabajadorServiceImp implements ITrabajadorService{

	@Autowired
	private ITrabajadorDao dao;

	@Override
	public void guardar(Trabajador trabajador) {
		dao.save(trabajador);
		
	}

	@Override
	public void editar(Trabajador trabajador) {
		dao.save(trabajador);
	}

	@Override
	public void eliminar(Trabajador trabajador) {
		dao.delete(trabajador);
		
	}

	@Override
	public Trabajador buscar(Trabajador trabajador) {
		return dao.findById(trabajador.getIdTrabajador()).orElse(null);
	}

	@Override
	public List<Trabajador> listar() {
		return dao.findAll(Sort.by(Sort.Direction.ASC, "idTrabajador"));
	}
	
	//metodo personalizado
	public List<Trabajador> buscarPorPuesto(String puesto) {
		return dao.finByPuesto(puesto);
	}
	
}
