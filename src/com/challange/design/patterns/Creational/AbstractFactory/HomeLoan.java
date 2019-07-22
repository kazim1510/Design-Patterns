package com.challange.design.patterns.Creational.AbstractFactory;

public class HomeLoan extends Loan {
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }
}
