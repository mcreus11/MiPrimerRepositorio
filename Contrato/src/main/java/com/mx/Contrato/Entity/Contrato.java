package com.mx.Contrato.Entity;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Contrato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idContrato;
	@CreationTimestamp
	private LocalDate fechainicio;
	@Enumerated(EnumType.STRING)
	private TipoContrato tipo;
	private int trabajadorId;

}
