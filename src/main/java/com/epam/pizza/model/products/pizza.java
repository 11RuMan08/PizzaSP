package com.epam.pizza.model.products;

import java.util.List;

public class pizza extends product{

    private String pizzaType;
    private String nutritionalValue;
    private int ccal;
    private List<Ingredients> ingredients;

    public pizza(String name, int value, String pizzaType, String nutritionalValue, int ccal, List<Ingredients> ingredients) {
        super(name, value);
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
