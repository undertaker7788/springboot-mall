package com.undertaker.springbootmall.service;

import com.undertaker.springbootmall.dto.ProductRequest;
import com.undertaker.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}