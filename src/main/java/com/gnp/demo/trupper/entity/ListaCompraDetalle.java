package com.gnp.demo.trupper.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "lista_compra_detalle")
public class ListaCompraDetalle {

	@EmbeddedId
	private ListaCompraDetallePk pk;
	
	@Column(name = "cantidad", nullable = false)
	private Integer cantidad;
	
}
