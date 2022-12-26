package com.gnp.demo.trupper.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ListaCompraResquest {

	private Integer cliente;
	private String nombreLista;
	private List<ListaProductos> listaProductos;
	
}
