package com.coffeeshop.productservice.repository;

import com.coffeeshop.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
