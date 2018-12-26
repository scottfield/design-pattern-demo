package com.jackiew.design.pattern.creational.singleton;

public class TestEnumSingleton {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        EnumSingleton.INSTANCE.doSomething();
    }
}
