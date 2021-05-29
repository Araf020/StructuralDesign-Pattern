package com.arafat.structural.decorator_pattern.decorator.drinks;

import com.arafat.structural.decorator_pattern.decorator.BaseDecorator;
import com.arafat.structural.decorator_pattern.concrete_class.pizza.Pizza;

public abstract class Drinks extends BaseDecorator {

    private Pizza pizza;


    public  Drinks(Pizza pizza){
        this.pizza = pizza;
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
