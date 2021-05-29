package com.arafat.structural.decorator_pattern.meals;

import com.arafat.structural.decorator_pattern.decorator.appetizer.Appetizer;
import com.arafat.structural.decorator_pattern.concrete_class.pizza.Pizza;

public class NormalMeal implements  Meal {

    Pizza pizza;
    Appetizer appetizer;

    public NormalMeal(Pizza pizza, Appetizer appetizer) {
        this.pizza = pizza;
        this.appetizer = appetizer;
    }

    @Override
    public void addItem() {

    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Appetizer getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(Appetizer appetizer) {
        this.appetizer = appetizer;
    }

    @Override
    public boolean order() {
        return true;
    }
}
