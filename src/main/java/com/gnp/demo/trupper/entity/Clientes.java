package com.gnp.demo.trupper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Clientes")
public class Clientes {

	@Id
	@Column(name = "id_cliente", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "activo")
	private Boolean activo;
	
}
