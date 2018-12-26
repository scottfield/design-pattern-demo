package com.jackiew.design.pattern.creational.factory_method;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        ExportOperation operation = new DbExportOperation();
        operation.export("test data");
        operation = new FileExportOperation();
        operation.export("test data");
        Map<String, Object> map = new HashMap<String, Object>();
        String test = "";
        test = (String) map.get("xxxx");
        System.out.println("test is" + test);
    }
}
