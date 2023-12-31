package com.greenback.kit.vision;

import java.util.List;

public class VisionAnnotations {

    private VisionAnnotation fullText;
    private List<VisionAnnotation> texts;
    private List<VisionAnnotation> symbols;
    private List<VisionImageAnnotation> images;
    private List<VisionPlaceAnnotation> places;
    private List<VisionTemporalAnnotation> temporals;
    private List<VisionPhoneAnnotation> phones;
    private List<VisionMoneyAnnotation> moneys;
    private List<VisionTenderAnnotation> tenders;
    private List<VisionUrlAnnotation> urls;
    private List<VisionEmailAnnotation> emails;
    private List<VisionTermAnnotation> terms;
    
    public VisionAnnotation getFullText() {
        return fullText;
    }

    public void setFullText(VisionAnnotation fullTe