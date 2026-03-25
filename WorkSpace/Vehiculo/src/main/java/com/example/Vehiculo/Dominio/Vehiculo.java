package com.example.Vehiculo.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VEHICULOS")
public class Vehiculo {

    @Id
    @Column(name = "ID_VEHICULO", columnDefinition = "NUMBER")
    private int id;

    @Column(name = "MARCA", columnDefinition = "NVARCHAR2(100)")
    private String marca;

    @Column(name = "MODELO", columnDefinition = "NVARCHAR2(100)")
    private String modelo;

    @Column(name = "MATRICULA", columnDefinition = "NVARCHAR2(50)")
    private String matricula;

    @Column(name = "ANO_FABRICACION", columnDefinition = "NUMBER")
    private Integer anoFabricacion;

    // Constructor vacío
    public Vehiculo() {
    }

	public Vehiculo(int id, String marca, String modelo, String matricula, Integer anoFabricacion) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.anoFabricacion = anoFabricacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Integer getAnoFabricacion() {
		return anoFabricacion;
	}

	public void setAnoFabricacion(Integer anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula
				+ ", anoFabricacion=" + anoFabricacion + "]";
	}
    
    
}
