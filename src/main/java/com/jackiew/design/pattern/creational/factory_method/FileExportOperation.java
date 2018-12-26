package com.jackiew.design.pattern.creational.factory_method;

public class FileExportOperation extends ExportOperation {
    protected FileExportApi createExportApi() {
        return new ExportTextFile();
    }
}
