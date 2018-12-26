package com.jackiew.design.pattern.creational.singleton;

public class Singleton {
    private Singleton() {

    }

    private static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        Singleton.getInstance();
    }
}
