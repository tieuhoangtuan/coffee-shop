package com.coffeeshop.productservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "menu_product")
@AllArgsConstructor
@NoArgsConstructor
public class Product_menu {
    @Id
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "menu_id")
    private Long menuId;
}
