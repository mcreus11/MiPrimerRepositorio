package com.mx.EmpresaTrabajador.Dominio;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Empresa {
	@Id
	@Column(name = "ID_EMPRESA")
	private Integer idEmpresa;
	@Column
	private String nombre;
	@Column
	private String rubro;
	@Column
	private String ubicacion;
	
	@OneToMany(mappedBy = "empresaId", cascade = CascadeType.ALL)
	List<Trabajador> list = new ArrayList<>();
	
	public Empresa() {
		
	}



	public Empresa(Integer idEmpresa, String nombre, String rubro, String ubicacion) {
		super();
		this.idEmpresa = idEmpresa;
		this.nombre = nombre;
		this.rubro = rubro;
		this.ubicacion = ubicacion;
	}



	public Integer getIdEmpresa() {
		return idEmpresa;
	}



	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getRubro() {
		return rubro;
	}



	public void setRubro(String rubro) {
		this.rubro = rubro;
	}



	public String getUbicacion() {
		return ubicacion;
	}



	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}



	@Override
	public String toString() {
		return "Empresa [idEmpresa=" + idEmpresa + ", nombre=" + nombre + ", rubro=" + rubro + ", ubicacion="
				+ ubicacion + "]";
	}
	
	

}
