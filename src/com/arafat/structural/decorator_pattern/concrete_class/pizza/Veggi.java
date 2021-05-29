package com.arafat.structural.decorator_pattern.concrete_class.pizza;

public class Veggi implements  Pizza {
    private  int price;

    public Veggi() {
        this.price = 200; //assuming

        System.out.println("Veggi Pizza added to Meal");

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
