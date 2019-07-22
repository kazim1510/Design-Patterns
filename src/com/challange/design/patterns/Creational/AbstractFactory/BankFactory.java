package com.challange.design.patterns.Creational.AbstractFactory;

public class BankFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("ANZ")){
            return new ANZBank();
        } else if(bank.equalsIgnoreCase("COMM")){
            return new Commbank();
        } else if(bank.equalsIgnoreCase("NAB")){
            return new NABBank();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
