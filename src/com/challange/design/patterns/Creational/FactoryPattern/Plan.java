package com.challange.design.patterns.Creational.FactoryPattern;

public abstract class Plan {
    protected double rate;
    abstract void getRate();

    public void calculateRate(int units){
        System.out.println(units * rate);
    }
}
