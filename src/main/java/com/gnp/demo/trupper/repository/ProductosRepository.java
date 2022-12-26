package com.gnp.demo.trupper.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gnp.demo.trupper.entity.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer> {

	@Query(value = "select p From Productos p "
			+ "where p.clave = ?1 ")
	Optional<Productos> getProducotByClave(String clave);
	
}
