package com.gnp.demo.trupper.service;

import java.util.List;

import com.gnp.demo.trupper.model.ListaCompraResponse;
import com.gnp.demo.trupper.model.ListaCompraResquest;
import com.gnp.demo.trupper.model.Response;

public interface ListaCompraService {
	
	Response saveListaCompra(ListaCompraResquest resquest);
	
	Response putListaCompra(ListaCompraResquest resquest);
	
	List<ListaCompraResponse> getAllList();
	
	Response deleteListaCompra(Integer idLista);
	
}
