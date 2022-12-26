package com.gnp.demo.trupper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gnp.demo.trupper.entity.ListaCompra;

@Repository
public interface ListaCompraRepository extends JpaRepository<ListaCompra, Integer> {

}
