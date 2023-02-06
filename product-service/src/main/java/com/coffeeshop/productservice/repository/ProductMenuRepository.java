package com.coffeeshop.productservice.repository;

import com.coffeeshop.productservice.entity.Product_menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductMenuRepository extends JpaRepository<Product_menu, Long> {
}
