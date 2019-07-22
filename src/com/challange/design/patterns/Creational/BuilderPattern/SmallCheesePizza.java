package com.challange.design.patterns.Creational.BuilderPattern;

public class SmallCheesePizza extends VegPizza {
    @Override
    public String getName() {
        return "Cheeze Pizza";
    }

    @Override
    public String getSize() {
        return "small";
    }

    @Override
    public float getPrice() {
        return 170.0f;
    }
}
