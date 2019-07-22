package com.challange.design.patterns.Creational.Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public void doSomething() {
        System.out.println("This is singleton");
    }

    // syncronized (instance will be created when it is required)
        public Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}
