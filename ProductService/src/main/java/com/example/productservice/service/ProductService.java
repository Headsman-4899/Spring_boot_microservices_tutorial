package com.example.productservice.service;

import com.example.productservice.model.ProductRequest;
import com.example.productservice.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);
    ProductResponse getProductById(long productId);
    void reduceQuantity(long productId, long quantity);
}
