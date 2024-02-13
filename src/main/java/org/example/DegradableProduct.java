package org.example;


public class DegradableProduct extends Product{
    private int expirationDate;

    public DegradableProduct(String name, Integer amount, Double price, int expirationDate) {
        super(name, amount, price);
        this.expirationDate = expirationDate;
    }

}
