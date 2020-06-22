package com.epam.pizza.model.products;

public abstract class product {
    protected String name;

    protected  int value;

    product(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
