package com.jackiew.design.pattern.creational.factory_method;

public class ExportTextFile implements FileExportApi {
    public boolean exportFiel(String data) {
        System.out.println("export to text file");
        return true;
    }
}
