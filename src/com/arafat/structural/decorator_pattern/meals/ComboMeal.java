package com.arafat.structural.decorator_pattern.meals;

import com.arafat.structural.decorator_pattern.decorator.appetizer.Appetizer;
import com.arafat.structural.decorator_pattern.decorator.drinks.Drinks;
import com.arafat.structural.decorator_pattern.concrete_class.pizza.Pizza;

public class ComboMeal implements Meal {

    Pizza pizza;
    Appetizer appetizer;
    Drinks drinks;

    public ComboMeal(Pizza pizza, Appetizer appetizer, Drinks drinks) {
        this.pizza = pizza;
        this.appetizer = appetizer;
        this.drinks = drinks;
    }

    @Override
    public void addItem() {

    }
    public  ComboMeal(){

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

    public Drinks getDrinks() {
        return drinks;
    }

    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }

    @Override
    public boolean order() {
        return true;
    }
}
