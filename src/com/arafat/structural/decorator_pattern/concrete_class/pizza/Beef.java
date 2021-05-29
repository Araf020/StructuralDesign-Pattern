package com.arafat.structural.decorator_pattern.concrete_class.pizza;

public class Beef implements Pizza {
    private  int price;

    public Beef() {
        this.price = 150; //assuming

        System.out.println("Beef Pizza added to Meal");

    }
    @Override

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void servePizza() {

    }

    @Override
    public void getDescription() {

    }

}
