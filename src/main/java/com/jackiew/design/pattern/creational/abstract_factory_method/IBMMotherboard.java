package com.jackiew.design.pattern.creational.abstract_factory_method;

public class IBMMotherboard implements Motherboard {
    public boolean installCpu(Cpu cpu) {
        System.out.println("cpu pins" + cpu.getPins());
        System.out.println("IBMMotherboard match cpu");
        return true;
    }
}
