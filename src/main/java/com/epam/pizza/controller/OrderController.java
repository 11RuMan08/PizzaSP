package com.epam.pizza.controller;

import com.epam.pizza.model.products.Drink;
import com.epam.pizza.model.products.pizza;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    private static final String HELLO_WORLD = "Test";

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return HELLO_WORLD;
    }
/*
    @GetMapping("/GetProducts")
    public List getProducts() {
        return null;
    }
    @GetMapping("/GetUserInfo")
    public List getUserInfo(Order order) {
        List<String> info = new ArrayList<>();
        info.add(order.getName());
        info.add(order.getAddress());
        info.add(order.getPhoneNumber());
        return info;
    }

    @GetMapping("/GetUserPayMethod")
    public PayMethod getPayMethod(Order order) {
       return order.getPayMethod();
    }
 */

    @GetMapping("/GetDrinkInfo")
    public List getDrinkInfo(Drink drink) {
        List<String> info = new ArrayList<>();
        info.add(drink.getName());
        info.add(Integer.toString(drink.getSize()));
        info.add(Integer.toString(drink.getValue()));
        return info;
    }

    @GetMapping("/GetPizzaInfo")
    public List getPizzaInfo(pizza prod) {
        List<String> info = new ArrayList<>();
        info.add(prod.getName());
        info.add(Integer.toString(prod.getValue()));
        info.add(Integer.toString(prod.getCcal()));
        info.add(prod.getPizzaType());
        info.add(prod.getNutritionalValue());
        return info;
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
