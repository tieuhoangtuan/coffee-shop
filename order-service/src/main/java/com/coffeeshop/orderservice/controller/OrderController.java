package com.coffeeshop.orderservice.controller;

import com.coffeeshop.orderservice.dto.OrderRequest;
import com.coffeeshop.orderservice.entity.Order;
import com.coffeeshop.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping
    public void placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
    }

    @GetMapping
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }
}
