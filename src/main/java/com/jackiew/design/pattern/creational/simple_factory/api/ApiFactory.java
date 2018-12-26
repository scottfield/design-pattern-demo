package com.jackiew.design.pattern.creational.simple_factory.api;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class ApiFactory {
    private ApiFactory() {

    }

    private static Properties props = new Properties();

    static {
        InputStream is = ApiFactory.class.getResourceAsStream("ApiFactory.properties");
        try {
            props.load(is);
        } catch (IOException e) {
            System.out.println("failed to load factory configuration file");
            e.printStackTrace();
        }
    }

    public static Api getApi() {
        String apiCLass = props.getProperty("Api");
        Api api = null;
        try {
            Class<?> impCLass = ApiFactory.class.forName(apiCLass);
            api = (Api) impCLass.newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("cannot load specified class");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("do not have access to default constructor");
            e.printStackTrace();
        } catch (InstantiationException e) {
            System.out.println("create new instance failed");
            e.printStackTrace();
        }
        return api;
    }

}
