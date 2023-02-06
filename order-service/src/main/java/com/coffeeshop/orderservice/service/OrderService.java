package com.coffeeshop.orderservice.service;

import com.coffeeshop.orderservice.dto.OrderLineItemDto;
import com.coffeeshop.orderservice.dto.OrderRequest;
import com.coffeeshop.orderservice.entity.Order;
import com.coffeeshop.orderservice.entity.OrderLineItem;
import com.coffeeshop.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){
        Order newOrder = new Order();
        List<OrderLineItem> orderLineItemList = orderRequest.getOrderLineItemDtoList()
                .stream()
                .map(this::mapToDto).toList();

        Double totalPrice = orderRequest.getOrderLineItemDtoList()
                .stream()
                .map(orderItem -> orderItem.getQuantity()*orderItem.getPrice())
                .reduce(0.0, Double::sum);

        newOrder.setCustomerId(orderRequest.getCustomerId());
        newOrder.setStoreId(orderRequest.getStoreId());
        newOrder.setOrderLineItemList(orderLineItemList);
        newOrder.setTotal(totalPrice);

        orderRepository.save(newOrder);

    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    private OrderLineItem mapToDto(OrderLineItemDto orderLineItemDto){
        OrderLineItem orderLineItem = new OrderLineItem();
        orderLineItem.setPrice(orderLineItemDto.getPrice());
        orderLineItem.setQuantity(orderLineItemDto.getQuantity());
        orderLineItem.setProductId(orderLineItemDto.getProductId());
        return orderLineItem;
    }
}
