package org.example;


import java.util.List;

public interface WarehouseManager {
    List<Product> decreaseQuantity(Product product, int amount);
    List<Product> increaseQuantity(Product product, int amount);

    List<Product> addProduct(Product product);

    List<Product> deleteProduct(Product product);
}
