package Principal;

import java.util.ArrayList;
import java.util.List;

import ClaseAbstracta.Estudiante;

public interface EstudianteService {
	 
	 void guardar(Object object);
	    void editar(int indice,Object object);
	    void eliminar(int indice);
	   
	    void mostrar();
	
	

}
