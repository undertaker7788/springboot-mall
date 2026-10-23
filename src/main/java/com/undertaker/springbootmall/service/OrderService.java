package com.undertaker.springbootmall.service;

import com.undertaker.springbootmall.dto.CreateOrderRequest;
import com.undertaker.springbootmall.dto.OrderQueryParams;
import com.undertaker.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
