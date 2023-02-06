package com.coffeeshop.orderservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {
    private Long customerId;
    private Long storeId;
    private List<OrderLineItemDto> orderLineItemDtoList;
}
