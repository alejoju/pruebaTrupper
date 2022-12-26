package com.gnp.demo.trupper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gnp.demo.trupper.model.ListaCompraResponse;
import com.gnp.demo.trupper.model.ListaCompraResquest;
import com.gnp.demo.trupper.model.Response;
import com.gnp.demo.trupper.service.ListaCompraService;

@Controller
@RequestMapping("/rest/trupper/listaCompra")
public class ListaCompra {

	@Autowired
	private ListaCompraService listaCompraService;
	
	@PostMapping(consumes =  MediaType.APPLICATION_JSON_VALUE, produces =  MediaType.APPLICATION_JSON_VALUE)
	public final Response saveListacompras(
		@RequestBody final ListaCompraResquest resquest) {
		return listaCompraService.saveListaCompra(resquest);
	}
	
	@GetMapping(produces =  MediaType.APPLICATION_JSON_VALUE)
	public final List<ListaCompraResponse> getall() {
		return listaCompraService.getAllList();
	}
	
	@PutMapping(value = "/{idListaCompra}", consumes =  MediaType.APPLICATION_JSON_VALUE)
	public final Response putListaCompras(
			final Integer idListaCompra,
			final ListaCompraResquest resquest) {
		return listaCompraService.putListaCompra(resquest);
	}
	
	@DeleteMapping(value = "/{idListaCompra}", produces = MediaType.APPLICATION_JSON_VALUE)
	public final Response deleteListacompras(
		@PathVariable(name = "idListaCompra") final Integer idListaCompra) {
		return listaCompraService.deleteListaCompra(idListaCompra);
	}

}

