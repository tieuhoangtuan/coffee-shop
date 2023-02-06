package com.coffeeshop.orderservice.repository;

import com.coffeeshop.orderservice.entity.OrderLineItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineItemRepository extends JpaRepository<OrderLineItem, Long> {
}
