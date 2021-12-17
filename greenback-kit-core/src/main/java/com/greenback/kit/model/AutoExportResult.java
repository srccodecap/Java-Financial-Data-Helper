package com.greenback.kit.model;

public class AutoExportResult {
    private Integer total;
    private Integer created;
    private Integer updated;
    private Integer unmapped;
    private Integer matched;
    private Integer failed;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

 