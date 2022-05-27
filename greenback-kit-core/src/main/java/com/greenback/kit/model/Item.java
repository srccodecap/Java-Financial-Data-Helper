package com.greenback.kit.model;

import java.util.List;
import java.util.Map;

public class Item {
 
    private String grn;
    private List<String> altGrns;
    private String name;
    private String description;
    private Double quantity;
    private Double unitPrice;
    private Double amount;
    private String taxGrn;
    protected Map<String,String> attributes;

    public String getGrn() {
        return grn;
    }

    public Item setGrn(String grn) {
        this.grn = grn;
        return this;
    }

    public List<String> getAltGrns() {
        return altGrns;
    }

    public Item setAltGrns(List<String> altGrns) {
        this.altGrns = altGrns;
        return this;
    }

    public String getName