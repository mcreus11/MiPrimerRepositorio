package com.mx.Departamento.Entidades;

import java.util.List;

import com.mx.Departamento.Entity.Departamento;

import lombok.Data;

@Data
public class DepartamentoConTrabajadores {
	 private Departamento departamento;
	    private List<Trabajador> trabajadores;

}
