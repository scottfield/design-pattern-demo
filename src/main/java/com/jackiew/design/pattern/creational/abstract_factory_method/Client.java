package com.jackiew.design.pattern.creational.abstract_factory_method;

public class Client {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory1();
        Cpu cpu = factory.getCpu();
        Motherboard motherboard = factory.getMotherboard();
        motherboard.installCpu(cpu);

        factory = new ComputerFactory2();
        cpu = factory.getCpu();
        motherboard = factory.getMotherboard();
        motherboard.installCpu(cpu);

    }
}
