package com.mx.Empleado.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "EMPLEADOS")
public class Empleado {
	@Id
	@Column(name = "ID_EMPLEADO", columnDefinition = "NUMBER")
	private int idEmpleado;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(100)")
	private String nombre;
	@Column(name = "APELLIDO_PATERNO", columnDefinition = "NVARCHAR2(100)")
	private String apellidoPaterno;
	@Column(name = "APELLIDO_MATERNO", columnDefinition = "NVARCHAR2(100)")
	private String apellidoMaterno;
	@Column(name = "EDAD", columnDefinition = "NUMBER")
	private int edad;
	@Column(name = "CONTACTO", columnDefinition = "NUMBER")
	private long contacto;
	@Column(name = "PUESTO", columnDefinition = "NVARCHAR2(100)")
	private String puesto;
	@Column(name = "DEPARTAMENTO", columnDefinition = "NVARCHAR2(100)")
	private String departamento;
	@Column(name = "SUELDO", columnDefinition = "NUMBER")
	private int sueldo;
	
	public Empleado(){
		
	}
	public Empleado(int idEmpleado, String nombre, String apellidoPaterno, String apellidoMaterno, int edad,
			long contacto, String puesto, String departamento, int sueldo) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
		this.contacto = contacto;
		this.puesto = puesto;
		this.departamento = departamento;
		this.sueldo = sueldo;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public long getContacto() {
		return contacto;
	}
	public void setContacto(long contacto) {
		this.contacto = contacto;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", edad=" + edad + ", contacto=" + contacto + ", puesto="
				+ puesto + ", departamento=" + departamento + ", sueldo=" + sueldo + "]";
	}
	
	
}

