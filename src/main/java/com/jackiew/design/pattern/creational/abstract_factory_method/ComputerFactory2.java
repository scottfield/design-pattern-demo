package com.jackiew.design.pattern.creational.abstract_factory_method;

public class ComputerFactory2 implements ComputerFactory {
    public Cpu getCpu() {
        return new AMDCpu();
    }

    public Motherboard getMotherboard() {
        return new IBMMotherboard();
    }
}
