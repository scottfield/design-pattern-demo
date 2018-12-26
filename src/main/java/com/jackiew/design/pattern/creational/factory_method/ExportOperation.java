package com.jackiew.design.pattern.creational.factory_method;

public abstract class ExportOperation {
    protected abstract FileExportApi createExportApi();

    public void export(String data) {
        FileExportApi exportApi = createExportApi();
        exportApi.exportFiel(data);
    }
}
