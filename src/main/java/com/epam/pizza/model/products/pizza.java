package com.epam.pizza.model.products;

import java.util.List;

public class pizza {

    private String pizzaType;
    private String nutritionalValue;
    private int ccal;
    private List<Ingredients> ingredients;

    public pizza(String pizzaType, String nutritionalValue, int ccal, List<Ingredients> ingredients) {
        this.pizzaType = pizzaType;
        this.nutritionalValue = nutritionalValue;
        this.ccal = ccal;
        this.ingredients = ingredients;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public String getNutritionalValue() {
        return nutritionalValue;
    }

    public int getCcal() {
        return ccal;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }
}
