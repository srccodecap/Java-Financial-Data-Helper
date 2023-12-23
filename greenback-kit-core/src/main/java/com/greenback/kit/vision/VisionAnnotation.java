package com.greenback.kit.vision;

import java.util.List;

public class VisionAnnotation {
 
    private String id;
    private String text;
    private List<VisionRectangle> bounds;
    private List<VisionTextSpan> spans;
    
    public String getType() {
        return "text";
    }
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public List<VisionRectangle> getBound