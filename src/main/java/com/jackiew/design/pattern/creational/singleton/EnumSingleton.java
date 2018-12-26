package com.jackiew.design.pattern.creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
        System.out.println("do some initialziation work here");
    }

    public void doSomething() {
        System.out.println("do something");
    }
}
