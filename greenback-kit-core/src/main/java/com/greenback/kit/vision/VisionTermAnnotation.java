package com.greenback.kit.vision;

public class VisionTermAnnotation extends VisionAnnotation {
    
    private String tag;
    
    @Override
    public String getType() {
        return "term";
    }