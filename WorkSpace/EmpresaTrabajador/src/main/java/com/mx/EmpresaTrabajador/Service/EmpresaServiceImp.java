package com.mx.EmpresaTrabajador.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.EmpresaTrabajador.Dao.IEmpresaDao;
import com.mx.EmpresaTrabajador.Dominio.Empresa;

@Service

public class EmpresaServiceImp implements IEmpresaService {

	@Autowired
	private IEmpresaDao dao;
	
	@Override
	public void guardar(Empresa empresa) {
		dao.save(empresa);
		
	}

	@Override
	public void editar(Empresa empresa) {
		dao.save(empresa);
		
	}

	@Override
	public void eliminar(Empresa empresa) {
		dao.delete(empresa);
		
		
	}

	@Override
	public Empresa buscar(Empresa empresa) {
		return dao.findById(empresa.getIdEmpresa()).orElse(null);
	}

	@Override
	public List<Empresa> listar() {
		return dao.findAll(Sort.by(Sort.Direction.ASC, "idEmpresa"));
	}
	//metodo personalizado
	
		public Empresa buscarPorNombre(String nombre) {
			return dao.findByNombreIgnoreCaseContaining(nombre);
		}

}
