package org.example;

public class Order implements OrderManager{
    private Warehouse warehouse;

    public Order(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void processOrder(Product product, int amount) {
        try {
            warehouse.decreaseQuantity(product, amount);
            System.out.println("Заказ успешно обработан. Товары списаны со склада.");
        } catch (IllegalArgumentException e){
            System.out.println("Ошибка обработки заказа: " + e.getMessage());
        }
    }
}
