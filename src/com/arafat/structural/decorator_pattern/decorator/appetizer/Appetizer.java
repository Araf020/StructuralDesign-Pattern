package com.arafat.structural.decorator_pattern.decorator.appetizer;

import com.arafat.structural.decorator_pattern.decorator.BaseDecorator;
import com.arafat.structural.decorator_pattern.concrete_class.pizza.Pizza;

public abstract class Appetizer extends BaseDecorator {


    private Pizza pizza;


    public  Appetizer(Pizza pizza){
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
