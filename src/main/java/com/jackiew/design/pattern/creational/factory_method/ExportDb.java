package com.jackiew.design.pattern.creational.factory_method;

public class ExportDb implements FileExportApi {
    public boolean exportFiel(String data) {
        System.out.println("export file to database");
        return true;
    }
}
