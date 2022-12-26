package com.gnp.demo.trupper.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "lista_compra")
public class ListaCompra {

	@Id
	@Column(name = "id_lista", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLista;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente", nullable = false)
	private Clientes cliente;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "fecha_registro", nullable = true)
	private LocalDateTime fechaRegistro;
	
	@Column(name = "fecha_ultima_actualizacion", nullable = true)
	private LocalDateTime fechaUltimaActualizacion;
	
	@Column(name = "activo", nullable = true)
	private Boolean activo;
	
}
