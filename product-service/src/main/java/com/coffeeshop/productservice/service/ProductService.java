package com.coffeeshop.productservice.service;

import com.coffeeshop.productservice.dto.ProductRequest;
import com.coffeeshop.productservice.dto.ProductResponse;
import com.coffeeshop.productservice.entity.Product;
import com.coffeeshop.productservice.repository.ProductRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
    }

    public List<ProductResponse> getALlProducts(){
        List<Product> products = productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(@NotNull Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }
}
