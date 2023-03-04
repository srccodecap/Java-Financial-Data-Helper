package com.greenback.kit.model;

public class TotalsItem {
    
    private TotalsItemType type;
    private String name;
    private Double amount;
    private String taxGrn;

    public TotalsItemType getType() {
        return type;
    }

    public TotalsItem setType(TotalsItemType type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public TotalsItem setName(String name) {
        this.name =