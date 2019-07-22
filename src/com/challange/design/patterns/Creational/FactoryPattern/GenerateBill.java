package com.challange.design.patterns.Creational.FactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

    public static void main(String[] args) throws IOException {
        PlanFactory factory = new PlanFactory();
        String exit = "";
        while(!exit.equals("exit")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String planName = reader.readLine();
            Plan plan = factory.getPlan(planName);

            int units = Integer.parseInt(reader.readLine());

            System.out.println("Bill Amount for " + planName + " of " + units + " units is");
            plan.getRate();
            plan.calculateRate(units);
            exit = reader.readLine();
        }
    }
}
