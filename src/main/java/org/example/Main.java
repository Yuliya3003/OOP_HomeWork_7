package org.example;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        System.out.println(warehouse.getProductList());
        warehouse.decreaseQuantity(warehouse.getProductList().get(0), 5);
        warehouse.increaseQuantity(warehouse.getProductList().get(1), 5);
        warehouse.addProduct(new Product("Carrot", 34, 2.1));
        warehouse.deleteProduct(warehouse.getProductList().get(2));
        System.out.println(warehouse.getProductList());
        Order order = new Order(warehouse);
        order.processOrder(warehouse.getProductList().get(0), 3);
        System.out.println(warehouse.getProductList());
    }
}
