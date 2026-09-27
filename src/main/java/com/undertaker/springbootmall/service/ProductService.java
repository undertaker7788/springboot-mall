package com.undertaker.springbootmall.service;

import com.undertaker.springbootmall.constant.ProductCategory;
import com.undertaker.springbootmall.dto.ProductRequest;
import com.undertaker.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}