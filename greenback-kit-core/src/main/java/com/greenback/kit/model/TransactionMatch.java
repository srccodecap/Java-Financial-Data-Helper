package com.greenback.kit.model;

import java.util.List;

public class TransactionMatch {
 
    private Double score;
    private Boolean current;
    private List<String> messages;
    private Transaction document;

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
  