package com.example.teamZero.domain.repository;

import com.example.teamZero.domain.dto.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<Product> getProduct(int productId);
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarsetProducts(int quantity);
    Product save(Product product);
    void delete(int productId);
}
