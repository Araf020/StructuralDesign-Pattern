package com.arafat.structural.decorator_pattern;

import com.arafat.structural.decorator_pattern.decorator.appetizer.FrenchFry;
import com.arafat.structural.decorator_pattern.decorator.appetizer.OnionRings;
import com.arafat.structural.decorator_pattern.decorator.drinks.Coffee;
import com.arafat.structural.decorator_pattern.decorator.drinks.Coke;
import com.arafat.structural.decorator_pattern.concrete_class.pizza.Beef;
import com.arafat.structural.decorator_pattern.concrete_class.pizza.Pizza;
import com.arafat.structural.decorator_pattern.concrete_class.pizza.Veggi;

public class ServeMeal {

    /**
     * beefPizza with french fry;
     */

    public static Pizza getBeefPizzaWithFrenchFry(){
        Pizza beefpizza = new Beef();

        /**
         * Decorate with frenchFry;
         */
        beefpizza = new FrenchFry(beefpizza);
        return beefpizza;
    }

    public static   Pizza getVeggiPizzaWithOnionRings(){
        Pizza veggiPizza = new Veggi();

        /**
         * decorate with Onion Rings
         */

        veggiPizza = new OnionRings(veggiPizza);
        return veggiPizza;

    }

    public static Pizza getVeggiPizzaWithCoke_FrenchFry(){

        Pizza veggiPizzaWithOnionRings =  new Veggi();

        /**
         * decorate veggi pizza with french fry and coke....
         */

        veggiPizzaWithOnionRings = new Coke(new FrenchFry(veggiPizzaWithOnionRings));

        return veggiPizzaWithOnionRings;
    }

    public static Pizza getVeggiPizzaWithCoffe_OnionRings(){
        Pizza veggiPizza = new Veggi();

        /**
         * decorate veggi pizza with onion rings  and coffee....
         */
        veggiPizza = new Coffee(new OnionRings(veggiPizza));

        return veggiPizza;
    }


    public static Pizza getBeefPizza(){
        return new Beef();
    }


}
