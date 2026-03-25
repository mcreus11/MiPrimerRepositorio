package com.mx.Cajero.Dominio;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DENOMINACIONES")
public class Denominacion {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DENOMINACION")
    private Long idDenominacion;

    @Column(name = "TIPO")
    private String tipo;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @Column(name = "CANTIDAD")
    private int cantidad;
    
    public Denominacion() {
    	
    }

	public Denominacion(Long idDenominacion, String tipo, BigDecimal valor, int cantidad) {
		super();
		this.idDenominacion = idDenominacion;
		this.tipo = tipo;
		this.valor = valor;
		this.cantidad = cantidad;
	}

	public Long getIdDenominacion() {
		return idDenominacion;
	}

	public void setIdDenominacion(Long idDenominacion) {
		this.idDenominacion = idDenominacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Denominacion [idDenominacion=" + idDenominacion + ", tipo=" + tipo + ", valor=" + valor + ", cantidad="
				+ cantidad + "]";
	}
    
   
    
    

}
