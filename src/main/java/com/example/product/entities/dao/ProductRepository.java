package com.example.product.entities.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.product.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

	Optional<Product> findById(Long id);
	
}
