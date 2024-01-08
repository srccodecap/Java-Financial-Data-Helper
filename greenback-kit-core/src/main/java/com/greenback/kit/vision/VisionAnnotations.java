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

    public void setFullText(VisionAnnotation fullText) {
        this.fullText = fullText;
    }

    public List<VisionAnnotation> getTexts() {
        return texts;
    }

    public void setTexts(List<VisionAnnotation> texts) {
        this.texts = texts;
    }

    public List<VisionAnnotation> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<VisionAnnotation> symbols) {
        this.symbols = symbols;
    }
    
    public List<VisionImageAnnotation> getImages() {
        return images;
    }

    public void setImages(List<VisionImageAnnotation> images) {
        this.images = images;
    }

    public List<VisionPlaceAnnotation> getPlaces() {
        return places;
    }

    public void setPlaces(List<VisionPlaceAnnotation> places) {
        this.places = places;
    }

    public List<VisionTemporalAnnotation> getTemporals() {
        return temporals;
    }

    public void setTemporals(List<VisionTemporalAnnotation> temporals) {
        this.temporals = temporals;
    }

    public List<VisionPhoneAnnotation> getPhones() {
        return phones;
    }

    public void setPhones(List<VisionPhoneAnnotation> phones) {
        this.phones = phones;
    }

    public List<VisionMone