package com.example.orderservice.service;

import com.example.orderservice.model.OrderRequest;
import com.example.orderservice.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
