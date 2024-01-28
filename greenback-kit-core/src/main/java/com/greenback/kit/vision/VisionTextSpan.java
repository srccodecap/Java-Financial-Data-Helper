package com.greenback.kit.vision;

public class VisionTextSpan {
 
    private Integer s;
    private Integer e;

    public Integer getS() {
        return s;
    }

    public void setS(Integer s) {
        this.s = s;
    }

    public Integer getE() {
        return e;
    }

    public void setE(Integer e) {
        this.e = e;
    }
    
    @Override
    public String toString() {
        return this.s + "->" + this.e;
    }
    
    @Override
    pu