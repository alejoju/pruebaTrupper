package com.gnp.demo.trupper.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Embeddable
public class ListaCompraDetallePk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "id_lista_compra", nullable = false)
	private Integer idListaCompra;
	
	@Column(name = "id_codigo_producto", nullable = false)
	private Integer idCodigoProducto;
	
}
