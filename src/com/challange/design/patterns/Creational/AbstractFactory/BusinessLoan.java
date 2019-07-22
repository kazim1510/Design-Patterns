package com.challange.design.patterns.Creational.AbstractFactory;

public class BusinessLoan  extends Loan{
    @Override
    public void getInterestRate(double r) {
        rate = r;
    }
}
