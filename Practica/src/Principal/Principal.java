package Principal;

import java.util.ArrayList;
import java.util.List;

import ClaseAbstracta.Administrador;
import ClaseAbstracta.Estudiante;
import ClaseAbstracta.Persona;

public class Principal {

	public static void main(String[] args) {
		List<Object> persona=new ArrayList<Object>();
		Estudiante estudiante = new Estudiante(3, "marco", 28, "admin");
		 persona.add(estudiante);

		System.out.println(estudiante);
		estudiante.mostrarInformacion();
		estudiante.info(estudiante.getNombre(), estudiante.getEdad());
		
		
		
		Administrador administrador = new Administrador(10, "ERNESTO", 35, "TI");
		persona.add(administrador);
		System.out.println(administrador);
		administrador.mostrarInformacion();
		administrador.info(administrador.getNombre(), administrador.getEdad());

	}

}
