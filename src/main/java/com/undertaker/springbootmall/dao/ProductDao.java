package com.undertaker.springbootmall.dao;

import com.undertaker.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}