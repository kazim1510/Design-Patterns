package com.challange.design.patterns.Creational.FactoryPattern;

/**
 * A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.
 *
 * The Factory Method Pattern is also known as Virtual Constructor.
 *
 * <br>
 * Advantage of Factory Design Pattern
 * <br>
 * Factory Method Pattern allows the sub-classes to choose the type of objects to create.
 * It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code.
 * That means the code interacts solely with the resultant interface or abstract class,
 * so that it will work with any classes that implement that interface or that extends that abstract class.
 * <br>
 * Usage of Factory Design Pattern
 * <br>
 * When a class doesn't know what sub-classes will be required to create
 * When a class wants that its sub-classes specify the objects to be created.
 * When the parent classes choose the creation of objects to its sub-classes.
 */
public class PlanFactory {

    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equals("DOMESTIC")) {
            return new DomesticPlan();
        } else if (planType.equals("INSTITUTIONAL")) {
            return new InstitutionalPlan();
        } else if (planType.equals("COMMERCIAL")) {
            return new CommercialPlan();
        }
        return null;
    }
}
