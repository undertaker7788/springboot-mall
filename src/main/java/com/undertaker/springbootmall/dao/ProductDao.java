package com.undertaker.springbootmall.dao;

import com.undertaker.springbootmall.dto.ProductRequest;
import com.undertaker.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}