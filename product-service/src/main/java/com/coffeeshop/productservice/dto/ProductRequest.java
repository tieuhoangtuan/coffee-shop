package com.coffeeshop.productservice.dto;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private Double price;
}
