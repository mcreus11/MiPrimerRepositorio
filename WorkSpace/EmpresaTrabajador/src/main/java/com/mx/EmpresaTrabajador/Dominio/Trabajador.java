package com.mx.EmpresaTrabajador.Dominio;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Trabajador {

	@Id
	@Column
	private Integer idTrabajador;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String puesto;
	@Column
	private Integer sueldo;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "EMPRESA_ID")
	private Empresa empresaId;
	
	public Trabajador() {
		
	}

	public Trabajador(Integer idTrabajador, String nombre, String apellido, String puesto, Integer sueldo,
			Empresa empresaId) {
		super();
		this.idTrabajador = idTrabajador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.puesto = puesto;
		this.sueldo = sueldo;
		this.empresaId = empresaId;
	}

	public Integer getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(Integer idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}

	public Empresa getEmpresaId() {
		return empresaId;
	}

	public void setEmpresaId(Empresa empresaId) {
		this.empresaId = empresaId;
	}

	@Override
	public String toString() {
		return "Trabajador [idTrabajador=" + idTrabajador + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", puesto=" + puesto + ", sueldo=" + sueldo + ", empresaId=" + empresaId + "]";
	}
	
	
}
