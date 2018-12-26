package com.jackiew.design.pattern.creational.abstract_factory_method;

public class ComputerFactory1 implements ComputerFactory {
    public Cpu getCpu() {
        return new IntelCpu();
    }

    public Motherboard getMotherboard() {
        return new GigaMotherboard();
    }
}
