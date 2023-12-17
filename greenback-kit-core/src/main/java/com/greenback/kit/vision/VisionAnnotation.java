package com.greenback.kit.vision;

import java.util.List;

public class VisionAnnotation {
 
    private String id;
    private String text;
    private List<VisionRectangle> bounds;
    private List<VisionTextSpan> spans;
    
    public String getType() {
    