package com.jackiew.design.pattern.creational.simple_factory;

import com.jackiew.design.pattern.creational.simple_factory.api.Api;
import com.jackiew.design.pattern.creational.simple_factory.api.ApiFactory;

public class Client {
    public static void main(String[] args) {
        Api api = ApiFactory.getApi();
        api.doSomething();
    }
}
