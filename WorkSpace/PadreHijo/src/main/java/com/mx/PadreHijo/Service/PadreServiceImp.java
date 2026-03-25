package com.mx.PadreHijo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.PadreHijo.Dao.IPadreDao;
import com.mx.PadreHijo.Dominio.Padre;

@Service
public class PadreServiceImp implements IPadreService{

	@Autowired
	private IPadreDao dao;
	
	
	@Override
	public void guardar(Padre padre) {
		dao.save(padre);
		
	}

	@Override
	public void editar(Padre padre) {
		dao.save(padre);
		
	}

	@Override
	public void eliminar(Padre padre) {
		dao.delete(padre);
		
	}

	@Override
	public Padre buscar(Padre padre) {
	
		return dao.findById(padre.getIdPadre()).orElse(null);
	}

	@Override
	public List<Padre> listar() {
		
		return dao.findAll(Sort.by(Sort.Direction.ASC, "idPadre"));
	}
	
	//metodo personalizado
	
	public Padre buscarPorNombre(String nombre) {
		return dao.findByNombreIgnoreCaseContaining(nombre);
	}

}
