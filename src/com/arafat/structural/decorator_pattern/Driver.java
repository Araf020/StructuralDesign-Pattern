package com.arafat.structural.decorator_pattern;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {


        /**
         *
         * beefPizza = 150, VeggiPizza = 200;
         * french fry = 100, onionRings = 100;
         * coke=50, Coffee= 50;
         *
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n*Assuming beefPizza = 150, VeggiPizza = 200;\n" +
                "* french fry = 100, onionRings = 100;\n" +
                "* coke=50, Coffee= 50;\n\n");
        while (true) {
            System.out.println("\n\n1. Beef Pizza with French fry\n" +
                    "2. Veggi Pizza with onion rings\n" +
                    "3. A combo meal with Veggi Pizza, French Fry and Coke\n" +
                    "4. A combo meal with Veggi Pizza, Onion Rings and Coffee\n" +
                    "5. A Beef Pizza only\n"+
                    "ANY KEY TO EXIT\n");
            System.out.println("Choose an option: ");


            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println();
                System.out.println(ServeMeal.getBeefPizzaWithFrenchFry().getPrice()); // price = 150 + 100 = 250
            }
            else if (input.equals("2")) {
                System.out.println();
                System.out.println(ServeMeal.getVeggiPizzaWithOnionRings().getPrice()); //price = 200 + 100 =300
            }
            else if (input.equals("3")) {
                System.out.println();
                System.out.println(ServeMeal.getVeggiPizzaWithCoke_FrenchFry().getPrice()); //price = 200 + 100 + 50 =350
            }

            else if (input.equals("4")) {
                System.out.println();
                System.out.println(ServeMeal.getVeggiPizzaWithCoffe_OnionRings().getPrice()); //price = 200 + 50 + 100 =350
            }


            else if (input.equals("5")) {
                System.out.println();
                System.out.println(ServeMeal.getBeefPizza().getPrice()); //price = 150;
            }

            else {
                return;
            }

        }
    }
}
