package com.undertaker.springbootmall.dao;

import com.undertaker.springbootmall.model.Order;
import com.undertaker.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
