package com.undertaker.springbootmall.dao;

import com.undertaker.springbootmall.dto.ProductQueryParams;
import com.undertaker.springbootmall.dto.ProductRequest;
import com.undertaker.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}