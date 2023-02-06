package com.coffeeshop.orderservice.dto;

import lombok.Data;

@Data
public class OrderLineItemDto {
    private Long productId;

    private Double price;

    private Integer quantity;
}
