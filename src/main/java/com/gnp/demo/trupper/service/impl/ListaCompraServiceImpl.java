package com.gnp.demo.trupper.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gnp.demo.trupper.entity.Clientes;
import com.gnp.demo.trupper.entity.ListaCompra;
import com.gnp.demo.trupper.entity.ListaCompraDetalle;
import com.gnp.demo.trupper.entity.ListaCompraDetallePk;
import com.gnp.demo.trupper.entity.Productos;
import com.gnp.demo.trupper.exception.TrupperException;
import com.gnp.demo.trupper.model.ListaCompraResponse;
import com.gnp.demo.trupper.model.ListaCompraResquest;
import com.gnp.demo.trupper.model.ListaProductos;
import com.gnp.demo.trupper.model.Response;
import com.gnp.demo.trupper.repository.ClienteRepository;
import com.gnp.demo.trupper.repository.ListaCompraDetalleRepository;
import com.gnp.demo.trupper.repository.ListaCompraRepository;
import com.gnp.demo.trupper.repository.ProductosRepository;
import com.gnp.demo.trupper.service.ListaCompraService;

@Service
public class ListaCompraServiceImpl implements ListaCompraService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ProductosRepository productosRepository;
	
	@Autowired
	private ListaCompraRepository listaCompraRepository;
	
	@Autowired
	private ListaCompraDetalleRepository listaCompraDetalleRepository;

	@Transactional
	@Override
	public Response saveListaCompra(ListaCompraResquest resquest) {
		Clientes cliente = clienteRepository.findById(resquest.getCliente())
		.orElseThrow(() -> new TrupperException("El cliente " + resquest.getCliente() + " no existe"));
		
		resquest.getListaProductos().forEach(producto -> {
			productosRepository.getProducotByClave(producto.getIdProducto())
			.orElseThrow(() -> new TrupperException(
			  "El producto " + producto.getIdProducto() + " no existe"));
		});
		
		ListaCompra listaCompra = new ListaCompra();
		listaCompra.setCliente(cliente);
		listaCompra.setFechaRegistro(LocalDateTime.now());
		listaCompra.setFechaUltimaActualizacion(LocalDateTime.now());
		listaCompra.setNombre(resquest.getNombreLista());
		listaCompra.setActivo(true);
		listaCompra = listaCompraRepository.save(listaCompra);
		
		for (ListaProductos producto: resquest.getListaProductos()){
			ListaCompraDetalle listaCompraDetalle = new ListaCompraDetalle();
			ListaCompraDetallePk pk = new ListaCompraDetallePk();
			System.out.println("----- " + listaCompra.getIdLista());
			pk.setIdListaCompra(listaCompra.getIdLista());
			
			Optional<Productos> opPro = productosRepository.getProducotByClave(producto.getIdProducto());
			System.out.println("----- " + opPro.get().getIdProducto());
			pk.setIdCodigoProducto(opPro.get().getIdProducto());
			listaCompraDetalle.setPk(pk);
			listaCompraDetalle.setCantidad(producto.getCantidad());
			listaCompraDetalleRepository.save(listaCompraDetalle);
		}
		
		Response response = new Response();
		return response;
	}
	
	@Transactional
	@Override
	public Response putListaCompra(final ListaCompraResquest resquest) {
		Response response = new Response();
		return response;
	}

	@Override
	public List<ListaCompraResponse> getAllList() {
		return null;
	}

	@Override
	public Response deleteListaCompra(final Integer idLista) {
		ListaCompra listaCompra = listaCompraRepository.findById(idLista)
		 .orElseThrow(
		   () -> new TrupperException("La lista de compra no existe"));
		
		listaCompraRepository.delete(listaCompra);
		
		Response response = new Response();
		response.setPayload("Registro eliminado correctamente");
		return response;
	}
	
	
	
}
