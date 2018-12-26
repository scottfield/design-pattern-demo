package com.jackiew.design.pattern.creational.factory_method;

public class DbExportOperation extends ExportOperation {
    protected FileExportApi createExportApi() {
        return new ExportDb();
    }
}
