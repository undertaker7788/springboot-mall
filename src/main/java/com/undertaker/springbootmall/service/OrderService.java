package com.undertaker.springbootmall.service;

import com.undertaker.springbootmall.dto.CreateOrderRequest;
import com.undertaker.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
