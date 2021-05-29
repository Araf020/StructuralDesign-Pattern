package com.arafat.structural.decorator_pattern.decorator.appetizer;

import com.arafat.structural.decorator_pattern.concrete_class.pizza.Pizza;

public class FrenchFry extends Appetizer {

    private int price;

    public FrenchFry(Pizza pizza) {

        super(pizza);
        this.price = 100 + pizza.getPrice();

        System.out.println("French Fry added to Meal");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    @Override
    public void getDescription() {
        super.getDescription();
    }

    @Override
    public void servePizza() {
        super.servePizza();
    }
}
