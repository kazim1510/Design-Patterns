package com.challange.design.patterns.Creational.AbstractFactory;

public class CarLoan extends Loan{
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }
}
