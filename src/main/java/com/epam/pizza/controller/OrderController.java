package com.epam.pizza.controller;

import com.epam.pizza.model.products.Drink;
import com.epam.pizza.model.products.Ingredients;
import com.epam.pizza.model.products.pizza;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class OrderController {

    private static final String HELLO_WORLD = "Test";
    private List<Ingredients> ingredient = new ArrayList<Ingredients>(Arrays.asList(Ingredients.CHEESE,Ingredients.TOMATO,Ingredients.CHICKEN));
    private Drink drink_obj = new Drink("Morse",500,1);
    private pizza pizza_obj = new pizza("4 cheeses",450,"open","14/18/16",283,ingredient);

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return HELLO_WORLD;
    }

    @GetMapping("/GetDrinkInfo")
    public Drink getDrinkInfo() {
        return drink_obj;
    }

    @GetMapping("/GetPizzaInfo")
    public pizza getPizzaInfo() {
        return pizza_obj;
    }
/*
    @GetMapping("/GetPizzaIngredients")
    public List getPizzaIngredients(pizza prod) {
        return prod.getIngredients();
    }
*/

    @PostMapping("/CreateOrder")
    public boolean createOrder() {
        return true;
    }

}
