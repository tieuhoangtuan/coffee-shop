package com.coffeeshop.productservice.controller;

import com.coffeeshop.productservice.dto.ProductRequest;
import com.coffeeshop.productservice.dto.ProductResponse;
import com.coffeeshop.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public void createProduct(@RequestBody ProductRequest productRequest){
        productService.createProduct(productRequest);
    }

    @GetMapping
    public List<ProductResponse> getAllProducts(){
        return productService.getALlProducts();
    }
}
