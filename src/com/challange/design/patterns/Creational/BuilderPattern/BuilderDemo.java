package com.challange.design.patterns.Creational.BuilderPattern;

import java.io.IOException;

public class BuilderDemo {
    public static void main(String[] args) throws IOException {
        OrderBuilder builder = new OrderBuilder();

        OrderedItems items = builder.preparePizza();
        items.showItems();
        System.out.println("Total cost: " + items.getCost());
    }
}
