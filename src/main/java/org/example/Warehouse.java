package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Warehouse implements WarehouseManager{

    private List<Product> productList;

    private List<Product> addProducts(){
        List<Product> result = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            result.add(new DegradableProduct("Milk", new Random().nextInt(100), new Random().nextDouble(),10));
            result.add(new Product("Soap", new Random().nextInt(100), new Random().nextDouble()));
        }
        return result;
    }

    public Warehouse() {
        productList = addProducts();
    }

    @Override
    public List<Product> decreaseQuantity(Product product, int amount) {
        List<Product> updatedList = new ArrayList<>();
        for (Product storedProduct:productList
             ) {
            if (storedProduct.equals(product)) {
                int newQuantity = storedProduct.getAmount()-amount;
                if (newQuantity >=0){
                    storedProduct.setAmount(newQuantity);
                } else {throw new IllegalArgumentException("Недостаточное количество товаров на складе");}
            }
            updatedList.add(storedProduct);
        }
        return updatedList;
    }

    @Override
    public List<Product> increaseQuantity(Product product, int amount) {
        List<Product> updatedList = new ArrayList<>();
        for (Product storedProduct:productList
        ) {
            if (storedProduct.equals(product)) {
                int newQuantity = storedProduct.getAmount()+amount;
                storedProduct.setAmount(newQuantity);
            }
            updatedList.add(storedProduct);
        }
        return updatedList;
    }

    @Override
    public List<Product> addProduct(Product product) {
        productList.add(product);
        return productList;
    }

    @Override
    public List<Product> deleteProduct(Product product) {
        productList.remove(product);
        return productList;
    }

    public List<Product> getProductList(){
        return productList;
    }
}
