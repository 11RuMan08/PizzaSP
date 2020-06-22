package com.epam.pizza.model.products;

public class Drink extends product{
    private int size;

    public Drink(String name, int value, int size) {
        super(name, value);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
