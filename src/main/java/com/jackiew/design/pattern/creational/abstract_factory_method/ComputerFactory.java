package com.jackiew.design.pattern.creational.abstract_factory_method;

public interface ComputerFactory {
    Cpu getCpu();

    Motherboard getMotherboard();
}
