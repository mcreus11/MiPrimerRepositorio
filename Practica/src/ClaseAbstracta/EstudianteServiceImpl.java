package ClaseAbstracta;

import java.util.ArrayList;
import java.util.List;

import Principal.EstudianteService;

public class EstudianteServiceImpl implements EstudianteService{
	 public List<Object> persona=new ArrayList<Object>();


	@Override
	public void guardar(Object object) {
		persona.add(object);
		
	}

	

	@Override
	public void mostrar() {
		System.out.println(persona);
		
	}

	@Override
	public void editar(int indice, Object object) {
		persona.set(indice, object);
		
	}

	@Override
	public void eliminar(int indice) {
		persona.remove(indice);

		
	}
	

}
