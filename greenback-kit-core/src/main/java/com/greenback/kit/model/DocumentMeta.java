package com.greenback.kit.model;

import java.util.List;

public class DocumentMeta {
 
    private Double progress;
    private List<String> warnings;
    private List<String> errors;

    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public List