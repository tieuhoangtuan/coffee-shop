package com.coffeeshop.orderservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "Order_LineItem")
public class OrderLineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;

    private Double price;

    private Integer quantity;

    public OrderLineItem(Long productId, Double price, Integer quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }
}
