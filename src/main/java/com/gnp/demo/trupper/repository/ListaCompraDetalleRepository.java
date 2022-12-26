package com.gnp.demo.trupper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gnp.demo.trupper.entity.ListaCompraDetalle;

@Repository
public interface ListaCompraDetalleRepository extends JpaRepository<ListaCompraDetalle, Integer> {

}
