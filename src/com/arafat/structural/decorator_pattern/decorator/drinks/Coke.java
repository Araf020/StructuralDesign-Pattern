package com.arafat.structural.decorator_pattern.decorator.drinks;

import com.arafat.structural.decorator_pattern.concrete_class.pizza.Pizza;

public class Coke extends   Drinks{

    private  int price;

    public Coke(Pizza pizza) {
        super(pizza);
        this.price=50 + pizza.getPrice();

        System.out.println("Coke added to Meal");
    }

    @Override
    public void getDescription() {
        super.getDescription();
    }

    @Override
    public void servePizza() {
        super.servePizza();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

