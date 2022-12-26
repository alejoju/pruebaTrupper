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
@Table(name = "Productos")
public class Productos {

	@Id
	@Column(name = "id_producto", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	
	@Column(name = "clave", nullable = false)
	private String clave;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@Column(name = "activo", nullable = true)
	private Boolean activo;
	
}
