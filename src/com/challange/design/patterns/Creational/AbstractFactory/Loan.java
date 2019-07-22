package com.challange.design.patterns.Creational.AbstractFactory;

public abstract class Loan {

    protected double rate;

    public abstract void getInterestRate(double rate);

    public void calculateRate(double loanAmount, int tenure) {
        double EMI;
        int n;

        n = tenure * 12;
        rate = rate / 1200;
        EMI = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanAmount;
        System.out.println("your monthly EMI is " + EMI + " for the amount" + loanAmount + " you have borrowed");
    }

}
