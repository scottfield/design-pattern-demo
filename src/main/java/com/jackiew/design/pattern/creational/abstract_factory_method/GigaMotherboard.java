package com.jackiew.design.pattern.creational.abstract_factory_method;

public class GigaMotherboard implements Motherboard {

    public boolean installCpu(Cpu cpu) {
        System.out.println("cpu pins" + cpu.getPins());
        System.out.println("cpu match");
        return true;
    }
}
