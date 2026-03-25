package com.mx.Empleado.Service;

import com.mx.Empleado.Dominio.Empleado;
import java.util.List;

public interface IEmpleadoService {
	
	public void guardar(Empleado empleado);
	public void editar(Empleado empleado);
	public void eliminar(Empleado empleado);
	public Empleado buscar(Empleado empleado);
	public List<Empleado> listar();

}
