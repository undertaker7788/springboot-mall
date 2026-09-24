package com.undertaker.springbootmall.service;

import com.undertaker.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
}