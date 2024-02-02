package com.greenback.kit.vision;

public class VisionUrlAnnotation extends VisionAnnotation {
    
    private String url;     // normalized version
    private String domain;

    @Override
    public String getType() {
        return "url";
    }
    
    public S