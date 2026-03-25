package com.mx.Tarea.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TAREA")
public class Tarea {

    @Id
    @Column(name = "ID")
    private Long id;

    private String descripcion;

    private boolean completada;
    
    public Tarea() {
    	
    }

	public Tarea(Long id, String descripcion, boolean completada) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.completada = completada;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isCompletada() {
		return completada;
	}

	public void setCompletada(boolean completada) {
		this.completada = completada;
	}

	@Override
	public String toString() {
		return "Tarea [id=" + id + ", descripcion=" + descripcion + ", completada=" + completada + "]";
	}
    
    
    
}
