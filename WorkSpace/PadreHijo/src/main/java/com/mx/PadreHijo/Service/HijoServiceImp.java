package com.mx.PadreHijo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.PadreHijo.Dao.IHijoDao;
import com.mx.PadreHijo.Dominio.Hijo;
@Service

public class HijoServiceImp implements IHijoService{

	@Autowired
	private IHijoDao dao;
	@Override
	public void guardar(Hijo hijo) {
		dao.save(hijo);
		
	}

	@Override
	public void editar(Hijo hijo) {
		dao.save(hijo);
		
	}

	@Override
	public void eliminar(Hijo hijo) {
		dao.delete(hijo);
	}

	@Override
	public Hijo buscar(Hijo hijo) {
		return dao.findById(hijo.getIdHijo()).orElse(null);
	}

	@Override
	public List<Hijo> listar() {
		return dao.findAll(Sort.by(Sort.Direction.ASC, "idHijo"));
	}
	
	
	public List<Hijo> buscarPorHobbie(String hobbie) {
		return dao.finByHobbie(hobbie);
	}
	
	

}
