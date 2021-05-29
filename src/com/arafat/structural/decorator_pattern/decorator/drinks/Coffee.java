package com.arafat.structural.decorator_pattern.decorator.drinks;

import com.arafat.structural.decorator_pattern.concrete_class.pizza.Pizza;

public class Coffee extends Drinks{
    private  int price;

    public Coffee(Pizza pizza) {
        super(pizza);
        this.price=50 + pizza.getPrice();
        System.out.println("Coffee added to meal");
    }

    @Override
    public void getDescription() {
        super.getDescription();
    }

    @Override
    public void servePizza() {
        super.servePizza();
    }

    @Override
    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


}
