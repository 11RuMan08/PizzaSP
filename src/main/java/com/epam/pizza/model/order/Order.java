package com.epam.pizza.model.order;

import com.epam.pizza.model.products.pizza;
import com.epam.pizza.model.products.product;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<product> products;
    private String name;
    private String phoneNumber;
    private String address;
    private PayMethod payMethod;
    private int amountOfPizza;
    private int amountOfDrinks;

    public Order(String name, String phoneNumber, String address, PayMethod payMethod) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.payMethod = payMethod;
        amountOfPizza = amountOfDrinks = 0;
        products = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPayMethod(PayMethod payMethod) {
        this.payMethod = payMethod;
    }

    public List<product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public PayMethod getPayMethod() {
        return payMethod;
    }

    public int sum() {
       int sum=0;
       for (product product : products) {
           sum += product.getValue();
       }
       return sum;
    }

    public boolean addProduct(product newProduct) {
       if ((newProduct instanceof pizza) && (amountOfPizza<5))
       {
           amountOfPizza+=1;
           products.add(newProduct);
           return true;
       }
       else {
           if (amountOfDrinks<4)
           {
               amountOfDrinks+=1;
               products.add(newProduct);
               return true;
           }
       }
       return false;
    }

    public void deleteProduct(product oldProduct) {
        if (products.remove(oldProduct)) {
            if (oldProduct instanceof pizza) {
                amountOfPizza--;
            }
            else {
                amountOfDrinks--;
            }
        }
    }
}


