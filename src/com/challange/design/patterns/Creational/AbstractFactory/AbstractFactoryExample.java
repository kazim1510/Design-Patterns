package com.challange.design.patterns.Creational.AbstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryExample {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the name of Bank from where you want to take loan amount: ");
            String bankName = reader.readLine();

            AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
            Bank bank = bankFactory.getBank(bankName);

            System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");
            String loanName = reader.readLine();
            AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
            Loan loan = loanFactory.getLoan(loanName);

            System.out.print("Enter the interest rate for " + bank.getBankName() + ": ");
            double rate = Double.parseDouble(reader.readLine());

            System.out.print("Enter the loan amount you want to take: ");
            double loanAmount = Double.parseDouble(reader.readLine());

            System.out.print("Enter the number of years to pay your entire loan amount: ");
            int years = Integer.parseInt(reader.readLine());

            loan.getInterestRate(rate);
            loan.calculateRate(loanAmount, years);
    }
}
