package com.epam.pizza.model.products;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        product product = (product) o;
        return value == product.value &&
                name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}
