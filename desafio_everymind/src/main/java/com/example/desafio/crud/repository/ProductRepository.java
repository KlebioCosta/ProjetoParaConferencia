package com.example.desafio.crud.repository;

import com.example.desafio.crud.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository  extends JpaRepository<Product, String> {
    List<Product> findAllByActiveTrue();
}
