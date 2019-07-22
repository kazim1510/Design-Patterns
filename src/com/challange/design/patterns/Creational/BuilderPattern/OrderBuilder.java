package com.challange.design.patterns.Creational.BuilderPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {

    public OrderedItems preparePizza() throws IOException {
        OrderedItems items = new OrderedItems();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Enter the choice of Pizza ");
        System.out.println("============================");
        System.out.println("        1. Veg-Pizza       ");
        System.out.println("        2. Non-Veg Pizza   ");
        System.out.println("        3. Exit            ");
        System.out.println("============================");

        int choice = Integer.parseInt(reader.readLine());

        switch (choice) {
            case 1:
                System.out.println("You ordered Veg Pizza");
                System.out.println("\n\n");
                System.out.println(" Enter the types of Veg-Pizza ");
                System.out.println("------------------------------");
                System.out.println("        1.Cheeze Pizza        ");
                System.out.println("        2.Onion Pizza        ");
                System.out.println("        3.Masala Pizza        ");
                System.out.println("        4.Exit            ");
                System.out.println("------------------------------");
                int pizzaChoice = Integer.parseInt(reader.readLine());
                switch (pizzaChoice) {
                    case 1:
                        System.out.println("You ordered Cheeze Pizza");

                        System.out.println("Enter the cheeze pizza size");
                        System.out.println("------------------------------------");
                        System.out.println("    1. Small Cheeze Pizza ");
                        System.out.println("    2. Medium Cheeze Pizza ");
                        System.out.println("    3. Large Cheeze Pizza ");
                        System.out.println("    4. Extra-Large Cheeze Pizza ");
                        System.out.println("------------------------------------");
                        int size = Integer.parseInt(reader.readLine());
                        switch (size) {
                            case 1:
                                items.addItems(new SmallCheesePizza());
                                break;
                            case 2:
                                items.addItems(new MediumCheesePizza());
                                break;
                        }
                }
        }

        return items;

    }
}
